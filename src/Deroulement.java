public class Deroulement {

    // Deroulement de la partie

    /*
      Grande boucle de Jeu :

       while(!EchecEtMat(joueur,echiquier)){
            tourDeJeu(joueur, echiquier)
       }
       s'arreter sur le joueur qui a perdu -> j1 a perdu ou j2 a perdu

     */
    // Grande boucle de jeu :
    public static void jeu(){

        int joueur = 1; // Commence par les blancs
        int[][] echiquier = AffichageEchiquier.creerEtRemplirEchiquier();
        boolean jeuFini = false;
        boolean jeuNul = false;
        int[] tabDeplacements = new int[4];
        int[][] echiquierTemp = new int[echiquier.length][echiquier.length];
        // Rajouter d'autres variables ici pour gerer le nul et rajouter une condition dans le while

        while (!jeuFini){
            // Cas échec sur le roi du joueur
            if (DeplacementRoi.estEchecEtMat(echiquier,joueur)){
                jeuFini = true;
            } else {
                // Cas ou roi est échec mais, peut s'en sortir
                if (DeplacementRoi.roiEstEnEchec(echiquier,joueur)){
                    do {
                        AffichageEchiquier.afficherEchiquier(echiquier);
                        MethodesDeplacements.demandeDeplacements(echiquier, tabDeplacements, joueur);
                        MethodesDeplacements.copierEchiquierDansEchiquierTemp(echiquier, echiquierTemp);
                        MethodesDeplacements.deplacerPiece(echiquierTemp, tabDeplacements[0], tabDeplacements[1], tabDeplacements[2], tabDeplacements[3]);
                    } while (DeplacementRoi.roiEstEnEchec(echiquierTemp,joueur));
                    MethodesDeplacements.deplacerPiece(echiquier,tabDeplacements[0],tabDeplacements[1],tabDeplacements[2],tabDeplacements[3]);
                } else {
                    do {
                        AffichageEchiquier.afficherEchiquier(echiquier);
                        MethodesDeplacements.demandeDeplacements(echiquier, tabDeplacements, joueur);
                        MethodesDeplacements.copierEchiquierDansEchiquierTemp(echiquier, echiquierTemp);
                        MethodesDeplacements.deplacerPiece(echiquierTemp, tabDeplacements[0], tabDeplacements[1], tabDeplacements[2], tabDeplacements[3]);
                    } while (DeplacementRoi.roiEstEnEchec(echiquierTemp,joueur));
                    MethodesDeplacements.deplacerPiece(echiquier,tabDeplacements[0],tabDeplacements[1],tabDeplacements[2],tabDeplacements[3]);
                }
            }


            if (joueur == 1){
                joueur = 2;
            } else {
                joueur = 1;
            }
        }
        if (!jeuNul){
            if (joueur == 2){
                AffichageEchiquier.afficherEchiquier(echiquier);
                System.out.println("Le joueur 2 a gagné! C'était une partie très endiablée!\nA bientôt!");
                System.out.println("\n======================================================\n");
            } else {
                AffichageEchiquier.afficherEchiquier(echiquier);
                System.out.println("Le joueur 1 a gagné! C'était une partie très endiablée!\nA bientôt!");
                System.out.println("\n======================================================\n");
            }
        } else {
            AffichageEchiquier.afficherEchiquier(echiquier);
            System.out.println("C'est un match nul!");
        }

    }

}
