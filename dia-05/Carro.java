
public class Carro {

    // Propiedades
    private String cor;
    private int anoFabricacao;
    private int qtdPortas;
    private String combustivel;
    private String marca;
    private String placa;
    private int assentos;

    private double tanqueCombustivel;
    private double capacidadeTanqueCombustivel;

    private double velocidade;

    // Metodo de acesso SET
    public void setCor(String cor) {
        this.cor = cor;
    }

    // Metodo de acesso GET
    public String getCor() {
        return cor;
    }

    public void setAnoFabricacao(int novoAnoFabricacao) {
        anoFabricacao = novoAnoFabricacao;
    }

    public void setAssentos(int novosAssentos) {
        assentos = novosAssentos;
    }

    public void setCombustivel(String novoTipoCombustivel) {
        combustivel = novoTipoCombustivel;
    }

    public void setMarca(String novaMarca) {
        marca = novaMarca;
    }

    public void setPlaca(String novaPlaca) {
        placa = novaPlaca;
    }

    public void setQtdPortas(int novaQtdPortas) {
        qtdPortas = novaQtdPortas;
    }

    public void setTanqueCombustivel(double novoLimite) {
        tanqueCombustivel = novoLimite;
    }

    public void setVelocidade(double novaVelocidade) {
        velocidade = novaVelocidade;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public int getAssentos() {
        return assentos;
    }

    public double getCapacidadeTanqueCombustivel() {
        return capacidadeTanqueCombustivel;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public String getMarca() {
        return marca;
    }

    public String getPlaca() {
        return placa;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public double getTanqueCombustivel() {
        return tanqueCombustivel;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void acelerar(double porcentagem) {
        if (porcentagem >= 0.1) {
            if (velocidade < 1) {
                velocidade = 1;
                System.out.println("O Carro estava parado, começando aceleração");
            }
            velocidade += velocidade * (porcentagem / 100);
            System.out.println(" Velocidade atual: " + velocidade + " km/h");

        } else {
            System.out.println("aceleração não pode ser nula ou negativa");
        }

    }

    public double abastecer(double litros) {
        if ((litros + tanqueCombustivel) > capacidadeTanqueCombustivel) {
            System.out.println("Não é possivel abaster mais do que o limite do tanque");
        } else {
        }
        tanqueCombustivel += litros;
        return tanqueCombustivel;

    }

    public void frear(double porcentagem) {
        if (porcentagem > 0.1) {
            if (velocidade == 1) {
                velocidade -= velocidade * (porcentagem / 100);
                System.out.println(" Velocidade atual: " + velocidade + " km/h");
            }
            System.out.println("O Carro já estava parado");

        } else {
            System.out.println("desaceleração não pode ser nula ou negativa");
        }
    }

    public void virarCarro(String direcao) {
        System.out.println("Virando para a " + direcao);
    }

    public void acenderFarois() {
        System.out.println("Acendendo faróis");
    }

    public Carro() {
    }

    public Carro(double maxTanqueCombustivel) {
        capacidadeTanqueCombustivel = maxTanqueCombustivel;
    }

    public Carro(String marca, String cor, double tanque) {
        this.marca = marca;
        this.cor = cor;
        this.capacidadeTanqueCombustivel = tanque;
    }

    public Carro(String marca) {
        this.marca = marca;
        this.cor = "Preto";

    }

    // public Carro(double capacidadeTanqueCombustivel) {
    // this.capacidadeTanqueCombustivel = capacidadeTanqueCombustivel;
    // }

}