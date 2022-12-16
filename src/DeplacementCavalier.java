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
}

