public class DeplacementDame {

    public static boolean damePeutAller(int[][] echiquier, int ligneDepart, int colonneDepart, int ligneArrivee, int colonneArrivee){

        if (DeplacementFou.fouPeutAllerCase(echiquier,ligneDepart,colonneDepart,ligneArrivee,colonneArrivee) || DeplacementTour.tourPeutAllerCase(echiquier, ligneDepart, colonneDepart, ligneArrivee, colonneArrivee)){
            return true;
        }
        return false;
    }

    public static void deplacerDame(int[][] echiquier, int ligneDepart, int colonneDepart,int ligneArrivee, int colonneArrivee){

        if (echiquier[ligneDepart][colonneDepart] == 3){
            echiquier[ligneDepart][colonneDepart] = 0;
            echiquier[ligneArrivee][colonneArrivee] = 3;
        } else if (echiquier[ligneDepart][colonneDepart] == -3){
            echiquier[ligneDepart][colonneDepart] = 0;
            echiquier[ligneArrivee][colonneArrivee] = -3;
        }
    }

    public static boolean echecDameRangees(int[][] echiquier, int ligne, int colonne){
        int roi;
        if (echiquier[ligne][colonne] == 3) { // Dame blanche
            roi = -2;
        } else {
            roi = 2;
        }

        // Cas Lignes-Colonnes

        // Bas
        int ligneTestee = ligne + 1;

        while (ligneTestee < 8){
            if (echiquier[ligneTestee][colonne] != 0 && echiquier[ligneTestee][colonne] != roi){
                break;
            }
            if (echiquier[ligneTestee][colonne] == roi){

                return true;
            }
            ligneTestee++;
        }
        // Haut
        ligneTestee = ligne - 1;

        while (ligneTestee >= 0){
            if (echiquier[ligneTestee][colonne] != 0 && echiquier[ligneTestee][colonne] != roi){

                break;
            }
            if (echiquier[ligneTestee][colonne] == roi){

                return true;
            }
            ligneTestee--;
        }
        // Gauche
        int colonneTestee = colonne - 1;

        while (colonneTestee >= 0){

            if (echiquier[ligne][colonneTestee] != 0 && echiquier[ligne][colonneTestee] != roi){

                break;
            }
            if (echiquier[ligne][colonneTestee] == roi){

                return true;
            }
            colonneTestee--;

        }
        // Droite
        colonneTestee = colonne + 1;
        while (colonneTestee < 8){
            if (echiquier[ligne][colonneTestee] != 0 && echiquier[ligne][colonneTestee] != roi){

                break;
            }
            if (echiquier[ligne][colonneTestee] == roi){

                return true;
            }
            colonneTestee++;

        }
        return false;
    }

    public static boolean echecDameDiagonale(int[][] echiquier, int ligne, int colonne){
        int roi;
        if (echiquier[ligne][colonne] == 3) { // Dame blanche
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

    public static boolean dameMetEnEchecRoi(int[][] echiquier, int ligne, int colonne){

        if (echecDameRangees(echiquier,ligne,colonne) || echecDameDiagonale(echiquier,ligne,colonne)){
            return true;
        } else {
            return false;
        }



    }
}
