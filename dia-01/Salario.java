import java.util.Scanner;

public class Salario {
    public static void main(String args[]) {

        // Declaração das Variaveis
        Scanner leitor = new Scanner(System.in);
        double salario, imposto, salLiq;
        // double salario = 0.0;
        // double imposto = 0.0;
        // double salLiq = 0.0;

        // Entrada de Dados
        System.out.print("Digite o salario do funcionario: ");
        salario = leitor.nextDouble();

        // Processamento
        imposto = salario * 0.15;
        salLiq = salario - imposto;

        // Saída de Resultados
        // System.out.println("Salario Bruto: " + salario);
        // System.out.println("Imposto: " + imposto);
        // System.out.println("Salario Liquido: " + salLiq);

        System.out.printf("Salario Bruto    R$ %10.2f \n", salario);
        System.out.printf("Imposto          R$ %10.2f \n", imposto);
        System.out.printf("Salario Liquido  R$ %10.2f \n", salLiq);

    }
}