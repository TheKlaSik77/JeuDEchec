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
}
