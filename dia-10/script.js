console.log("Hello tech insiders");
console.log("Hoje é dia de javascript");

//var idade = prompt("Digite sua idade");
//console.log("Minha idade é de: " + idade);

//função em JS
function validaCPF() {
    console.log("Chamando Valida CPF");
    let cpfDigitado = document.getElementById("cpf").value;

    let resposta = validador(cpfDigitado)

    document.getElementById("respostaValidaCPF").innerHTML = "CPF Digitado é --> " + resposta

}

// Desenvolvimento
function validador(cpf) {

    return true;

}

//Método em Java
//public boolean validaCPF(String cpf) {
//    return true;
//}