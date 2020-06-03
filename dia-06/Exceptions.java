import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        try {
            int numero = leitor.nextInt();
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

}