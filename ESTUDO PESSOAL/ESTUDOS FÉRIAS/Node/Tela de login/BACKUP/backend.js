const http = require('http')
const path = require('path')

const express =  require('express')
const fs = require("fs");
var session = require('express-session')


const app = express()
const server = http.createServer(app)

const {createPool} = require('mysql');
const pool = createPool({
host: "localhost",
user: "root",
password: "password",
database: "portifolio_arthur_sistema_acesso",
connectionLimit: 10
})


app.use(express.json());
app.use(express.urlencoded());
app.use(session({secret:"abc"}));

   // configuraçoes
   app.set('port', process.env.PORT || 4001)




// secção de login
app.use('/acesso-restrito/*', (req, res, next) => {
    if( req.session.nome ){
        next();
    }else{
        res.redirect('/index.html')
    }
      });


      // artigos estaticos
app.use(express.static(path.join(__dirname, 'public')))

//start do server
server.listen(app.get('port'), () => {
    console.log('server na porta', app.get('port'))
   
   
})


// secção de login backend request (recebe nome e senha) response(responde acesso ou não)


app.post('/login',(req, res) => {
    const usuarioscad =   fs.readFileSync('./usuarios.json')
    const usuariosparse = JSON.parse(usuarioscad)
    

    var nome = req.body.nomes
    var senha = req.body.senha


    var check = /^[A-Za-z]+$/; //Validador de caracter invalido no campo usuario



    for( var umUsuario of usuariosparse) {
        if(nome == umUsuario.nome && senha == umUsuario.senha && nome == nome.match(check)){
                req.session.nome = umUsuario
                res.send('f')
                return
        }else if(nome != nome.match(check)){
            res.send('caracter-invalido')
        }else{
            res.send('falhou')
        }
    }
})