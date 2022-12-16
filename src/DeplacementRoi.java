public class DeplacementRoi {

    public static boolean peutRoque = true;

    public static void nePeutPlusRoque() {
        peutRoque = false;
    }

    /**
     * Teste pour un déplacement du roi s'il peut y aller et s'il est mis en échec
     * @param echiquier
     * @param ligneDepart
     * @param colonneDepart
     * @param ligneArrivee
     * @param colonneArrivee
     * @return
     */
    public static boolean roiPeutAller(int[][] echiquier, int ligneDepart, int colonneDepart, int ligneArrivee, int colonneArrivee){

        if (!(ligneArrivee == ligneDepart + 1 || ligneArrivee == ligneDepart - 1 || colonneArrivee == colonneDepart + 1 || colonneArrivee == colonneDepart - 1)){
            return false;
        }

        int[][] echiquierTemp = echiquier;
        echiquierTemp[ligneDepart][colonneDepart] = 0;
        echiquierTemp[ligneArrivee][colonneArrivee] = echiquier[ligneDepart][colonneDepart];

        if(echiquier[ligneDepart][colonneDepart] == 2) {
            for (int ligne = 0; ligne < echiquierTemp.length; ligne++) {
                for (int colonne = 0; colonne < echiquierTemp[ligne].length; colonne++) {
                    if (echiquierTemp[ligne][colonne] < 0) {
                        if (MethodesDeplacements.testPieceMetEnEchec(echiquierTemp, ligne, colonne)) {
                            return false;
                        }
                    }
                }
            }
        } else {
            for (int ligne = 0; ligne < echiquierTemp.length; ligne++) {
                for (int colonne = 0; colonne < echiquierTemp[ligne].length; colonne++) {
                    if (echiquierTemp[ligne][colonne] > 0) {
                        if (MethodesDeplacements.testPieceMetEnEchec(echiquierTemp, ligne, colonne)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void deplacerRoi(int[][] echiquier, int ligneDepart, int colonneDepart, int ligneArrivee, int colonneArrivee){

        if (echiquier[ligneDepart][colonneDepart] == 2){
            echiquier[ligneDepart][colonneDepart] = 0;
            echiquier[ligneArrivee][colonneArrivee] = 2;
        } else if (echiquier[ligneDepart][colonneDepart] == -2){
            echiquier[ligneDepart][colonneDepart] = 0;
            echiquier[ligneArrivee][colonneArrivee] = -2;
        }
    }

    public static boolean roiMetEnEchecRoi(int[][] echiquier, int ligne, int colonne){

        int roi;
        if (echiquier[ligne][colonne] == 2) { // Roi blanche
            roi = -2;
        } else {
            roi = 2;
        }

        if (echiquier[ligne+1][colonne] == roi || echiquier[ligne-1][colonne] == roi || echiquier[ligne][colonne+1] == roi || echiquier[ligne][colonne-1] == roi || echiquier[ligne+1][colonne+1] == roi || echiquier[ligne+1][colonne-1] == roi || echiquier[ligne-1][colonne+1] == roi || echiquier[ligne-1][colonne-1] == roi){
            return true;
        }
    }



}
