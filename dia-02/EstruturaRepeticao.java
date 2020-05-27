import java.util.Scanner;

public class EstruturaRepeticao {

    public static void main(String[] args) {
        // Tabuada a partir de um numero informado
        // Exibir a tabuada que vá do 0 ao 10

        Scanner leitor = new Scanner(System.in);

        // System.out.print("Digite o numero da tabuada: ");
        // int multiplicando = leitor.nextInt();

        // System.out.println(tabuada + " x 0 = " + (tabuada * 0));
        // System.out.println(tabuada + " x 1 = " + (tabuada * 1));
        // System.out.println(tabuada + " x 2 = " + (tabuada * 2));
        // System.out.println(tabuada + " x 3 = " + (tabuada * 3));
        // System.out.println(tabuada + " x 4 = " + (tabuada * 4));
        // System.out.println(tabuada + " x 5 = " + (tabuada * 5));
        // System.out.println(tabuada + " x 6 = " + (tabuada * 6));
        // System.out.println(tabuada + " x 7 = " + (tabuada * 7));
        // System.out.println(tabuada + " x 8 = " + (tabuada * 8));
        // System.out.println(tabuada + " x 9 = " + (tabuada * 9));
        // System.out.println(tabuada + " x 10 = " + (tabuada * 10));

        // for (int contador = 0; contador <= 1000; contador = contador + 1) {
        // int resultadoTabuada = numeroDigitado * contador;
        // System.out.println(numeroDigitado + " x " + contador + " = " +
        // resultadoTabuada);
        // }

        // primeiro elemento do laço FOR é um contador
        // segundo elemento do laço for é uma condição de parada
        // terceiro elemento do laço for é um operador incremento

        // int contador = 0;
        // if (contador <= 10) {
        // }
        // contador = contador + 1;

        // for (int multiplicador = 0; multiplicador <= 10; multiplicador =
        // multiplicador + 1) {
        // int produto = multiplicando * multiplicador;
        // System.out.println(multiplicando + " x " + multiplicador + " = " + produto);
        // }
        // int valores[] = new int[10];
        String listaDeNomes[] = new String[5];

        listaDeNomes[0] = "marcelo";
        listaDeNomes[1] = "luciana";
        listaDeNomes[2] = "luiz";
        listaDeNomes[3] = "marcela";
        listaDeNomes[4] = "jc";
        // listaDeNomes[5] = "josé"; // --java.lang.ArrayIndexOutOfBoundsException

        // System.out.println(listaDeNomes[0]);
        // System.out.println(listaDeNomes[1]);
        // System.out.println(listaDeNomes[2]);
        // System.out.println(listaDeNomes[3]);
        // System.out.println(listaDeNomes[4]);

        // Length se refere ao comprimento da LISTA (em numero inteiro)
        // for (int index = 0; index < listaDeNomes.length; index++) {
        // String nomeReservado = listaDeNomes[index];
        // nomeReservado = nomeReservado + " é programador java";
        // System.out.println("Nome Reservado -> " + nomeReservado);
        // }

        // Populando a lista 'valores'
        // for (int indexEscritaValores = 0; indexEscritaValores < valores.length;
        // indexEscritaValores++) {
        // valores[indexEscritaValores] = indexEscritaValores * 9;
        // }

        // Exibindo a lista de valores
        // for (int indexLeituraValores = 0; indexLeituraValores < valores.length;
        // indexLeituraValores++) {
        // System.out.println(
        // "Valor armazenado no indice -> " + indexLeituraValores + " -- " +
        // valores[indexLeituraValores]);
        // }
        double salarioAcumulado = 0.0;
        int mesesDoAno = 12;
        double listaDeSalariosPorMes[] = new double[12];

        System.out.print("Digite seu salario mensal :");
        double remuneracao = leitor.nextDouble();

        for (int mes = 0; mes < 12; mes++) {
            listaDeSalariosPorMes[mes] = remuneracao;
            System.out.println("Mês " + mes + " --> " + remuneracao);
        }

        for (int mes = 0; mes < 12; mes++) {
            salarioAcumulado += listaDeSalariosPorMes[mes];
            System.out.println("Acumulado do Mês " + mes + " --> " + salarioAcumulado);
        }

        System.out.println("Salario acumulado --> R$ " + salarioAcumulado);

    }

}