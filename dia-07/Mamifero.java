public class Mamifero {

    // Propriedades
    private int patas;
    private String raca;
    private String nome;
    private String sexo;

    // Métodos de Acesso
    public void setPatas(int patas) {
        this.patas = patas;
    }

    public int getPatas() {
        return patas;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    // Métodos de ação
    // Emitir Som
    public void emitir() {
        System.out.println("Emitindo som");
    }

    // Método Contrutor
    public Mamifero(String sexo) {
        this.sexo = sexo;
    }
}