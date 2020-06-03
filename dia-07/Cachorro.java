
public class Cachorro extends Mamifero {

    private int dentes;

    // Métodos de ação
    public int getDentes() {
        return dentes;
    }

    public void setDentes(int dentes) {
        this.dentes = dentes;
    }

    // Emitir Som
    @Override
    public void emitir() {
        System.out.println("AU AU AU !");
    }

    // Método Contrutor
    public Cachorro(String sexo) {
        super(sexo);
    }

    public Cachorro(int dentes) {
        super();
        this.dentes = dentes;
    }

    public Cachorro(String sexo, int dentes) {
        super(sexo);
        this.dentes = dentes;
    }

}