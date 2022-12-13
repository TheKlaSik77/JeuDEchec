public class DeplacementPion {

    /**
     * @param echiquier
     * @return vrai si le pion peut avancer de 2 cases
     */
    public static boolean Peutavancer2Cases(int[][] echiquier, int colonne) {
        //si pion blanc ou noir (placé au positionnement initial)
        return echiquier[6][colonne] == 1 || echiquier[1][colonne] == -1;
    }

    public static boolean PeutAvancer1Case(int[][] echiquier, int ligneArrivee, int colonneArrivee) {
        if (MethodesDeplacements.caseVide(echiquier, ligneArrivee, colonneArrivee)) ;
        return true;
    }

    /**
     * @param echiquier
     * @param ligneDepart
     * @param colonneDepart
     * @param ligneArrivee
     * @param colonneArrivee
     * @return vrai si le pion peut manger une pièce
     */
    public static boolean peutMangerPiece(int[][] echiquier, int ligneDepart, int colonneDepart, int ligneArrivee, int colonneArrivee) {
        if (echiquier[ligneDepart][colonneDepart] == 1) { // si pion blanc
            if (!MethodesDeplacements.caseVide(echiquier, ligneArrivee, colonneArrivee) && echiquier[ligneArrivee][colonneArrivee] > 0) { // si ligne arrivee et colonne arrivee non vide et piece opposée dessus
                if (echiquier[ligneDepart - 1][colonneDepart + 1] > 0) { // si à droite piece opposée dessus
                    return true; // peut manger
                } else if (echiquier[ligneDepart - 1][colonneDepart - 1] > 0) { // si à gauche piece opposée dessus
                    return true;
                }
            }
        }
        if (echiquier[ligneDepart][colonneDepart] == -1) { // si pion noir
            if (!MethodesDeplacements.caseVide(echiquier, ligneArrivee, colonneArrivee) && echiquier[ligneArrivee][colonneArrivee] < 0) { // si ligne arrivee et colonne arrivee non vide et piece opposée dessus
                // si à droite piece opposée dessus
                if (echiquier[ligneDepart + 1][colonneDepart - 1] < 0) { // si à droite piece opposée dessus
                    return true;
                } else return echiquier[ligneDepart - 1][colonneDepart + 1] < 0;
            }
        }
        return false;
    }

    /**
     * @param echiquier
     * @param ligneDepart
     * @param colonneDepart
     * @param ligneArrivee
     * @param colonneArrivee Procédure qui déplace le pion à la bonne place
     */
    public static void deplacerPion(int[][] echiquier, int ligneDepart, int colonneDepart, int ligneArrivee, int colonneArrivee) {

        // pour le pion blanc
        if (echiquier[ligneDepart][colonneDepart] == 1) {
            if (Peutavancer2Cases(echiquier, 6)) {
                echiquier[ligneDepart - 2][colonneDepart] = 1;
                echiquier[ligneDepart][colonneDepart] = 0;
            } else {
                if (PeutAvancer1Case(echiquier, ligneArrivee, colonneArrivee))
                    echiquier[ligneDepart - 1][colonneDepart] = 1;
                    echiquier[ligneDepart][colonneDepart] = 0;
            }

            if (peutMangerPiece(echiquier, ligneDepart, ligneArrivee, colonneDepart, colonneArrivee)) {
                echiquier[ligneDepart - 1][colonneDepart + 1] = 1;
                echiquier[ligneDepart][colonneDepart] = 0;
            } else {
                echiquier[ligneDepart - 1][colonneDepart - 1] = 1;
                echiquier[ligneDepart][colonneDepart] = 0;
            }

            // pour le pion noir
        } else if (echiquier[ligneDepart][colonneDepart] == -1) {
            if (Peutavancer2Cases(echiquier, 1)) {
                echiquier[ligneDepart + 2][colonneDepart] = 1;
                echiquier[ligneDepart][colonneDepart] = 0;
            } else {
                if (PeutAvancer1Case(echiquier, ligneArrivee, colonneArrivee))
                    echiquier[ligneDepart + 1][colonneDepart] = 1;
                echiquier[ligneDepart][colonneDepart] = 0;
            }
            if (peutMangerPiece(echiquier, ligneDepart, ligneArrivee, colonneDepart, colonneArrivee)) {
                echiquier[ligneDepart + 1][colonneDepart - 1] = -1;
                echiquier[ligneDepart][colonneDepart] = 0;
            } else {
                echiquier[ligneDepart - 1][colonneDepart + 1] = -1;
                echiquier[ligneDepart][colonneDepart] = 0;
            }

        }
    }

}

