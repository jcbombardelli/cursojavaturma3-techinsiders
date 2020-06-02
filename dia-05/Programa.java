import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Carro novoCarro = new Carro();
        Carro meuCarro = new Carro(50);
        Carro carroAzul = new Carro("Fiat", "Azul", 40);

        Carro carroAmarelo = new Carro("Fiat", null, 40);
        Carro carroPreto = new Carro("Ford");

        System.out.println(carroPreto.getCor());

        int breakpoint = 0;
        // int opcaoSelecionada;

        // do {

        // System.out.println("1 - Alterar Cor");
        // System.out.println("2 - Acelerar");
        // System.out.println("3 - Frear");
        // System.out.println("4 - Abastecer");
        // System.out.println("5 - Acender faróis");
        // System.out.println("6 - Apagar faróis");
        // System.out.println("9 - Painel do Carro");
        // System.out.println("0 - Sair");

        // opcaoSelecionada = leitor.nextInt();

        // switch (opcaoSelecionada) {
        // case 1:
        // System.out.print("Digite qual a nova cor: ");
        // String novaCor = leitor.next();
        // novoCarro.setCor(novaCor);
        // System.out.println("A nova cor do carro é " + novoCarro.getCor());
        // break;
        // case 2:
        // System.out.print("Digite quantos porcento deseja aumentar a aceleração: ");
        // double percent = leitor.nextDouble();
        // novoCarro.acelerar(percent);
        // System.out.println("A nova cor do carro é " + novoCarro.getCor());
        // break;

        // default:
        // break;
        // }

        // } while (opcaoSelecionada != 0);

    }

}