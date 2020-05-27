public class EstruturaDecisaoII {

    public static void main(String[] args) {

        int numeroSelecionado = 3;

        // if (numeroSelecionado == 1) {
        // System.out.println("Ouviram dos ipiranga as margens placidas...");
        // } else if (numeroSelecionado == 2) {
        // System.out.println("Fique emcasa, estamos em quarentena");
        // } else if (numeroSelecionado == 3) {
        // System.out.println("CLoroquina não cura covid");
        // } else if (numeroSelecionado == 4) {
        // System.out.println("Estamos aprendendo Java");
        // } else if (numeroSelecionado == 5) {
        // System.out.println("Estamos no segundo dia de curso");
        // } else {
        // System.out.println(" voce selecionou uma opcao invalida");
        // }

        switch (numeroSelecionado) {
            case 1:
                System.out.println("Ouviram dos ipiranga as margens placidas...");
                break;
            case 2:
                System.out.println("Fique emcasa, estamos em quarentena");
                break;
            case 3:
                System.out.println("CLoroquina não cura covid");
                break;
            case 4:
                System.out.println("Estamos aprendendo Java");
                break;
            case 5:
                System.out.println("Estamos no segundo dia de curso");
                break;
            default:
                System.out.println(" voce selecionou uma opcao invalida");
                break;
        }

    }

}