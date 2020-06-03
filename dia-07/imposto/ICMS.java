public class ICMS implements Imposto {

    private double valor;
    private final double ALIQUOTA = 0.10;// (10/100)

    @Override
    public double calcular() {
        return this.valor * ALIQUOTA;
    }

    public ICMS(double valor) {
        this.valor = valor;
    }

}