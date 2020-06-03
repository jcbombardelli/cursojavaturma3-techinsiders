import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        // System.out.print("Qual o sexo dos animais que deseja adotar: ");
        // String sexoEscolhido = leitor.next();

        // Cachorro novoCachorro = new Cachorro(sexoEscolhido);
        // Gato novoGato = new Gato(sexoEscolhido);

        // Polimorfismo
        // Mamifero novoMamifero = new Cachorro(sexoEscolhido);
        // Mamifero gato = new Gato(sexoEscolhido);

        // System.out.println("Parabéns você adotou um cachorro " +
        // novoCachorro.getSexo());
        // System.out.println("Parabéns você adotou um gato " + novoGato.getSexo());

        // novoCachorro.emitir();
        /// novoGato.emitir();

        // " CACHORRO "
        // novoMamifero.emitir();

        // Este código se trata de uma conversão dinamica (CAST) e
        // só deve ser usada em extrema necessidade
        // Sempre programa orientado as abstrações e não as implementações
        // System.out.println(((Cachorro) novoMamifero).getDentes());
        // gato.emitir();

        Pato patolino = new Pato();
        Avestruz avenilson = new Avestruz();

        patolino.voar();

        Tubarao tutubarao = new Tubarao();
        tutubarao.nadar();
        System.out.println(tutubarao.getPeso());
        patolino.nadar();

        INadar inadarTubarao = new Tubarao();
        inadarTubarao.nadar();

        nadarMuitoRapido(inadarTubarao);
    }

    public static void nadarMuitoRapido(INadar inadar) {
        inadar.nadar();
    }
}