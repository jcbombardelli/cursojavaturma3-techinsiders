public class Pato extends Ave implements IVoar, INadar {

    @Override
    public void voar() {
        System.out.println("Olha eu sei voar ");

    }

    @Override
    public void nadar() {
        System.out.println("Eu sei nadar");

    }

}