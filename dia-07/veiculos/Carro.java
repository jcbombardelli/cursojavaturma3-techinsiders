public class Carro {

    // Propriedades
    private double velocidade;
    private String tipoCombustivel;
    private double capacidadeMaximaCombustivel;
    private double tanqueCombustivel;
    private int assentos;

    // Métodos de Acesso
    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public double getCapacidadeMaximaCombustivel() {
        return capacidadeMaximaCombustivel;
    }

    public void setCapacidadeMaximaCombustivel(double capacidadeMaximaCombustivel) {
        this.capacidadeMaximaCombustivel = capacidadeMaximaCombustivel;
    }

    public double getTanqueCombustivel() {
        return tanqueCombustivel;
    }

    public void setTanqueCombustivel(double tanqueCombustivel) {
        this.tanqueCombustivel = tanqueCombustivel;
    }

    // Metodos de Ação
    public void acelerar() {
        System.out.println("Acelerando Carro");

    }

    public void frear() {
        System.out.println("Freando Carro");

    }

    public void virar(String direcao) {
        System.out.println("Virando carro para a " + direcao);

    }

    // Método Construtor
    public Carro() {

    }
}