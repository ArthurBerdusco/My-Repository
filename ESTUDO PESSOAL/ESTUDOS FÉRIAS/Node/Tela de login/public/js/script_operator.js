document.addEventListener("keypress",function(e){
    if(e.key === "Enter"){
        adicionar()
    }
    });


function adicionar(){
    var nomeOperador = document.getElementById('nomeOperador').value
    var senhaOperador = document.getElementById('senhaOperador').value
    var empresa = document.getElementById('empresa').value
    var observacao = document.getElementById('observacao').value
    var privilegio = document.querySelector('input[name="privilegio"]:checked').value;


    fetch("/script_operador",{
        method:'POST',
        body: JSON.stringify({
            nomeOperador:nomeOperador,
            privilegio:privilegio,
            senhaOperador:senhaOperador,
            empresa:empresa,
            observacao:observacao,
            
        }) , 
        headers: { "Content-Type" : "application/json" }  
    })
}
