public class MainKylian{

    public static void main(String[] args) {

        int[][] echiquier = {
                {-6,-5,-4,-2,-3,-4,-5,-6},
                {-1,-1,-1,-1,-1,-1,-1,-1},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0, 1, 1, 1},
                {6, 5, 4, 3, 2, 4, 5, 6}
        };

        /*
        AffichageEchiquier.afficherEchiquier(echiquier);

        int[] tabDeplacements = {-1, -1, -1, -1};
        int joueur = 1;

        MethodesDeplacements.demandeDeplacements(echiquier, tabDeplacements, joueur);

        int ligneDepart = tabDeplacements[0];
        int colonneDepart = tabDeplacements[1];
        int ligneArrivee = tabDeplacements[2];
        int colonneArrivee = tabDeplacements[3];

        System.out.println("Ligne départ : " + ligneDepart);
        System.out.println("Colonne départ : " + colonneDepart);
        System.out.println("Ligne Arrivee : " + ligneArrivee);
        System.out.println("Colonne Arrivee : " + colonneArrivee);
        */
        int[][] echiquier1 = {
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0,-4, 0, 0, 0},
                { 0, 0, 0, 0, 0,-3, 0, 0},
                { 0, 0, 0, 2, 0, 0, 0, 0},
                { 0, 0, 0, 5, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0}
        };
        boolean choix1 = DeplacementRoi.roiPeutAllerCase(echiquier1,3,3,3,4);
        boolean choix2 = DeplacementRoi.roiPeutAllerCase(echiquier1,3,3,2,3);
        System.out.println(choix1 + " " + choix2);
    }
}
