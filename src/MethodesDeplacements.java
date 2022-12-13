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
}
