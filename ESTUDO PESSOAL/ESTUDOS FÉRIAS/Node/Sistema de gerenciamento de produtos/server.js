const { appendFile } = require("fs");
const http = require("http");

http
    .createServer((request, response)=>{
        response.writeHead(200, { 'Content-Type': 'application/json' });

        if(request.url === '/produto'){
            return response.end(JSON.stringify({
                message: "Rota de produto",
            }));
        }

        if(request.url === '/usuario'){
            return response.end(JSON.stringify({
                message: "Rota de usuario",
            }));
        }

        return response.end(JSON.stringify({
            message: "Qualquer outra rota",
        }));

        
    })
    .listen(4002, () => console.log("Servidor está rodando na porta 4002"));

