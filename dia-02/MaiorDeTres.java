import java.util.Scanner;

public class MaiorDeTres {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        // A partir de três numeros digitados
        System.out.print("Digite o primeiro numero : ");
        double n1 = leitor.nextDouble();
        System.out.print("Digite o segundo numero : ");
        double n2 = leitor.nextDouble();
        System.out.print("Digite o terceiro numero : ");
        double n3 = leitor.nextDouble();

        // Indicar qual é o maior deles

        // Funciona mas tem problema de numeros iguais
        // if (n1 > n2 && n1 > n3) {
        // System.out.println("O maior é N1 --> " + n1);
        // } else if (n2 > n1 && n2 > n3) {
        // System.out.println("O maior é N2 --> " + n2);
        // } else if (n3 > n1 && n3 > n2) {
        // System.out.println("O maior é N3 --> " + n3);
        // }

        // Funciona mas depende de entendimento implicito
        // if (n1 > n2 && n1 > n3) {
        // System.out.println("O maior é --> " + n1);
        // } else if (n2 > n3) {
        // System.out.println("O maior é --> " + n2);
        // } else {
        // System.out.println("O maior é --> " + n3);
        // }
        double maior = n1;

        if (maior < n2) {
            maior = n2;
        }

        if (maior < n3) {
            maior = n3;
        }
        System.out.println("O maior é --> " + maior);

    }

}