import java.util.Scanner;

public class DeplacementPion {


    /*
    verifier la validité du coup
    fonction peutManger

     */


    /**
     * @return la ligne saisie par l'utilisateur pour se déplacer
     */
    public static int saisieCoordonneeLigne() {
        Scanner sc = new Scanner(System.in);
        int saisieLigne;

        do {
            System.out.print("Entrer les coordonnées de la case : ");
            System.out.println("ligne:");
            saisieLigne = sc.nextInt();

        } while (saisieLigne > 7);

        return saisieLigne;
    }

    /**
     * @return la colonne saisie par l'utilisateur pour se déplacer
     */
    public static int saisieCoordonneeColonne() {
        Scanner sc = new Scanner(System.in);
        int saisieColonne;

        do {
            System.out.print("Entrer les coordonnées de la case : ");
            System.out.println("colonne:");
            saisieColonne = sc.nextInt();

        } while (saisieColonne > 7);

        return saisieColonne;
    }


    /**
     * @param echiquier
     * @param l         (coordonnée de la ligne)
     * @param c         (coordonnée de la colonne)
     * @return vrai si l et c valent 0
     */
    public static boolean caseVide(int[][] echiquier, int l, int c) {
        for (int ligne = 0; ligne < echiquier.length; ligne++) {
            for (int colonne = 0; colonne < echiquier[ligne].length; colonne++) {
                if (echiquier[l][c] == 0)
                    return true;
            }
        }
        return false;
    }

    /**
     * @param echiquier
     * @return vrai si le pion peut avancer de 2 cases
     */
    public static boolean avance2Cases(int[][] echiquier) {
        for (int ligne = 0; ligne < echiquier.length; ligne++) {
            for (int colonne = 0; colonne < echiquier[ligne].length; colonne++) {
                if (echiquier[6][colonne] == 1) {
                    return true;
                }
            }
        }

        return false;
    }
}

