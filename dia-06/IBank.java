import java.util.ArrayList;
import java.util.Scanner;

public class IBank {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        // ContaBancaria listaContas[] = new ContaBancaria[2];
        // int idDisponivel = 0;
        ArrayList<ContaBancaria> listaContas = new ArrayList<ContaBancaria>();
        int opcaoSelecionada;

        do {

            System.out.println("---Selecione no menu---");
            System.out.println("1 - Criar nova Conta");
            System.out.println("2 - Exibir dados da conta");
            System.out.println("3 - Transferir");
            opcaoSelecionada = leitor.nextInt();

            switch (opcaoSelecionada) {
                case 1:
                    try {

                        // Captura de dados no terminal
                        System.out.print("Digite o nome do novo correntista: ");
                        String novoNome = leitor.next();
                        System.out.print("Digite o seu saldo Inicial: ");
                        double saldoInicial = leitor.nextDouble();
                        System.out.print("Digite o numero da conta: ");
                        int numeroConta = leitor.nextInt();

                        // Instanciando objeto
                        ContaBancaria novaContaBancaria = new ContaBancaria(novoNome, saldoInicial, numeroConta);

                        listaContas.add(novaContaBancaria);
                        // listaContas[idDisponivel] = novaContaBancaria;
                        // idDisponivel++;

                    } catch (Exception e) {
                        System.out.println("Houve um erro no cadastro da Conta, tente novamente!");
                    }

                    break;
                case 2:

                    System.out.print("Digite o numero da conta que deseja exibir: ");
                    int contaSelecionada = leitor.nextInt();

                    boolean achou = false;
                    for (int index = 0; index < listaContas.size(); index++) {
                        ContaBancaria elemento = listaContas.get(index);

                        if (elemento.getNumero() == contaSelecionada) {
                            System.out.println("--------------------");
                            System.out.println(elemento.getNome());
                            System.out.println(elemento.getSaldo());
                            System.out.println(elemento.getNumero());
                            System.out.println("--------------------");
                            achou = true;
                        }

                    }
                    if (achou == false) {
                        System.out.println("Sua conta não foi encontrada...");
                    }

                    break;

                case 3:
                    System.out.print("Digite Conta Origem: ");
                    int origem = leitor.nextInt();

                    System.out.print("Digite Conta Destino: ");
                    int destino = leitor.nextInt();

                    if (origem != destino) {
                        // Captura da Conta Origem
                        ContaBancaria contaOrigem = null;
                        for (int i = 0; i < listaContas.size(); i++) {
                            ContaBancaria elemento = listaContas.get(i);
                            if (elemento.getNumero() == origem) {
                                contaOrigem = elemento;
                            }
                        }

                        if (contaOrigem != null) {

                            ContaBancaria contaDestino = null;
                            for (int i = 0; i < listaContas.size(); i++) {
                                ContaBancaria elemento = listaContas.get(i);
                                if (elemento.getNumero() == destino) {
                                    contaDestino = elemento;
                                }
                            }

                            if (contaDestino != null) {
                                System.out.println("Qual o valor que deseja transferir ?");
                                double valorTransacao = leitor.nextDouble();
                                contaOrigem.sacar(valorTransacao);
                                contaDestino.depositar(valorTransacao);

                            } else {
                                System.out.println("Não existe conta de destino");
                            }
                        } else {
                            System.out.println("Não existe conta de Origem");
                        }

                    } else {
                        System.out.println("Conta Origem e Destino não podem ser iguais");
                    }

                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção Invalida, selecione novamente");
                    break;
            }

        } while (opcaoSelecionada != 0);

    }
}