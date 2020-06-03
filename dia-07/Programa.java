import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual o sexo dos animais que deseja adotar: ");
        String sexoEscolhido = leitor.next();

        Cachorro novoCachorro = new Cachorro(sexoEscolhido);
        Gato novoGato = new Gato(sexoEscolhido);

        System.out.println("Parabéns você adotou um cachorro " + novoCachorro.getSexo());
        System.out.println("Parabéns você adotou um gato " + novoGato.getSexo());

        novoCachorro.emitir();
        novoGato.emitir();

    }

}