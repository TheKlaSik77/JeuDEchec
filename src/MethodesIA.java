public class MethodesIA {


    /**
     * Trouve un déplacement possible pour l'IA selon joueur : 1 pour blanc, 2 pour noir.
     * @param echiquier
     * @param tabDeplacements
     * @param joueur
     */
    public static void deplacementIA(int[][] echiquier, int[] tabDeplacements, int joueur){

        // Cherche combo de case aléatoire correspondant à une case de la couleur du joueur.
        // -> Pour cela : 1) Choisir un nombre aléatoire entre 0 et 7 puis un deuxième et teste si pièce à lui
        //                2) Tester pour toutes les cases si la pièce peut se déplacer (MethodesDeplacements.piecePeutBouger())
        //                      -> Si oui, 2 nombres aléatoires jusqu'à ce que déplacement possible
        //                      -> Sinon prendre une nouvelle pièce de départ

        if (joueur == 1) {
            do {
                do {
                    tabDeplacements[0] = (int) (Math.random() * 8);
                    tabDeplacements[1] = (int) (Math.random() * 8);
                } while (echiquier[tabDeplacements[0]][tabDeplacements[1]] < 0);
            } while (!MethodesDeplacements.piecePeutBouger(echiquier,tabDeplacements[0],tabDeplacements[1]));

            do {
                tabDeplacements[2] = (int) (Math.random() * 8);
                tabDeplacements[3] = (int) (Math.random() * 8);
            } while (!MethodesDeplacements.piecePeutAllerCase(echiquier,tabDeplacements[0],tabDeplacements[1],tabDeplacements[2],tabDeplacements[3]));
        } else if (joueur == 2) {
            do {
                do {
                    tabDeplacements[0] = (int) (Math.random() * 8);
                    tabDeplacements[1] = (int) (Math.random() * 8);
                } while (echiquier[tabDeplacements[0]][tabDeplacements[1]] > 0);
            } while (!MethodesDeplacements.piecePeutBouger(echiquier,tabDeplacements[0],tabDeplacements[1]));

            do {
                tabDeplacements[2] = (int) (Math.random() * 8);
                tabDeplacements[3] = (int) (Math.random() * 8);
            } while (!MethodesDeplacements.piecePeutAllerCase(echiquier,tabDeplacements[0],tabDeplacements[1],tabDeplacements[2],tabDeplacements[3]));
        }
    }



}
