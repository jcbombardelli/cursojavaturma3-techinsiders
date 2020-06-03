public class Programa {

    public static void main(String[] args) {

        ICMS icms = new ICMS(5000);
        IPI ipi = new IPI(8700);
        IRRF irrf = new IRRF(50000);

        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        double resultadoICMS = calculadora.calcular(icms);
        double resultadoIPI = calculadora.calcular(ipi);
        double resultadoIRRF = calculadora.calcular(irrf);

        System.out.println("Resultado do ICMS --> " + resultadoICMS);
        System.out.println("Resultado do IPI --> " + resultadoIPI);

    }
}