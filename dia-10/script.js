console.log("Hello tech insiders");
console.log("Hoje é dia de javascript");

//var idade = prompt("Digite sua idade");
//console.log("Minha idade é de: " + idade);

function limpar() {
    document.getElementById("cpf").value = "";
}

//função em JS
function validaCPF() {
    console.log("Chamando Valida CPF");
    let cpfDigitado = document.getElementById("cpf").value;

    let resposta = validador(cpfDigitado)
    document.getElementById("respostaValidaCPF").innerHTML = "CPF Digitado é --> " + resposta

}

// Desenvolvimento
function validador(cpf) {

    if (cpf.length < 11) {
        console.log("CPF DEVE TER 11 CARACTERES")
        return false;
    }

    let digitos_iguais = 1;
    let index, numeros, digitos, soma, resultado;


    for (index = 0; index < cpf.length; index++) {
        if (cpf.charAt(index) != cpf.charAt(index + 1)) {
            digitos_iguais = 0;
            break;
        }
    }

    if (!digitos_iguais) {  // digitos_iguais == false
        numeros = cpf.substring(0, 9); //123345678
        digitos = cpf.substring(9);
        soma = 0;

        //inico da validacao do primeiro digito
        for (index = 10; index > 1; index--) {
            soma += numeros.charAt(10 - index) * index; // REGRA
        }

        resultado = soma % 11;
        if (resultado < 2) {
            resultado = 0; //REGRA 
        } else {
            resultado = 11 - resultado //REGRA
        }


        if (resultado != digitos.charAt(0)) { //REGRA
            return false
        }

        //fim da validação do primeiro digito

        // inicio da validacao do segundo digito
        numero = cpf.substring(0, 10) // 1233456780
        soma = 0;

        for (index = 11; index > 1; index--) {
            soma += numeros.charAt(11 - index) * index; // REGRA
        }

        // ternario
        // É O MESMO QUE IF ELSE
        resultado = (soma % 11) < 2 ? 0 : 11 - (soma % 11);

        if (resultado == digitos.charAt(1)) { //REGRA
            return false
        }

    }
    else {
        return false;
    }


    return true;

}

function carregarDados() {

    const id = document.getElementById("idperson").value;

    document.getElementById("loading").innerHTML = "Carregando.."
    console.log("inicio da funçao carregar dados")
    //Verbos HTTP
    // GET --> Recuperar itens
    // POST --> Enviar novos itens
    // PUT --> Atualizacao de itens pre existentes
    // DELETE --> Remove itens existentes
    const options = {
        method: "GET"
    }

    //const url = "https://swapi.dev/api/people/" + id + "/";
    const url = `https://swapi.dev/api/people/${id}/`;

    fetch(url, options)
        .then(function (response) {
            if (response.status == 200) {
                document.getElementById("loading").innerHTML = "";

                response.json()
                    .then(function (json) {
                        document.getElementById("nome").innerHTML = json.name
                    })
                    .catch(function (err) {
                        console.error(err)
                    })

            }
        })
        .catch(function (error) {
            console.error(error)
        })

    console.log("final da funçao carregar dados")

}

//Método em Java
//public boolean validaCPF(String cpf) {
//    return true;
//}