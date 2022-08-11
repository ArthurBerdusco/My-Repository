const {createPool} = require('mysql');

const connection = createPool({
host: "localhost",
user: "root",
password: "password",
database: "portifolio_arthur_sistema_acesso",
connectionLimit: 10
})


class DbService{

	static getDbServiceInstance() {
        return new DbService();
    }

	async autenticationLogin(nome,senha){
		try{
			
			
			var form_user_check = /^[a-zA-Z0-9_.-]*$/
			const response = await new Promise((resolve,reject) =>{

				const query = 'SELECT * FROM operador WHERE nome_usuario = ? AND senha = ?'

				connection.query(query, [nome,senha], (err,result) => {
					if (err){ reject(new Error (err.message))};

					if (result.length >= 1 ){
						console.log(result[0].privilegio_acesso)

						if(result[0].privilegio_acesso == "Admin"){
							resolve("Admin")
						}else if(result[0].privilegio_acesso == "Sindico"){resolve("Sindico")
						}else if(result[0].privilegio_acesso == "Portaria"){resolve("Portaria")
						}else{resolve("Sem acesso")}
					}


					if (nome != nome.match(form_user_check)){reject("caracter-invalido")};
					if (result.length <= 0){reject("falhou")};
					
				});
			});
			return response
		}catch(error){
			console.log(error);
		}
	}

	async autenticationPrivilegio(privilegio, func_usuario){
		try{
			const status_priv = await new Promise((resolve, reject)=>{
				if(func_usuario !== privilegio){
					reject(console.log("Usuario não tem acesso"))
				}
				if(func_usuario == privilegio){resolve("Sindico")}
			
			});
			return status_priv
		}catch(error){
			console.log(error);
		}
	}

    async insertNewOperator(nome, senha, empresa, observacao, privilegio) {
        try {

            const insert_operator = await new Promise((resolve, reject) => {

				const data_criacao = new Date()
				const query = "INSERT INTO operador (nome_usuario, senha, empresa, observacao, privilegio_acesso, data_criacao) VALUES (?,?,?,?,?,?);";
                connection.query(query, [nome, senha, empresa, observacao, privilegio,data_criacao] , (err, result) => {
                    if (err) reject(new Error(err.message));
                    resolve(console.log("Operador inserido"))
                })
            });
            return insert_operator
        } catch (error) {
            console.log(error);
        }
    }

	async getAllData() {
        try {
            const response = await new Promise((resolve, reject) => {
                const query = "SELECT * FROM operador;";

                connection.query(query, (err, results) => {
                    if (err) reject(new Error(err.message));
                    resolve(results);
                })
            });
            //console.log(response);
            return response;
        } catch (error) {
            console.log(error);
        }
    }

	async deleteRowByID(id){
		try{
			
			const response = await new Promise((resolve,reject) =>{

				const query = 'DELETE FROM operador WHERE id_operador = ?;'

				connection.query(query, id, (err,result) => {
					if (err){ reject(new Error (err.message))};
					if (result){resolve(result.affectedRows)}
				});
			});
			return response
		}catch(error){
			console.log(error);
		}
	}

	async searchByName(nome){
		try{
			
			const response = await new Promise((resolve,reject) =>{

				const query = 'SELECT * FROM operador WHERE nome_usuario = ?;'

				connection.query(query, nome, (err,result) => {
					if (err){ reject(new Error (err.message))};
					if (result){resolve(result)}
				});
			});
			return response
		}catch(error){
			console.log(error);
		}
	}

}


module.exports = DbService;



