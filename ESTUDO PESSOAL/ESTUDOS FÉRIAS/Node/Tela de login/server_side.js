const http = require('http')

const express =  require('express')

const app = express()
const server = http.createServer(app)

const path = require('path')

var session = require('express-session')


const  dbService = require('./database/dbService.js');

//APLICAÇÃO

app.use(express.json());
app.use(express.urlencoded());
app.use(session({secret:"abc"}));

//CONFIGURAÇÃO DO SERVIDOR E TELA PRINCIPAL DE LOGIN
app.set('port', process.env.PORT || 3005)


// secção de login
app.use('/acesso-restrito/*', (req, res, next) => {
    if( req.session.nome ){
        next();
    }else{
        res.redirect('/index.html')
    }
});


//PASTA PUBLIC ESTATICA
app.use(express.static(path.join(__dirname, 'public')))

//INICIAR SERVIDOR HTTP
server.listen(app.get('port'), () => {
    console.log('server na porta', app.get('port'))
})




// ******************* LOGIN BACK end *****************


// secção de login backend request (recebe nome e senha) response(responde status)


app.post('/login',(request, response) => {

	const nome = request.body.nome
	const senha = request.body.senha
	
	const db = dbService.getDbServiceInstance();

	const user = db.autenticationLogin(nome,senha);
	
	user
	.then(result => response.send(result))

	.catch(err => console.log(err))
	request.session.nome = true;
});



app.get('/getAll', (request, response) => {

	const db = dbService.getDbServiceInstance();

	const result = db.getAllData()
    
    result
    .then(data => response.json({data : data}))
    .catch(err => console.log(err));
})




app.post('/add_operator',(request,response)=>{

	const { nome } = request.body;
	const { senha } = request.body;
	const { empresa } = request.body;
	const { observacao } = request.body;
	const { privilegio } = request.body;

    const db = dbService.getDbServiceInstance();
    
    const result = db.insertNewOperator(nome, senha, empresa, observacao, privilegio);

    result
    .then(data => response.json({ data: data}))
    .catch(err => console.log(err));
});



app.delete('/delete/:id', (request, response) => {

	const {id} = request.params

	const db = dbService.getDbServiceInstance();
	const result = db.deleteRowByID(id)

	result
	.then(data => response.json({success : data}))
	.catch(err => console.log(err))
});




app.get('/search/:name', (request, response) => {

    const { name } = request.params;

    const db = dbService.getDbServiceInstance();
    const result = db.searchByName(name);
    
    result
    .then(data => response.json({data : data}))
    .catch(err => console.log(err));
})






