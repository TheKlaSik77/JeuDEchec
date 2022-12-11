public class MainYasmine {
    public static void main(String[] args) {
        int[][] echiquier = AffichageEchiquier.creerEtRemplirEchiquier();
        System.out.println("-------------------------------------------------");
        AffichageEchiquier.affTab(echiquier);
        System.out.println("-------------------------------------------------");
        AffichageEchiquier.afficherEchiquier(echiquier);

    }
}
