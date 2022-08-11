const express = require("express");
const app = express();

app.get("/", (req,res)=>{
    res.send("Olá mundo")
})


app.get("/sobre",(req,res)=>{
    res.send("Estou na response sobre")
})
app.get("/blog",(req,res)=>{
    res.send("KKKKKK")
})

app.listen(8081, ()=>{
    console.log("Servidor Rodando na url http://localhost:8081")
})

