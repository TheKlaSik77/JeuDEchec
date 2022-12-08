import java.util.Scanner;

public class MethodesDeplacements {

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

        } while (saisieLigne < 0 || saisieLigne > 7);

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

        } while (saisieColonne < 0 || saisieColonne > 7);

        return saisieColonne;
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
