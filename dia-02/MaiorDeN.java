import java.util.Scanner;

public class MaiorDeN {

    // O usuario vai digitar quantos numeros ele quer comparar
    // O usuario vai digitar por N vezes (sendo o numero que ele escolheu)
    // Sistema comprar todos os numeros digitados, e encontrar o maior

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe a quantidade de vezes que deseja comparar: ");
        int qtdTotal = leitor.nextInt();
        int valores[] = new int[qtdTotal];

        System.out.println("QUANTIDADE DE ENTRADAS --> " + qtdTotal);
        System.out.println("---------------------------");

        for (int index = 0; index < qtdTotal; index++) {
            System.out.println("Digite o valor da lista " + (index + 1) + ": ");
            int valorDigitado = leitor.nextInt();
            valores[index] = valorDigitado;
            System.out.println(
                    "Valor Digitado foi e armazenado pa posicao " + index + " da lista foi --> " + valores[index]);
        }

        System.out.println("---------------------------");
        int maior = valores[0]; // 10
        for (int index = 0; index < valores.length; index++) {
            // if (maior < valores[index]) {
            System.out.println("Pergunta : " + valores[index] + " eh maior que " + maior + " ???");
            if (valores[index] > maior) {
                maior = valores[index];
                System.out.println("Valores[INDEX] EH maior do que a variavel maior ---- valores[index] = "
                        + valores[index] + " e maior = " + maior);
            } else {
                System.out.println("Valores[INDEX] NAO EH maior do que a variavel maior ---- valores[index] = "
                        + valores[index] + " e maior = " + maior);
            }
        }
        System.out.println("---------------------------");
        System.out.println("Maior numero --> " + maior);

    }

}