import java.util.Scanner;

public class MethodesDeplacements {

    /**
     * @return la ligne saisie par l'utilisateur pour se déplacer
     */
    public static int saisieCoordonneeLigneDepart() {
        Scanner sc = new Scanner(System.in);
        int saisieLigne;

        do {
            System.out.print("Entrer les coordonnées de la ligne de la case de départ (entre 1 et 8) : ");
            saisieLigne = sc.nextInt();

        } while (saisieLigne < 1 || saisieLigne > 8);

        return saisieLigne - 1;
    }

    /**
     * Saisie une lettre en Maj ou en min et la fonction change cette lettre en int
     * @return la colonne saisie par l'utilisateur pour se déplacer
     */

    public static int saisieCoordonneeColonneDepart() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrer les coordonnées de la colonne de la case de départ (entre A et H) : ");
        String saisieColonne = sc.nextLine();
        saisieColonne = saisieColonne.toUpperCase();
        int nCase = saisieColonne.charAt(0) - 64;

        while (saisieColonne.length() > 1 || nCase < 1 || nCase > 8) {
            System.out.print("Erreur! Entrer les coordonnées de la colonne de la case de départ (entre A et H) : ");

            saisieColonne = sc.nextLine();
            saisieColonne = saisieColonne.toUpperCase();
            nCase = saisieColonne.charAt(0) - 64;
            // Permet de mettre les caractères en maj puis de calculer a quoi correspond la case par rapport au code ascii

        }

        return nCase - 1; // Renvoie le nCase - 1 car le tableau commence à 0
    }


    public static int saisieCoordonneeLigneArrivee() {
        Scanner sc = new Scanner(System.in);
        int saisieLigne;

        do {
            System.out.print("Entrer les coordonnées de la ligne de la case d'arrivée (entre 1 et 8) : ");
            saisieLigne = sc.nextInt();

        } while (saisieLigne < 1 || saisieLigne > 8);

        return saisieLigne - 1;
    }

    /**
     * @return la colonne saisie par l'utilisateur pour se déplacer
     */
    public static int saisieCoordonneeColonneArrivee() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrer les coordonnées de la colonne de la case d'arrivée (entre A et H) : ");
        String saisieColonne = sc.nextLine();
        saisieColonne = saisieColonne.toUpperCase();
        int nCase = saisieColonne.charAt(0) - 64;

        while (saisieColonne.length() > 1 || nCase < 1 || nCase > 8) {
            System.out.print("Erreur! Entrer les coordonnées de la colonne de la case d'arrivée (entre A et H) : ");

            saisieColonne = sc.nextLine();
            saisieColonne = saisieColonne.toUpperCase();
            nCase = saisieColonne.charAt(0) - 64;
            // Permet de mettre les caractères en maj puis de calculer a quoi correspond la case par rapport au code ascii

        }

        return nCase - 1; // Renvoie le nCase - 1 car le tableau commence à 0
    }


    /**
     * @param echiquier
     * @param ligne         (coordonnée de la ligne)
     * @param colonne        (coordonnée de la colonne)
     * @return vrai si l et c valent 0
     */
    public static boolean caseVide(int[][] echiquier, int ligne, int colonne) {
        if (echiquier[ligne][colonne] == 0)
            return true;
        else
            return false;
    }

    /**
     * Test si la case d'arrivée est occupée par un pion du même camp (true), par du vide ou un ennemie(false)
     * @param echiquier
     * @param ligneDepart
     * @param colonneDepart
     * @param ligneArrivee
     * @param colonneArrivee
     * @return
     */
    public static boolean testCaseArriveeDifferentCamp(int[][] echiquier, int ligneDepart, int colonneDepart, int ligneArrivee, int colonneArrivee){
        if (echiquier[ligneDepart][colonneDepart] > 0){
            return echiquier[ligneArrivee][colonneArrivee] <= 0;
        } else {
            return echiquier[ligneArrivee][colonneArrivee] >= 0;
        }
    }

    public static boolean testPieceMetEnEchec(int[][] echiquier, int ligne, int colonne){

        if (echiquier[ligne][colonne] == 6 || echiquier[ligne][colonne] == -6){
            return DeplacementTour.tourMetEnEchecRoi(echiquier,ligne,colonne);
        } else if (echiquier[ligne][colonne] == 5 || echiquier[ligne][colonne] == -5){
            return DeplacementCavalier.cavalierMetEnEchecRoi(echiquier,ligne,colonne);
        } else if (echiquier[ligne][colonne] == 4 || echiquier[ligne][colonne] == -4){
            return DeplacementFou.fouMetEnEchecRoi(echiquier,ligne,colonne);
        } else if (echiquier[ligne][colonne] == 3 || echiquier[ligne][colonne] == -3){
            return DeplacementDame.dameMetEnEchecRoi(echiquier,ligne,colonne);
        } else if (echiquier[ligne][colonne] == 1 || echiquier[ligne][colonne] == -1){
            return DeplacementPion.pionMetEnEchecRoi(echiquier,ligne,colonne);
        } else if (echiquier[ligne][colonne] == 2 || echiquier[ligne][colonne] == -2){
            return DeplacementRoi.roiMetEnEchecRoi(echiquier,ligne,colonne);
        }
        return false;
    }
}
