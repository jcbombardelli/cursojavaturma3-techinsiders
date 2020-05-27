import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite as quatro notas do aluno: ");

        System.out.print("Digite primeira nota: ");
        double p1 = leitor.nextDouble();
        System.out.print("Digite segunda nota: ");
        double p2 = leitor.nextDouble();
        System.out.print("Digite terceira nota: ");
        double p3 = leitor.nextDouble();
        System.out.print("Digite quarta nota: ");
        double p4 = leitor.nextDouble();

        double media = (p1 + p2 + p3 + p4) / 4;

        System.out.printf("Calculo da média:  %10.2f \n", media);

        // Se a média é maior ou igual a 7
        // Resposta só pode ser verdadeira ou falsa
        if (media >= 7) {
            System.out.println("Aluno Aprovado!");
        } else {
            System.out.println("Aluno Reprovado!");
        }

    }
}