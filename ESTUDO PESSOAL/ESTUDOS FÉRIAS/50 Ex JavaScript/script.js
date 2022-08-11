


function addPalavra(){

  var palavra = ""
  let i = 0
  
  while(i < 1000){
    
    palavra = palavra + "<p" + i + ">" + i + "</p>";
    i = i + 2

  } return document.getElementById("resultado").innerHTML = palavra;

}


document.getElementById("btn").addEventListener("click", addPalavra)
