const express = require("express");
const { randomUUID } = require("crypto")
const fs = require("fs");

const app = express();

app.use(express.json());


let products = [];

fs.readFile("products.json", "utf-8", (err, data) => {
    if(err){
        console.log(err)
    }else{
        products = JSON.parse(data);
    }
})

/* 
* POST => Inserir um dado
* GET => Buscar um dado >>Somente está conseguimos fazer pelo browser<<
* PUT => Alterar um dado
* DELETE => Remover um dado
*/

/* 

Recebendo a requisição(request):

* Body => Sempre que eu quiser enviar dados para minha aplicação

* Params => /product/8123671236

* Query => /product?id233t6466627

*/


app.post("/products", (request, response) =>{
    //Nome e preço => name e price

    const { name, price } = request.body;

    const product = {
        name,
        price,
        id: randomUUID(),
    };

    products.push(product);


    alterProductFile();

    return response.json(product);
});

app.get("/products",(request, response) =>{
    return response.json(products);
})


app.get("/products/:id", (request,response) =>{
    const { id } = request.params;
    const product = products.find(product => product.id === id);
    return response.json(product);
})



app.put("/products/:id", (request, response) =>{
    const { id } = request.params;
    const { name, price } = request.body;

    const productIndex = products.findIndex((product) => product.id === id);
    products[productIndex] = {
        ...products[productIndex],
        name,
        price

    };

    return response.json({message: "Produto alterado com sucesso"});
});





app.delete("/products/:id",(request, response) =>{
    const { id } = request.params;

    const productIndex = products.findIndex((products) => products.id === id);

    products.splice(productIndex, 1);
    
    alterProductFile();

    return response.json({message: "Produto removido com sucesso!"});

});


function alterProductFile(){
    fs.writeFile("products.json", JSON.stringify(products), (err) => {
        if(err) {
            console.log(err)
        }else {
            console.log("Producto inserido");
        }
    });
}




app.listen(4003, () => console.log("Servidor está rodando na porta 4003!"));