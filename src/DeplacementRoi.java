public class DeplacementRoi {

    public static boolean peutPetitRoqueBlanc = true;
    public static boolean peutPetitRoqueNoir = true;
    public static boolean peutGrandRoqueBlanc = true;
    public static boolean peutGrandRoqueNoir = true;

    public static void nePeutPlusGrandRoque(int joueur) {

        if (joueur == 1){
            peutGrandRoqueBlanc = false;
        } else if(joueur == 2){
            peutGrandRoqueNoir = false;
        }
    }
    public static void nePeutPlusPetitRoque(int joueur) {

        if (joueur == 1){
            peutPetitRoqueBlanc = false;
        } else if(joueur == 2){
            peutPetitRoqueNoir = false;
        }
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
    public static boolean roiPeutAllerCase(int[][] echiquier, int ligneDepart, int colonneDepart, int ligneArrivee, int colonneArrivee){

        //Gerer Cas Roque:
        /*
        Tester si peutRoque en fonction de la piece sur les coordonnées de départ et Tester si cases entre vides

         */

        if (!((ligneArrivee >= ligneDepart - 1 && ligneArrivee <= ligneDepart + 1) && (colonneArrivee >= colonneDepart - 1 && colonneArrivee <= colonneDepart + 1))){

            return false;
        }
        if (!MethodesDeplacements.testCaseArriveeDifferentCamp(echiquier, ligneDepart, colonneDepart, ligneArrivee, colonneArrivee)){

            return false;
        }
        int[][] echiquierTemp = new int[8][8];
        for (int ligne = 0 ; ligne < echiquierTemp.length ; ligne++) {
            for (int colonne = 0; colonne < echiquierTemp[ligne].length; colonne++) {
                echiquierTemp[ligne][colonne] = echiquier[ligne][colonne];
            }
        }
        // On déplace le roi dans l'échiquier temporaire pour tester si échec
        echiquierTemp[ligneArrivee][colonneArrivee] = echiquier[ligneDepart][colonneDepart];

        echiquierTemp[ligneDepart][colonneDepart] = 0;

        // On teste si une des pièces adverses met en échec le roi
        for (int ligne = 0 ; ligne < echiquierTemp.length ; ligne++){
            for (int colonne = 0 ; colonne < echiquierTemp[ligne].length ; colonne++){
                if (echiquierTemp[ligneArrivee][colonneArrivee] == 2){
                    if (echiquierTemp[ligne][colonne] < 0){
                        if (MethodesDeplacements.testPieceMetEnEchec(echiquierTemp,ligne,colonne)){


                            return false;
                        }
                    }
                } else if (echiquierTemp[ligneArrivee][colonneArrivee] == -2) {
                    if (echiquierTemp[ligne][colonne] > 0){
                        if (MethodesDeplacements.testPieceMetEnEchec(echiquierTemp,ligne,colonne)){


                            return false;
                        }
                    }
                }
            }
        }

        return true;

    }

    public static void deplacerRoi(int[][] echiquier, int ligneDepart, int colonneDepart, int ligneArrivee, int colonneArrivee){
        // Cas a part de déplacement petit roque ou grand roque

        if (echiquier[ligneDepart][colonneDepart] == 2){
            echiquier[ligneDepart][colonneDepart] = 0;
            echiquier[ligneArrivee][colonneArrivee] = 2;
        } else if (echiquier[ligneDepart][colonneDepart] == -2){
            echiquier[ligneDepart][colonneDepart] = 0;
            echiquier[ligneArrivee][colonneArrivee] = -2;
        }
        if (echiquier[ligneDepart][colonneDepart] == 2){
            nePeutPlusPetitRoque(1);
            nePeutPlusGrandRoque(1);
        } else if (echiquier[ligneDepart][colonneDepart] == -2){
            nePeutPlusPetitRoque(2);
            nePeutPlusGrandRoque(2);

        }
    }

    public static boolean roiMetEnEchecRoi(int[][] echiquier, int ligne, int colonne){

        int roi;
        if (echiquier[ligne][colonne] == 2) { // Roi blanc
            roi = -2;
        } else {
            roi = 2;
        }

        if ((ligne + 1 <= 7 && ligne - 1 >= 0 && colonne + 1 <= 7 && colonne - 1 >= 0) && (echiquier[ligne+1][colonne] == roi || echiquier[ligne-1][colonne] == roi || echiquier[ligne][colonne+1] == roi || echiquier[ligne][colonne-1] == roi || echiquier[ligne+1][colonne+1] == roi || echiquier[ligne+1][colonne-1] == roi || echiquier[ligne-1][colonne+1] == roi || echiquier[ligne-1][colonne-1] == roi)){
            return true;
        }
        return false;
    }

    /**
     * Teste si le roi de joueur est echec et mat (Attention, ne teste pas si la position initiale est en échec, il faudra tester ça dans le déroulement car cette fonction sert aussi pour savoir si la partie est nulle).
     * @param echiquier
     * @param joueur
     * @return
     */

    public static boolean estEchecEtMat(int[][] echiquier, int joueur){
        int roi = -2;
        int ligneRoi = 0;
        int colonneRoi = 0;

        if (joueur == 1){
            roi = 2;
        }

        for (int ligne = 0 ; ligne < echiquier.length ; ligne++){
            for (int colonne = 0 ; colonne < echiquier[ligne].length ; colonne++){
                if (echiquier[ligne][colonne] == roi){
                    ligneRoi = ligne;
                    colonneRoi = colonne;
                    break;
                }
            }
        }
        if ((colonneRoi+1 <= 7 && ligneRoi+1 <= 7) && (roiPeutAllerCase(echiquier,ligneRoi,colonneRoi,ligneRoi+1,colonneRoi+1))){
            return false;
        } else if ((colonneRoi-1 >= 0 && ligneRoi-1 >= 0) && (roiPeutAllerCase(echiquier,ligneRoi,colonneRoi,ligneRoi-1,colonneRoi-1))){
            return false;
        } else if ((ligneRoi+1 <= 7 && colonneRoi-1 >= 0) && (roiPeutAllerCase(echiquier,ligneRoi,colonneRoi,ligneRoi+1,colonneRoi-1))){
            return false;
        } else if ((ligneRoi-1 >= 0 && colonneRoi+1 <=7) && (roiPeutAllerCase(echiquier,ligneRoi,colonneRoi,ligneRoi-1,colonneRoi+1))){
            return false;
        } else if ((colonneRoi+1 <= 7) && (roiPeutAllerCase(echiquier,ligneRoi,colonneRoi,ligneRoi,colonneRoi+1))){
            return false;
        } else if ((colonneRoi-1 >= 0) && (roiPeutAllerCase(echiquier,ligneRoi,colonneRoi,ligneRoi,colonneRoi-1))){
            return false;
        } else if ((ligneRoi+1 <= 7) && (roiPeutAllerCase(echiquier,ligneRoi,colonneRoi,ligneRoi+1,colonneRoi))){
            return false;
        } else if ((ligneRoi-1 >=0) && (roiPeutAllerCase(echiquier,ligneRoi,colonneRoi,ligneRoi-1,colonneRoi))){
            return false;
        }
        return true;

    }




}
