public class IRRF implements Imposto {

    private double valor;
    private final double ALIQUOTA = 0.125;// (12.5/100)

    @Override
    public double calcular() {
        return this.valor * ALIQUOTA;
    }

    public IRRF(double valor) {
        this.valor = valor;
    }

}