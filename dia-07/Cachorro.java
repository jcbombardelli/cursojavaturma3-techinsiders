
public class Cachorro extends Mamifero {

    // Métodos de ação

    // Emitir Som
    @Override
    public void emitir() {
        System.out.println("AU AU AU !");
    }

    // Método Contrutor
    public Cachorro(String sexo) {
        super(sexo);
    }

}