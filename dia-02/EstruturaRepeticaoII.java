import java.util.Scanner;

public class EstruturaRepeticaoII {

    public static void main(String[] args) {

        int senha = 2020;
        int senhaDigitada = 0;

        Scanner leitor = new Scanner(System.in);
        boolean senhaIncorreta = true;

        while (senhaIncorreta == true) {
            System.out.print("DIGITE UMA SENHA: ");
            senhaDigitada = leitor.nextInt();

            if (senhaDigitada == senha) {
                System.out.println("Vc acertour a senha.. COFRE ABERTO!!!");
                senhaIncorreta = false;
            } else {
                System.out.println("Vc errou a senha... tenha novamente!!");
            }
        }
        System.out.println("Encerrando programa");

    }

}