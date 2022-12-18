public class DeplacementCavalier {

    /**
     * @param echiquier
     * @param ligneDepart
     * @param colonneDepart
     * @param ligneArrivee
     * @param colonneArrivee
     * @return Vrai lorsque le cavalier peut se déplacer à la case de destination saisie, sinon retourne Faux
     */
    public static boolean cavalierPeutAller(int[][] echiquier, int ligneDepart, int colonneDepart, int ligneArrivee, int colonneArrivee) {

        if (echiquier[ligneDepart][colonneDepart] == 5 && echiquier[ligneArrivee][colonneArrivee] <= 0
                || echiquier[ligneDepart][colonneDepart] == -5 && echiquier[ligneArrivee][colonneArrivee] >= 0) {

            if (ligneArrivee == (ligneDepart - 2) && (colonneArrivee == (colonneDepart - 1) || colonneArrivee == (colonneDepart + 1))) {
                return true;
            } else if (ligneArrivee == (ligneDepart - 1) && (colonneArrivee == (colonneDepart - 2) || colonneArrivee == (colonneDepart + 2))) {
                return true;
            } else if (ligneArrivee == (ligneDepart + 1) && (colonneArrivee == (colonneDepart - 2) || colonneArrivee == (colonneDepart + 2))) {
                return true;
            } else if (ligneArrivee == (ligneDepart + 2) && colonneArrivee == (colonneDepart - 1) || colonneArrivee == (colonneDepart + 1)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Si cavalierPeutAllerCase (int[][] echiquier, int ligneDepart, int colonneDepart, int ligneArrivee, int colonneArrivee) = true
     * Cette méthode déplace la tour à la bonne place
     * @param echiquier
     * @param ligneDepart
     * @param colonneDepart
     * @param ligneArrivee
     * @param colonneArrivee
     *
     */
    public static void seDeplace(int[][] echiquier, int ligneDepart, int colonneDepart, int ligneArrivee, int colonneArrivee) {
        if (echiquier[ligneDepart][colonneDepart] == 5) {
            echiquier[ligneDepart][colonneDepart] = 0;
            echiquier[ligneArrivee][colonneArrivee] = 5;
        } else if (echiquier[ligneDepart][colonneDepart] == -5) {
            echiquier[ligneDepart][colonneDepart] = 0;
            echiquier[ligneArrivee][colonneArrivee] = -5;
        }
    }
  
     /**
     * 
     * @param echiquier
     * @param ligne
     * @param colonne
     * @return true si le roi est mis en échec, faux sinon
     */
    public static boolean cavalierMetEnEchecRoi(int[][] echiquier, int ligne, int colonne) {
        int roi;
        if (echiquier[ligne][colonne] == 5) {
            roi = -2;
        } else {
            roi = 2;
        }

        if (echiquier[ligne - 2][colonne - 1] == roi
                || echiquier[ligne - 2][colonne + 1] == roi
                || echiquier[ligne + 2][colonne - 1] == roi
                || echiquier[ligne + 2][colonne + 1] == roi) {
            return true;
        }
        if (echiquier[ligne - 1][colonne - 2] == roi
                || echiquier[ligne - 1][colonne + 2] == roi
                || echiquier[ligne + 1][colonne - 2] == roi
                || echiquier[ligne + 1][colonne + 2] == roi) {
            return true;
        }
        return false;
    }
}

