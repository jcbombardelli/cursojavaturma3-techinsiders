public class Programa {

    public static void main(String[] args) {

        CarroPasseio carroP = new CarroPasseio();
        carroP.setAssentos(5);

        CarroF1 carroF = new CarroF1();
        carroF.setAssentos(5);

        carroP.acelerar();
        carroF.acelerar();

    }

}