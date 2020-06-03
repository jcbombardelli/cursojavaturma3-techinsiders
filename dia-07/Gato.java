public class Gato extends Mamifero {

    // Métodos de ação
    @Override
    public void emitir() {
        System.out.println(" MIAAAU !");
    }

    // Método Contrutor
    public Gato(String sexo) {
        super(sexo);

    }
}