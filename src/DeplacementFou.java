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
            int colonneTestee = ligneArrivee;
            if (ligneArrivee > ligneDepart){
                if (colonneArrivee > colonneDepart){ // Cas : diagonale sud-est
                    while (ligneTestee != ligneArrivee - 1 && colonneTestee != colonneArrivee - 1){
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
        }
        return false;
    }

    public static void deplacerFou(int[][] echiquier, int ligneDepart, int colonneDepart,int ligneArrivee, int colonneArrivee){

        if (echiquier[ligneDepart][colonneDepart] == 4){
            echiquier[ligneDepart][colonneDepart] = 0;
            echiquier[ligneArrivee][colonneArrivee] = 6;
        } else if (echiquier[ligneDepart][colonneDepart] == -4){
            echiquier[ligneDepart][colonneDepart] = 0;
            echiquier[ligneArrivee][colonneArrivee] = -6;
        }
    }


}
