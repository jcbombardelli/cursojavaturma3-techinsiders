import java.util.Scanner;

public class PrimeiroPrograma {

    public static void main(String args[]) {
        // System.out.println("Olá Tech Insiders");

        // int valorDaMinhaNotaNaProva = 10;
        // System.out.println(valorDaMinhaNotaNaProva);

        // float y = 1.2f;
        // double z = 20.3;
        // System.out.println(z);

        // String nomeDoCurso = "Curso Java Tech Insiders 2020";
        // System.out.println(nomeDoCurso);

        // boolean ehVerdadeiro = true;
        // System.out.println(ehVerdadeiro);

        // double resultado = valorDaMinhaNotaNaProva * z;
        // System.out.println(resultado);

        // System.out.println("Valor da nota: " + valorDaMinhaNotaNaProva);

        Scanner leitor = new Scanner(System.in);
        // System.out.println("Digite seu nome: ");
        // String meuNome = leitor.nextLine();
        // System.out.println("Olá, seja bem vindo: " + meuNome);

        System.out.print("Digite um numero: ");
        double primeiroValor = leitor.nextDouble();

        System.out.print("Digite outro numero: ");
        double segundoValor = leitor.nextDouble();

        // double resultadoSoma = primeiroValor + segundoValor;
        // double resultadoSub = primeiroValor - segundoValor;
        // double resultadoDiv = primeiroValor * segundoValor;
        // double resultadoMult = primeiroValor / segundoValor;

        // System.out.println("O resultado da soma é: " + resultadoSoma);

        Matematica bibliotecaMatematica = new Matematica();

        double valor1 = primeiroValor;
        double valor2 = segundoValor;

        double resultSoma = bibliotecaMatematica.soma(valor1, valor2);
        double resultSub = bibliotecaMatematica.subtracao(valor1, valor2);
        double resultMult = bibliotecaMatematica.multiplicacao(valor1, valor2);
        double resultDiv = bibliotecaMatematica.divisao(valor1, valor2);

        int paramA = (int) valor1;
        int paramB = (int) valor2;
        int restoDiv = bibliotecaMatematica.restoDivisao(paramA, paramB);

        System.out.println(paramA / paramB);
        System.out.println(restoDiv);
    }
}