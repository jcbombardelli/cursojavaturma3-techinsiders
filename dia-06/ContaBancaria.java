public class ContaBancaria {

    // Propriedades
    private String nome;
    private double saldo;
    private int numero;

    // Métodos de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    // Métodos de ação (opcional)
    public void depositar(double valorDepositado) {
        this.saldo += valorDepositado;
    }

    public void sacar(double valorSacado) {
        this.saldo -= valorSacado;
    }

    // Métodos Construtores (opcional)
    public ContaBancaria() {

    }

    public ContaBancaria(String nome, double saldo, int numero) {
        this.nome = nome;
        this.saldo = saldo;
        this.numero = numero;
    }

}