import java.util.Scanner;

public class MethodesDeplacements {

    /**
     * @return la ligne saisie par l'utilisateur pour se déplacer
     */
    public static int saisieCoordonneeLigne() {
        Scanner sc = new Scanner(System.in);
        int saisieLigne;

        do {
            System.out.print("Entrer les coordonnées de la case (entre 1 et 8) : ");
            System.out.println("ligne:");
            saisieLigne = sc.nextInt();

        } while (saisieLigne < 1 || saisieLigne > 8);

        return saisieLigne - 1;
    }

    /**
     * @return la colonne saisie par l'utilisateur pour se déplacer
     */
    public static int saisieCoordonneeColonne() {
        Scanner sc = new Scanner(System.in);
        int saisieColonne;

        do {
            System.out.print("Entrer les coordonnées de la case (entre 1 et 8) : ");
            System.out.println("colonne:");
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
