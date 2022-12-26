import java.util.Scanner;

public class Deroulement {

    // Deroulement de la partie

    public static void jeuJoueurContreJoueur(){

        int joueur = 1; // Commence par les blancs
        int[][] echiquier = AffichageEchiquier.creerEtRemplirEchiquier();
        boolean jeuFini = false;
        boolean jeuNul = false;
        int[] tabDeplacements = new int[4];
        int[][] echiquierTemp = new int[echiquier.length][echiquier.length];
        int nbCoups = 0;
        // Rajouter d'autres variables ici pour gerer le nul et rajouter une condition dans le while

        while (!jeuFini){
            // Cas échec sur le roi du joueur
            if (DeplacementRoi.estEchecEtMat(echiquier,joueur)){
                jeuFini = true;
            } else {
                // Cas ou roi est échec mais, peut s'en sortir
                if (DeplacementRoi.roiEstEnEchec(echiquier,joueur)) {
                    DeplacementRoi.nePeutPlusGrandRoque(joueur);
                    DeplacementRoi.nePeutPlusPetitRoque(joueur);
                    do {
                        AffichageEchiquier.afficherEchiquier(echiquier);
                        MethodesDeplacements.demandeDeplacements(echiquier, tabDeplacements, joueur);
                        MethodesDeplacements.copierEchiquierDansEchiquierTemp(echiquier, echiquierTemp);
                        MethodesDeplacements.deplacerPiece(echiquierTemp, tabDeplacements[0], tabDeplacements[1], tabDeplacements[2], tabDeplacements[3]);
                    } while (DeplacementRoi.roiEstEnEchec(echiquierTemp, joueur));
                    MethodesDeplacements.deplacerPiece(echiquier, tabDeplacements[0], tabDeplacements[1], tabDeplacements[2], tabDeplacements[3]);

                } else if (MethodesDeplacements.partieEstNulle(echiquier,joueur,nbCoups)){
                    jeuNul = true;
                    jeuFini = true;
                } else {
                    do {
                        AffichageEchiquier.afficherEchiquier(echiquier);
                        MethodesDeplacements.demandeDeplacements(echiquier, tabDeplacements, joueur);
                        MethodesDeplacements.copierEchiquierDansEchiquierTemp(echiquier, echiquierTemp);
                        MethodesDeplacements.deplacerPiece(echiquierTemp, tabDeplacements[0], tabDeplacements[1], tabDeplacements[2], tabDeplacements[3]);
                    } while (DeplacementRoi.roiEstEnEchec(echiquierTemp,joueur));
                    MethodesDeplacements.deplacerPiece(echiquier,tabDeplacements[0],tabDeplacements[1],tabDeplacements[2],tabDeplacements[3]);

                    // Cas ne peut plus roque pour tour
                    if ((tabDeplacements[0] == 0 && tabDeplacements[1] == 0) && echiquier[0][1] == -6){
                        DeplacementRoi.nePeutPlusGrandRoque(joueur);
                    } else if ((tabDeplacements[0] == 0 && tabDeplacements[1] == 7) && echiquier[0][1] == -6){
                        DeplacementRoi.nePeutPlusPetitRoque(joueur);
                    } else if ((tabDeplacements[0] == 7 && tabDeplacements[1] == 0) && echiquier[0][1] == -6){
                        DeplacementRoi.nePeutPlusGrandRoque(joueur);
                    } else if ((tabDeplacements[0] == 7 && tabDeplacements[1] == 7) && echiquier[0][1] == -6){
                        DeplacementRoi.nePeutPlusPetitRoque(joueur);
                    }
                }
            }

            // On incrémente le nombre de tours.
            nbCoups++;

            if (joueur == 1){
                joueur = 2;
            } else {
                joueur = 1;
            }
        }
        if (!jeuNul){
            if (joueur == 2){
                AffichageEchiquier.afficherEchiquier(echiquier);
                System.out.println("Échec Et Mat! Le joueur 2 a gagné! C'était une partie très endiablée!\nA bientôt!");
                System.out.println("\n======================================================\n");
            } else {
                AffichageEchiquier.afficherEchiquier(echiquier);
                System.out.println("Échec Et Mat! Le joueur 1 a gagné! C'était une partie très endiablée!\nA bientôt!");
                System.out.println("\n======================================================\n");
            }
        } else {
            AffichageEchiquier.afficherEchiquier(echiquier);
            System.out.println("C'est un match nul!");
        }

    }

    public static void jeuContreIA(){

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Choisissez votre couleur (1 pour Blanc, 2 pour Noir) : ");
        int joueur = scanner.nextInt();
        while (joueur != 1 && joueur != 2){
            System.out.print("Erreur! Choix invalide!\nChoisissez votre couleur (1 pour Blanc, 2 pour Noir) : ");
            joueur = scanner.nextInt();
        }
        int ia = 0;
        if (joueur == 1){
            ia = 2;
        } else {
            ia = 1;
        }

        int[][] echiquier = AffichageEchiquier.creerEtRemplirEchiquier();
        boolean jeuFini = false;
        boolean jeuNul = false;
        int[] tabDeplacements = new int[4];
        int[][] echiquierTemp = new int[echiquier.length][echiquier.length];
        int nbCoups = 0;
        // Rajouter d'autres variables ici pour gerer le nul et rajouter une condition dans le while
        int joueurActuel = 1;

        while (!jeuFini){
            // Tour du joueur
            if (joueurActuel == joueur) {
                // Cas échec sur le roi du joueur
                if (DeplacementRoi.estEchecEtMat(echiquier, joueurActuel)) {
                    jeuFini = true;
                } else {
                    // Cas ou roi est échec mais, peut s'en sortir
                    if (DeplacementRoi.roiEstEnEchec(echiquier, joueurActuel)) {
                        DeplacementRoi.nePeutPlusGrandRoque(joueurActuel);
                        DeplacementRoi.nePeutPlusPetitRoque(joueurActuel);
                        do {
                            AffichageEchiquier.afficherEchiquier(echiquier);
                            MethodesDeplacements.demandeDeplacements(echiquier, tabDeplacements, joueurActuel);
                            MethodesDeplacements.copierEchiquierDansEchiquierTemp(echiquier, echiquierTemp);
                            MethodesDeplacements.deplacerPiece(echiquierTemp, tabDeplacements[0], tabDeplacements[1], tabDeplacements[2], tabDeplacements[3]);
                        } while (DeplacementRoi.roiEstEnEchec(echiquierTemp, joueurActuel));
                        MethodesDeplacements.deplacerPiece(echiquier, tabDeplacements[0], tabDeplacements[1], tabDeplacements[2], tabDeplacements[3]);
                    } else if (MethodesDeplacements.partieEstNulle(echiquier, joueurActuel, nbCoups)) {
                        jeuNul = true;
                        jeuFini = true;
                    } else {
                        do {
                            AffichageEchiquier.afficherEchiquier(echiquier);
                            MethodesDeplacements.demandeDeplacements(echiquier, tabDeplacements, joueurActuel);
                            MethodesDeplacements.copierEchiquierDansEchiquierTemp(echiquier, echiquierTemp);
                            MethodesDeplacements.deplacerPiece(echiquierTemp, tabDeplacements[0], tabDeplacements[1], tabDeplacements[2], tabDeplacements[3]);
                        } while (DeplacementRoi.roiEstEnEchec(echiquierTemp, joueurActuel));
                        MethodesDeplacements.deplacerPiece(echiquier, tabDeplacements[0], tabDeplacements[1], tabDeplacements[2], tabDeplacements[3]);

                        // Cas ne peut plus roque pour tour
                        if ((tabDeplacements[0] == 0 && tabDeplacements[1] == 0) && echiquier[0][1] == -6){
                            DeplacementRoi.nePeutPlusGrandRoque(joueurActuel);
                        } else if ((tabDeplacements[0] == 0 && tabDeplacements[1] == 7) && echiquier[0][1] == -6){
                            DeplacementRoi.nePeutPlusPetitRoque(joueurActuel);
                        } else if ((tabDeplacements[0] == 7 && tabDeplacements[1] == 0) && echiquier[0][1] == -6){
                            DeplacementRoi.nePeutPlusGrandRoque(joueurActuel);
                        } else if ((tabDeplacements[0] == 7 && tabDeplacements[1] == 7) && echiquier[0][1] == -6){
                            DeplacementRoi.nePeutPlusPetitRoque(joueurActuel);
                        }
                    }
                }
            // Tour de l'IA
            } else {
                // Cas échec sur le roi du joueur
                if (DeplacementRoi.estEchecEtMat(echiquier, joueurActuel)) {
                    jeuFini = true;
                } else {
                    // Cas ou roi est échec mais, peut s'en sortir
                    if (DeplacementRoi.roiEstEnEchec(echiquier, joueurActuel)) {
                        DeplacementRoi.nePeutPlusGrandRoque(joueurActuel);
                        DeplacementRoi.nePeutPlusPetitRoque(joueurActuel);
                        do {
                            AffichageEchiquier.afficherEchiquier(echiquier);
                            MethodesIA.deplacementIA(echiquier,tabDeplacements,joueurActuel);
                            MethodesDeplacements.copierEchiquierDansEchiquierTemp(echiquier, echiquierTemp);
                            MethodesDeplacements.deplacerPiece(echiquierTemp, tabDeplacements[0], tabDeplacements[1], tabDeplacements[2], tabDeplacements[3]);
                        } while (DeplacementRoi.roiEstEnEchec(echiquierTemp, joueurActuel));
                        MethodesDeplacements.deplacerPiece(echiquier, tabDeplacements[0], tabDeplacements[1], tabDeplacements[2], tabDeplacements[3]);
                    } else if (MethodesDeplacements.partieEstNulle(echiquier, joueurActuel, nbCoups)) {
                        jeuNul = true;
                        jeuFini = true;
                    } else {
                        do {
                            AffichageEchiquier.afficherEchiquier(echiquier);
                            MethodesIA.deplacementIA(echiquier,tabDeplacements,joueurActuel);
                            MethodesDeplacements.copierEchiquierDansEchiquierTemp(echiquier, echiquierTemp);
                            MethodesDeplacements.deplacerPiece(echiquierTemp, tabDeplacements[0], tabDeplacements[1], tabDeplacements[2], tabDeplacements[3]);
                        } while (DeplacementRoi.roiEstEnEchec(echiquierTemp, joueurActuel));
                        MethodesDeplacements.deplacerPiece(echiquier, tabDeplacements[0], tabDeplacements[1], tabDeplacements[2], tabDeplacements[3]);
                        // Cas ne peut plus roque pour tour
                        if ((tabDeplacements[0] == 0 && tabDeplacements[1] == 0) && echiquier[0][1] == -6){
                            DeplacementRoi.nePeutPlusGrandRoque(joueurActuel);
                        } else if ((tabDeplacements[0] == 0 && tabDeplacements[1] == 7) && echiquier[0][1] == -6){
                            DeplacementRoi.nePeutPlusPetitRoque(joueurActuel);
                        } else if ((tabDeplacements[0] == 7 && tabDeplacements[1] == 0) && echiquier[0][1] == -6){
                            DeplacementRoi.nePeutPlusGrandRoque(joueurActuel);
                        } else if ((tabDeplacements[0] == 7 && tabDeplacements[1] == 7) && echiquier[0][1] == -6){
                            DeplacementRoi.nePeutPlusPetitRoque(joueurActuel);
                        }
                    }
                }
            }
            // On incrémente le nombre de tours.
            nbCoups++;

            if (joueurActuel == 1){
                joueurActuel = 2;
            } else {
                joueurActuel = 1;
            }
        }
        if (!jeuNul){
            if (joueurActuel == 2){
                AffichageEchiquier.afficherEchiquier(echiquier);
                System.out.println("Échec Et Mat! Le joueur 2 a gagné! C'était une partie très endiablée!\nA bientôt!");
                System.out.println("\n======================================================\n");
            } else {
                AffichageEchiquier.afficherEchiquier(echiquier);
                System.out.println("Échec Et Mat! Le joueur 1 a gagné! C'était une partie très endiablée!\nA bientôt!");
                System.out.println("\n======================================================\n");
            }
        } else {
            AffichageEchiquier.afficherEchiquier(echiquier);
            System.out.println("C'est un match nul!");
        }

    }

}
