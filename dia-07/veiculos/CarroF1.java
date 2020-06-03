public class CarroF1 extends Carro {

    @Override
    public void acelerar() {
        System.out.println("ACELERANDO CARRO DE FORMULA 1");

    }

    @Override
    public void setAssentos(int assentos) {
        super.setAssentos(1);
    }

    // Método Construtor
    public CarroF1() {

    }

}