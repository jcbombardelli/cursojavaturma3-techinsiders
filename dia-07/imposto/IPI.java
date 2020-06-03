public class IPI implements Imposto {

    private double valor;
    private final double ALIQUOTA = 0.18;// (18/100)

    @Override
    public double calcular() {
        return this.valor * ALIQUOTA;
    }

    public IPI(double valor) {
        this.valor = valor;
    }

}