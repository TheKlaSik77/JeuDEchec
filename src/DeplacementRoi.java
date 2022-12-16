public class DeplacementRoi {

    public static boolean peutRoque = true;

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

        for (int ligne = 0 ; ligne < echiquierTemp.length ; ligne++){
            for (int colonne = 0 ; colonne < echiquierTemp[ligne].length ; colonne++){
                if (echiquierTemp[ligne][colonne] < 0){
                    if(MethodesDeplacements.testPieceMetEnEchec(echiquierTemp,ligne,colonne)){
                        return false;
                    }
                }
            }
        }

    }



}
