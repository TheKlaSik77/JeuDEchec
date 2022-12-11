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
     * @return la colonne saisie par l'utilisateur pour se déplacer
     */
    public static int saisieCoordonneeColonneDepart() {
        Scanner sc = new Scanner(System.in);
        int saisieColonne;

        do {
            System.out.print("Entrer les coordonnées de la colonne de la case de départ (entre 1 et 8) : ");

            saisieColonne = sc.nextInt();

        } while (saisieColonne < 1 || saisieColonne > 8);

        return saisieColonne - 1;
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
        int saisieColonne;

        do {
            System.out.print("Entrer les coordonnées de la colonne de la case d'arrivée (entre 1 et 8) : ");

            saisieColonne = sc.nextInt();

        } while (saisieColonne < 1 || saisieColonne > 8);

        return saisieColonne - 1;
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
