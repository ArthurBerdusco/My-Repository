/* 

variavel global

funcao local sem condicao = recebe um valor e modifica ele globalmente

funcao local com condicao = recebe um valor e não modifica a variavel global


*/


/* ---------------Exemplo 1 funcao recebendo variavel--------------- */


let variavel = 'hello world'


function pensamento(variavel) {
    variavel = 'ola mundo'
    return variavel
}

console.log(variavel)
console.log(pensamento(variavel))
console.log(variavel)
/* ---------------Exemplo 2 funcao não recebe variavel--------------- */

let think = 'global'


function pensamento2() {
    think = 'local'
    return think
}

console.log(think)
console.log(pensamento2(think))
console.log(think)


// Arrow function

const sayMyName = () =>{
    console.log('Arthur')
}

sayMyName()

console.log('=================================')
console.log('=================================')
// calback function



 
setTimeout(()=>{
    console.log("Essa mensagem é exibida depois de 3 segundos");
}, 5000);

