import java.util.Scanner;

/**
 * Programa
 */
public class Programa {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int opcaoSelecionada = 0;

        int maximoContas = 5;
        int contas[] = new int[maximoContas];
        double saldos[] = new double[maximoContas];

        // sequence é o termo usado em bancos de dados
        int idDisponivel = 0;

        do {

            System.out.println("Menu ------");
            System.out.println("1 - Criar Conta");
            System.out.println("2 - Saldo");
            System.out.println("0 - Saida");
            opcaoSelecionada = leitor.nextInt();

            switch (opcaoSelecionada) {
                case 1:

                    int numeroConta = 0;
                    do {
                        System.out.print("Digite o numero da conta: ");
                        numeroConta = leitor.nextInt();

                        if (numeroConta > 0) {
                            contas[idDisponivel] = numeroConta;
                        } else {
                            System.out.println("Numero de conta invalido, digite novamente");
                        }

                    } while (numeroConta < 1);

                    System.out.print("Digite o saldo Inicial: ");
                    double saldoInicial = leitor.nextDouble();

                    saldos[idDisponivel] = saldoInicial;

                    idDisponivel++;

                    break;
                case 2:

                    System.out.println("Selecione uma conta da lista: ");
                    for (int index = 0; index < saldos.length; index++) {
                        if (contas[index] > 0) {
                            System.out.println(index + " - " + contas[index]);
                        }
                    }

                    int contaSelecionada = leitor.nextInt();

                    System.out.println("Seu saldo para a conta: " + contas[contaSelecionada] + " eh de: "
                            + saldos[contaSelecionada]);

                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção Incorreta, Selecione Novamente!");
                    break;
            }

        } while (opcaoSelecionada != 0);

    }
}