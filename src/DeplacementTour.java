public class DeplacementTour {

    /**
     * Test si il y a des pieces entre la case de départ et la case finale (Attention ne regarde pas la case finale donc il faut savoir si on mange ou pas)
     * @param echiquier
     * @param ligneDepart
     * @param colonneDepart
     * @param ligneArrivee
     * @param colonneArrivee
     * @return
     */
    public static boolean tourPeutAllerCase(int[][] echiquier, int ligneDepart, int colonneDepart,int ligneArrivee, int colonneArrivee){

        if (!MethodesDeplacements.testCaseArriveeDifferentCamp(echiquier,ligneDepart,colonneDepart,ligneArrivee,colonneArrivee)){

            return false;
        }
        if (ligneDepart == ligneArrivee){
            if (colonneDepart < colonneArrivee){
                for (int colonne = colonneDepart + 1 ; colonne < colonneArrivee ; colonne++){ // On parcourt à l'horizontal vers la droite
                    if (!MethodesDeplacements.caseVide(echiquier,ligneDepart,colonne)){  // Si on croise une case vide entre colonne de départ + 1 et colonne arrivée -1 alors déplacement impossible
                        return false;
                    }
                }
                return true; // Si aucune pièce sur le chemin alors on return true

            } else {
                for (int colonne = colonneDepart - 1 ; colonne > colonneArrivee ; colonne--){ // On parcourt à l'horizontal vers la gauche
                    if (!MethodesDeplacements.caseVide(echiquier,ligneDepart,colonne)){  // Si on croise une case vide entre colonne de départ - 1 et colonne arrivée + 1 alors déplacement impossible
                        return false;
                    }
                }
                return true; // Si aucune pièce sur le chemin alors on return true
            }
        } else if (colonneDepart == colonneArrivee) {
            if (ligneDepart < ligneArrivee){
                for (int ligne = ligneDepart + 1 ; ligne < ligneArrivee ; ligne++){ // On parcourt à la verticale vers le bas
                    if (!MethodesDeplacements.caseVide(echiquier,ligne,colonneDepart)){  // Si on croise une case vide entre ligne de départ + 1 et ligne d'arrivée -1 alors déplacement impossible
                        return false;
                    }
                }
                return true; // Si aucune pièce sur le chemin alors on return true

            } else {
                for (int ligne = ligneDepart - 1 ; ligne > ligneArrivee ; ligne--){ // On parcourt à la verticale vers le haut
                    if (!MethodesDeplacements.caseVide(echiquier,ligne,colonneDepart)){  // Si on croise une case vide entre la ligne de départ - 1 et la ligne d'arrivée + 1 alors déplacement impossible
                        return false;
                    }
                }
                return true; // Si aucune pièce sur le chemin alors on return true
            }
        }
        else {
            return false;
        }

    }
    /**
     * Si la tourPeutAllerCase() == true -> On peut lancer la fonction
     * Cette méthode déplace la tour à la bonne place
     */
    public static void deplacerTour(int[][] echiquier, int ligneDepart, int colonneDepart,int ligneArrivee, int colonneArrivee){

        if (echiquier[ligneDepart][colonneDepart] == 6){
            echiquier[ligneDepart][colonneDepart] = 0;
            echiquier[ligneArrivee][colonneArrivee] = 6;
        } else if (echiquier[ligneDepart][colonneDepart] == -6){
            echiquier[ligneDepart][colonneDepart] = 0;
            echiquier[ligneArrivee][colonneArrivee] = -6;
        }
    }

}
