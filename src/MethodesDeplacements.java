import java.util.Scanner;

public class MethodesDeplacements {

    /**
     * @return la ligne saisie par l'utilisateur pour se déplacer
     */
    public static int saisieCoordonneeLigneDepart() {
        Scanner sc = new Scanner(System.in);
        int saisieLigne;
        System.out.print("Entrer les coordonnées de la ligne de la case de départ (entre 1 et 8) : ");
        saisieLigne = sc.nextInt();
        System.out.println("\n======================================================\n");
        while (saisieLigne < 1 || saisieLigne > 8){
            System.out.print("Erreur! Cette case n'est pas valide!\nEntrer les coordonnées de la ligne de la case de départ (entre 1 et 8) : ");
            saisieLigne = sc.nextInt();
            System.out.println("\n======================================================\n");

        }

        return saisieLigne - 1;
    }

    /**
     * Saisie une lettre en Maj ou en min et la fonction change cette lettre en int
     * @return la colonne saisie par l'utilisateur pour se déplacer
     */

    public static int saisieCoordonneeColonneDepart() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrer les coordonnées de la colonne de la case de départ (entre A et H) : ");
        String saisieColonne = sc.nextLine();
        System.out.println("\n======================================================\n");
        saisieColonne = saisieColonne.toUpperCase();
        int nCase = saisieColonne.charAt(0) - 64;

        while (saisieColonne.length() > 1 || nCase < 1 || nCase > 8) {
            System.out.print("Erreur! Cette case n'est pas valide!\nEntrer les coordonnées de la colonne de la case de départ (entre A et H) : ");
            saisieColonne = sc.nextLine();
            System.out.println("\n======================================================\n");
            saisieColonne = saisieColonne.toUpperCase();
            nCase = saisieColonne.charAt(0) - 64;
            // Permet de mettre les caractères en maj puis de calculer a quoi correspond la case par rapport au code ascii

        }

        return nCase - 1; // Renvoie le nCase - 1 car le tableau commence à 0
    }


    public static int saisieCoordonneeLigneArrivee() {
        Scanner sc = new Scanner(System.in);
        int saisieLigne;
        System.out.print("Entrer les coordonnées de la ligne de la case d'arrivée (entre 1 et 8) : ");
        saisieLigne = sc.nextInt();
        System.out.println("\n======================================================\n");

        while (saisieLigne < 1 || saisieLigne > 8) {
            System.out.print("Erreur! Cette case n'est pas valide!\nEntrer les coordonnées de la ligne de la case d'arrivée (entre 1 et 8) : ");
            saisieLigne = sc.nextInt();
            System.out.println("\n======================================================\n");

        }

        return saisieLigne - 1;
    }

    /**
     * @return la colonne saisie par l'utilisateur pour se déplacer
     */
    public static int saisieCoordonneeColonneArrivee() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrer les coordonnées de la colonne de la case d'arrivée (entre A et H) : ");
        String saisieColonne = sc.nextLine();
        System.out.println("\n======================================================\n");
        saisieColonne = saisieColonne.toUpperCase();
        int nCase = saisieColonne.charAt(0) - 64;

        while (saisieColonne.length() > 1 || nCase < 1 || nCase > 8) {
            System.out.print("Erreur! Cette case n'est pas valide!\nEntrer les coordonnées de la colonne de la case d'arrivée (entre A et H) : ");

            saisieColonne = sc.nextLine();
            saisieColonne = saisieColonne.toUpperCase();
            nCase = saisieColonne.charAt(0) - 64;
            // Permet de mettre les caractères en maj puis de calculer a quoi correspond la case par rapport au code ascii

        }

        return nCase - 1; // Renvoie le nCase - 1 car le tableau commence à 0
    }


    /**
     * @param echiquier
     * @param ligne         (coordonnée de la ligne)
     * @param colonne        (coordonnée de la colonne)
     * @return vrai si l et c valent 0
     */
    public static boolean caseVide(int[][] echiquier, int ligne, int colonne) {
        if (echiquier[ligne][colonne] == 0)
            return true;
        else
            return false;
    }

    /**
     * Test si la case d'arrivée est occupée par un pion du même camp (true), par du vide ou par un ennemi (false)
     * @param echiquier
     * @param ligneDepart
     * @param colonneDepart
     * @param ligneArrivee
     * @param colonneArrivee
     * @return
     */
    public static boolean testCaseArriveeDifferentCamp(int[][] echiquier, int ligneDepart, int colonneDepart, int ligneArrivee, int colonneArrivee){
        if (echiquier[ligneDepart][colonneDepart] > 0){
            return echiquier[ligneArrivee][colonneArrivee] <= 0;
        } else {
            return echiquier[ligneArrivee][colonneArrivee] >= 0;
        }
    }

    /**
     * Teste si l'emplacement ligne, colonne met en échec le roi adverse.
     * @param echiquier
     * @param ligne
     * @param colonne
     * @return
     */
    public static boolean testPieceMetEnEchec(int[][] echiquier, int ligne, int colonne){

        if (echiquier[ligne][colonne] == 6 || echiquier[ligne][colonne] == -6){
            return DeplacementTour.tourMetEnEchecRoi(echiquier,ligne,colonne);
        } else if (echiquier[ligne][colonne] == 5 || echiquier[ligne][colonne] == -5){
            return DeplacementCavalier.cavalierMetEnEchecRoi(echiquier,ligne,colonne);
        } else if (echiquier[ligne][colonne] == 4 || echiquier[ligne][colonne] == -4){
            return DeplacementFou.fouMetEnEchecRoi(echiquier,ligne,colonne);
        } else if (echiquier[ligne][colonne] == 3 || echiquier[ligne][colonne] == -3){
            return DeplacementDame.dameMetEnEchecRoi(echiquier,ligne,colonne);
        } else if (echiquier[ligne][colonne] == 1 || echiquier[ligne][colonne] == -1){
            return DeplacementPion.pionMetEnEchecRoi(echiquier,ligne,colonne);
        } else if (echiquier[ligne][colonne] == 2 || echiquier[ligne][colonne] == -2){
            return DeplacementRoi.roiMetEnEchecRoi(echiquier,ligne,colonne);
        }

        return false;
    }

    /**
     * Indique si la pièce sur echiquier[ligneDepart][colonneDepart] peut aller à la case d'arrivée.
     * @param echiquier
     * @param ligneDepart
     * @param colonneDepart
     * @param ligneArrivee
     * @param colonneArrivee
     * @return
     */
    public static boolean piecePeutAllerCase(int[][] echiquier, int ligneDepart, int colonneDepart,int ligneArrivee, int colonneArrivee){

        switch (echiquier[ligneDepart][colonneDepart]){
            case 1, -1:
                return DeplacementPion.pionPeutAllerCase(echiquier, ligneDepart, colonneDepart, ligneArrivee, colonneArrivee);

            case 2, -2:
                return DeplacementRoi.roiPeutAllerCase(echiquier, ligneDepart, colonneDepart, ligneArrivee, colonneArrivee);

            case 3, -3:
                return DeplacementDame.damePeutAllerCase(echiquier, ligneDepart, colonneDepart, ligneArrivee, colonneArrivee);

            case 4, -4:
                return DeplacementFou.fouPeutAllerCase(echiquier, ligneDepart, colonneDepart, ligneArrivee, colonneArrivee);

            case 5, -5:
                return DeplacementCavalier.cavalierPeutAllerCase(echiquier, ligneDepart, colonneDepart, ligneArrivee, colonneArrivee);

            case 6, -6:
                return DeplacementTour.tourPeutAllerCase(echiquier, ligneDepart, colonneDepart, ligneArrivee, colonneArrivee);

        }
        return false;
    }

    /**
     * Déplace la pièce de départ vers la case d'arrivée
     * @param echiquier
     * @param ligneDepart
     * @param colonneDepart
     * @param ligneArrivee
     * @param colonneArrivee
     */
    public static void deplacerPiece(int[][] echiquier, int ligneDepart, int colonneDepart,int ligneArrivee, int colonneArrivee){
        switch (echiquier[ligneDepart][colonneDepart]){
            case 1, -1:
                DeplacementPion.deplacerPion(echiquier, ligneDepart, colonneDepart, ligneArrivee, colonneArrivee);
                break;
            case 2, -2:
                DeplacementRoi.deplacerRoi(echiquier, ligneDepart, colonneDepart, ligneArrivee, colonneArrivee);
                break;
            case 3, -3:
                DeplacementDame.deplacerDame(echiquier, ligneDepart, colonneDepart, ligneArrivee, colonneArrivee);
            case 4, -4:
                DeplacementFou.deplacerFou(echiquier, ligneDepart, colonneDepart, ligneArrivee, colonneArrivee);

            case 5, -5:
                DeplacementCavalier.deplacerCavalier(echiquier, ligneDepart, colonneDepart, ligneArrivee, colonneArrivee);

            case 6, -6:
                DeplacementTour.deplacerTour(echiquier, ligneDepart, colonneDepart, ligneArrivee, colonneArrivee);

        }
    }


    /**
     * Met à jour les variables lignes et colonnes d'arrivée et de départ en testant si le déplacement est possible et si les coordonnées de départ et d'arrivée sont bien différentes. Enfin, demande une confirmation du coup.
     * @param echiquier
     * @param tabDeplacements
     *      Correspond aux deplacements indices 0 pour ligne depart, 1 pour colonne départ, 2 pour ligne arrivée, 3 pour colonne arrivée
     * @param joueur
     */
    public static void demandeDeplacements(int[][] echiquier, int[] tabDeplacements, int joueur){

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        boolean confirmation = false;
        boolean emplacementDepartValide = false;
        boolean emplacementArriveeValide = false;

        while (!confirmation){
            while(!emplacementArriveeValide){
                while (!emplacementDepartValide) {
                    tabDeplacements[1] = saisieCoordonneeColonneDepart();
                    tabDeplacements[0] = saisieCoordonneeLigneDepart();
                    if (joueur == 1) {
                        if (echiquier[tabDeplacements[0]][tabDeplacements[1]] > 0) {
                            emplacementDepartValide = true;
                        }
                    } else if (joueur == 2) {
                        if (echiquier[tabDeplacements[0]][tabDeplacements[1]] < 0) {
                            emplacementDepartValide = true;
                        }
                    }
                    if (!emplacementDepartValide) {
                        System.out.println("Erreur! La position renseignée ne correspond pas à une de vos pièce.\nVeuillez recommencer en ré-indiquant la pièce de départ.");
                        System.out.println("\n======================================================\n");

                    }
                }
                tabDeplacements[3] = saisieCoordonneeColonneArrivee();
                tabDeplacements[2] = saisieCoordonneeLigneArrivee();
                if (piecePeutAllerCase(echiquier,tabDeplacements[0],tabDeplacements[1],tabDeplacements[2],tabDeplacements[3])){
                    emplacementArriveeValide = true;
                }
                if (!emplacementArriveeValide){
                    System.out.println("Erreur! La position d'arrivée renseignée est identique ou ne permet pas un coup valide.\nVeuillez recommencer en ré-indiquant la pièce de départ.");
                    System.out.println("\n======================================================\n");
                    emplacementDepartValide = false;
                }
            }
            System.out.println("Voulez-vous valider ce coup ?\nInsérez 1 pour valider ou 0 pour insérer un autre coup : ");
            int choix = scanner.nextInt();
            System.out.println("\n======================================================\n");
            while (choix != 0 && choix != 1){
                System.out.println("Erreur, choix incorrect!\n\nVoulez-vous valider ce coup ?\nInsérez 1 pour valider ou 0 pour insérer un autre coup : ");
                choix = scanner.nextInt();
                System.out.println("\n======================================================\n");
            }
            if (choix == 1){
                confirmation = true;
            }
        }
    }
    public static void copierEchiquierDansEchiquierTemp(int[][] echiquier, int[][] echiquierTemp){

        for (int ligne = 0 ; ligne < echiquier.length ; ligne++) {
            for (int colonne = 0; colonne < echiquier[ligne].length; colonne++) {
                echiquierTemp[ligne][colonne] = echiquier[ligne][colonne];
            }
        }
    }
}
