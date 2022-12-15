public class DeplacementFou {

    /**
     * Teste si la case d'arrivée est bien dans la diagonale de la case de départ
     * @param ligneDepart
     * @param colonneDepart
     * @param ligneArrivee
     * @param colonneArrivee
     * @return
     */
    public static boolean fouCaseValide(int ligneDepart, int colonneDepart,int ligneArrivee, int colonneArrivee){

        int compteurJ = 0;
        if (ligneArrivee < ligneDepart){
            for (int i = ligneDepart ; i > ligneArrivee ; i--){
                compteurJ++;
            }
        } else { // Cas ou ligneArrivee > ligneDepart
            for (int i = ligneDepart ; i < ligneArrivee ; i++){
                compteurJ++;
            }

        }
        if (colonneArrivee > colonneDepart){
            return colonneArrivee == (colonneDepart + compteurJ);
        } else {
            return colonneArrivee == (colonneDepart - compteurJ);
        }
    }

    /**
     * Teste (si la case est dans la diagonale) si il y a des pièces sur le chemin
     * @param ligneDepart
     * @param colonneDepart
     * @param ligneArrivee
     * @param colonneArrivee
     * @return
     */
    public static boolean fouPeutAllerCase(int[][] echiquier, int ligneDepart, int colonneDepart,int ligneArrivee, int colonneArrivee){
        if (!MethodesDeplacements.testCaseArriveeDifferentCamp(echiquier,ligneDepart,colonneDepart,ligneArrivee,colonneArrivee)){
            return false;
        }
        if (fouCaseValide(ligneDepart,colonneDepart,ligneArrivee,colonneArrivee)) {
            int ligneTestee = ligneDepart;
            int colonneTestee = colonneDepart;
            if (ligneArrivee > ligneDepart){
                if (colonneArrivee > colonneDepart){ // Cas : diagonale sud-est
                    while (ligneTestee != (ligneArrivee - 1) && colonneTestee != (colonneArrivee - 1)){
                        ligneTestee++;
                        colonneTestee++;
                        if (echiquier[ligneTestee][colonneTestee] != 0){
                            return false;
                        }
                    }
                } else { // Cas : diagonale sud-ouest
                    while (ligneTestee != ligneArrivee - 1 && colonneTestee != colonneArrivee + 1){
                        ligneTestee++;
                        colonneTestee--;
                        if (echiquier[ligneTestee][colonneTestee] != 0){
                            return false;
                        }
                    }
                }
            } else {
                if (colonneArrivee > colonneDepart) { // Cas : diagonale nord-est
                    while (ligneTestee != ligneArrivee + 1 && colonneTestee != colonneArrivee - 1){
                        ligneTestee--;
                        colonneTestee++;
                        if (echiquier[ligneTestee][colonneTestee] != 0){
                            return false;
                        }
                    }
                } else { // Cas : diagonale nord-ouest
                    while (ligneTestee != ligneArrivee + 1 && colonneTestee != colonneArrivee + 1){
                        ligneTestee--;
                        colonneTestee--;
                        if (echiquier[ligneTestee][colonneTestee] != 0){
                            return false;
                        }
                    }
                }
            }
        }else{
            return false;
        }
        return true;
    }

    public static void deplacerFou(int[][] echiquier, int ligneDepart, int colonneDepart,int ligneArrivee, int colonneArrivee){

        if (echiquier[ligneDepart][colonneDepart] == 4){
            echiquier[ligneDepart][colonneDepart] = 0;
            echiquier[ligneArrivee][colonneArrivee] = 4;
        } else if (echiquier[ligneDepart][colonneDepart] == -4){
            echiquier[ligneDepart][colonneDepart] = 0;
            echiquier[ligneArrivee][colonneArrivee] = -4;
        }
    }


    /**
     * Renvoie True si la piece en (ligne, colonne) met le roi adverse en échec
     * @param echiquier
     * @param ligne
     * @param colonne
     * @return
     */
    public static boolean fouMetEnEchecRoi(int[][] echiquier, int ligne, int colonne){

        int roi;
        if (echiquier[ligne][colonne] == 4) { // Fou blanc
            roi = -2;
        } else {
            roi = 2;
        }

        int ligneTestee = ligne + 1;
        int colonneTestee = colonne + 1;
        while(ligneTestee < 8 && colonneTestee < 8){ // Cas : diagonale sud-est
            if (echiquier[ligneTestee][colonneTestee] != 0 && echiquier[ligneTestee][colonneTestee] != roi){
                break;
            }
            if (echiquier[ligneTestee][colonneTestee] == roi){
                return true;
            }
            ligneTestee++;
            colonneTestee++;
        }

        ligneTestee = ligne + 1;
        colonneTestee = colonne - 1;
        while(ligneTestee < 8 && colonneTestee >= 0){ // Cas : diagonale sud-ouest
            if (echiquier[ligneTestee][colonneTestee] != 0 && echiquier[ligneTestee][colonneTestee] != roi){

                break;
            }
            if (echiquier[ligneTestee][colonneTestee] == roi){
                return true;
            }
            ligneTestee++;
            colonneTestee--;
        }

        ligneTestee = ligne - 1;
        colonneTestee = colonne - 1;
        while(ligneTestee >= 0 && colonneTestee >= 0){ // Cas : diagonale nord-ouest
            if (echiquier[ligneTestee][colonneTestee] != 0 && echiquier[ligneTestee][colonneTestee] != roi){

                break;
            }
            if (echiquier[ligneTestee][colonneTestee] == roi){
                return true;
            }
            ligneTestee--;
            colonneTestee--;
        }

        ligneTestee = ligne - 1;
        colonneTestee = colonne + 1;
        while(ligneTestee >= 0 && colonneTestee < 8){ // Cas : diagonale nord-est
            if (echiquier[ligneTestee][colonneTestee] != 0 && echiquier[ligneTestee][colonneTestee] != roi){

                break;
            }
            if (echiquier[ligneTestee][colonneTestee] == roi){
                return true;
            }
            ligneTestee--;
            colonneTestee++;
        }

        return false;

    }


}
