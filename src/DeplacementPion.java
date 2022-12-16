public class DeplacementPion {

    /**
     * @param echiquier
     * @param ligneDepart
     * @param colonneDepart
     * @param ligneArrivee
     * @param colonneArrivee
     * @return Vrai lorsque le pion peut se déplacer à la case de destination saisie, sinon retourne Faux
     */

    public static boolean pionPeutAllerCase(int[][] echiquier, int ligneDepart, int colonneDepart, int ligneArrivee, int colonneArrivee) {

        // cas déplacement standard
        if (colonneArrivee == colonneDepart && echiquier[ligneArrivee][colonneArrivee] == 0) {
            if (echiquier[ligneDepart][colonneDepart] == 1) {
                if (ligneDepart == 6 && ligneArrivee == (ligneDepart - 2)) { //cas avance de 2 cases
                    return true;
                } else if (ligneArrivee == (ligneDepart - 1)) { //cas avance de 1 case
                    return true;
                }
            }
            if (echiquier[ligneDepart][colonneDepart] == -1) {
                if (ligneDepart == 1 && ligneArrivee == (ligneDepart + 2)) {
                    return true;
                } else if (ligneArrivee == (ligneDepart + 1)) {
                    return true;
                }
            }
        }

        //cas manger diagonale
        if (echiquier[ligneDepart][colonneDepart] == 1) { // si pion blanc
            if (echiquier[ligneArrivee][colonneArrivee] != 0 && echiquier[ligneArrivee][colonneArrivee] < 0) {
                if (ligneArrivee == (ligneDepart - 1) && colonneArrivee == (colonneDepart + 1)) {//si à droite piece opposée dessus
                    return true;
                } else if (ligneArrivee == (ligneDepart - 1) && colonneArrivee == (colonneDepart - 1)) { // si à gauche piece opposée dessus
                    return true;
                }
            }
        }

        //cas manger diagonale
        if (echiquier[ligneDepart][colonneDepart] == -1) { // si pion noir
            if (echiquier[ligneArrivee][colonneArrivee] != 0 && echiquier[ligneArrivee][colonneArrivee] > 0) {
                // si à gauche piece opposée dessus
                if (ligneArrivee == (ligneDepart + 1) && colonneArrivee == (colonneDepart - 1)) { // si à droite piece opposée dessus
                    return true;
                } else return ligneArrivee == (ligneDepart + 1) && colonneArrivee == (colonneDepart + 1);
            }
        }
        return false;
    }

    public static void promotion(int[][] echiquier, int ligneDepart, int colonneDepart, int ligneArrivee, int colonneArrivee) {
        if (echiquier[ligneDepart][colonneDepart] == 1) {
            if (pionPeutAllerCase(echiquier, ligneDepart, ligneArrivee, colonneDepart, colonneArrivee) && ligneArrivee == 0) {
                echiquier[ligneDepart][colonneDepart] = 0;
                echiquier[ligneArrivee][colonneArrivee] = 3;
            }
        }
        if (echiquier[ligneDepart][colonneDepart] == -1) {
            if (pionPeutAllerCase(echiquier, ligneDepart, ligneArrivee, colonneDepart, colonneArrivee) && ligneArrivee == 7) {
                echiquier[ligneDepart][colonneDepart] = 0;
                echiquier[ligneArrivee][colonneArrivee] = -3;

            }

        }

    }


    /**
     * @param echiquier
     * @param ligneDepart
     * @param colonneDepart
     * @param ligneArrivee
     * @param colonneArrivee Si pionPeutAllerCase (int[][] echiquier, int ligneDepart, int colonneDepart, int ligneArrivee, int colonneArrivee) = true
     *                       Cette méthode déplace la tour à la bonne place
     */
    public static void deplacerPion(int[][] echiquier, int ligneDepart, int colonneDepart, int ligneArrivee, int colonneArrivee) {

        if (echiquier[ligneDepart][colonneDepart] == 1) {
            echiquier[ligneDepart][colonneDepart] = 0;
            echiquier[ligneArrivee][colonneArrivee] = 1;
        } else if (echiquier[ligneDepart][colonneDepart] == -1) {
            echiquier[ligneDepart][colonneDepart] = 0;
            echiquier[ligneArrivee][colonneArrivee] = -1;
        }
    }
}

