// Response server

// Realizar login com enter
document.addEventListener("keypress",function(e){
if(e.key === "Enter"){
    logar()
}
});


// Função principal de validação do login, com analise de caracter no campo usuário
function logar(){

    var nome = document.getElementById('nomes').value
    var senha = document.getElementById('senha').value

    fetch("/login",{
        method:'POST',
        body: JSON.stringify({
            nome : nome,
            senha : senha
        }) , 
        headers: { "Content-Type" : "application/json" }
        
    })

    .then(async (response) => {
        
        var status = await response.text();
        console.log(status)
        if(status == 'Admin' ){
            location.href = '/acesso-restrito/admin/controle-de-acesso.html'
        }
        if(status == 'Sindico' ){
            console.log(status)
            location.href = '/acesso-restrito/sindico/controle-de-acesso.html'
        }
        if(status == 'Portaria' ){
            location.href = '/acesso-restrito/portaria/controle-de-acesso.html'
        }
        if(status == 'caracter-invalido'){
            alert('Por favor digite seu usuario apenas com letras e numeros')
        }
        if(status == 'falhou'){
            alert('Nome ou senha invalido!!')
        }
        if(status == 'preencha'){
            alert("Por favor digite seu nome de usuario e senha.")
        }
        if(status == 'Sem acesso'){
            alert("Você não tem acesso.")
        }
    });
}



// OPERADOR

function procurar_nome(){
    const searchValue = document.querySelector('#search-input').value;
    console.log("Fiz algo no front")

    fetch('http://localhost:3005/search/' + searchValue)
    .then(response => response.json())
    .then(data => loadHTMLTable(data['data']));
}

document.addEventListener('DOMContentLoaded', function () {
    fetch('/getAll')
    .then(response => response.json())

    .then(data => loadHTMLTable(data['data']))   
});


function loadHTMLTable(data) {
    const table = document.querySelector('table tbody');

    if (data.length === 0) {
        table.innerHTML = "<tr><td class='no-data' colspan='5'>No Data</td></tr>";
        return;
    }


    let tableHtml = "";

    data.forEach(function ({id_operador, nome_usuario, empresa, observacao, privilegio_acesso, data_criacao}) {

        tableHtml += "<tr>";
        tableHtml += `<td>${id_operador}</td>`;
        tableHtml += `<td>${nome_usuario}</td>`;
        tableHtml += `<td>${empresa}</td>`;
        tableHtml += `<td>${observacao}</td>`;
        tableHtml += `<td>${privilegio_acesso}</td>`;
        tableHtml += `<td>${new Date(data_criacao).toLocaleDateString()}</td>`;
        tableHtml += `<td><button class="delete-row-btn" data-id=${id_operador}>Delete</td>`;
        tableHtml += `<td><button class="edit-row-btn" data-id=${id_operador}>Edit</td>`;
        tableHtml += "</tr>";
    });

    table.innerHTML = tableHtml;
}


function adicionar_operador(){
    
    let nome = document.getElementById('nomeOperador').value;
    let senha = document.getElementById('senhaOperador').value;
    let empresa = document.getElementById('empresa').value;
    let observacao = document.getElementById('observacao').value;
    let privilegio =document.querySelector('input[name="privilegio"]:checked').value;

    fetch("/add_operator",{
        method:'POST',
        body: JSON.stringify({
            nome : nome,
            senha : senha,
            empresa: empresa,
            observacao: observacao,
            privilegio : privilegio
        }), 
        headers: { "Content-Type" : "application/json" }  
    })
}



document.addEventListener('click', (event) => {
        if (event.target.className === "delete-row-btn") {
            deleteRowById(event.target.dataset.id);
        }
        if (event.target.className === "edit-row-btn") {
            handleEditRow(event.target.dataset.id);
        }
});



function deleteRowById(id){
    console.log(id)
    fetch('http://localhost:3005/delete/' + id,{
        method:'DELETE'
    })

    .then(response => response.json())
    .then(data => {
        if (data.success){
            location.reload();
        }
    });
}




function navegationClient(){
    location.href = '/acesso-restrito/admin/configurar-operador.html'
}
