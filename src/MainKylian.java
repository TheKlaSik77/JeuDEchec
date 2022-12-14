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


        AffichageEchiquier.afficherEchiquier(echiquier);

        if (DeplacementTour.tourPeutAllerCase(echiquier, 7, 0, 4, 0)){
            DeplacementTour.deplacerTour(echiquier, 7, 0, 4, 0);
        }

        AffichageEchiquier.afficherEchiquier(echiquier);

        System.out.println("\n\n\n\n");
        if (DeplacementFou.fouPeutAllerCase(echiquier, 7, 5, 4, 2)){
            DeplacementFou.deplacerFou(echiquier, 7, 5, 4, 2);
        }

        AffichageEchiquier.afficherEchiquier(echiquier);


    }
}
