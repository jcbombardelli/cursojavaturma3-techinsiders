public class Tubarao implements INadar {

    private double peso;

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public void nadar() {
        System.out.println("Eu sei nada muito rapído");
    }
}