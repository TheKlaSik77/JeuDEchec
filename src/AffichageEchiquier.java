public class AffichageEchiquier{

    /*
    8x8
    int[][] echiquier -> Que des cases 0
    Partie commence avec pièces déjà installées

    {{-6,-5,-4,-2,-3,-4,-5,-6},{-1,-1,-1,-1,-1,-1,-1,-1},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{1,1,1,1,1,1,1,1},{6,5,4,3,2,4,5,6}}
    Pièces dans echiquier[][] :

    Noir : négatif
    Blanc : positif

    Pion : 1
    Roi : 2
    Dame : 3
    Fou : 4
    Cavalier : 5
    Tour : 6
       " A    B    C    D    E    F    G    H "

         Tn | Cn | Fn | Dn | Rn | Fn | Cn | Tn   1
        ---------------------------------------
         Pn | Pn | Pn | Pn | Pn | Pn | Pn | Pn   2
        ---------------------------------------
            |    |    |    |    |    |    |      3
        ---------------------------------------
            |    |    |    |    |    |    |      4
        ---------------------------------------
            |    |    |    |    |    |    |      5
        ---------------------------------------
            |    |    |    |    |    |    |      6
        ---------------------------------------
         Pb | Pb | Pb | Pb | Pb | Pb | Pb | Pb   7
        ---------------------------------------
         Tb | Cb | Fb | Db | Rb | Fb | Cb | Tb   8
     */

    /**
     * Créer un échiquier place ses pièces dans la configuration initiale
     *
     * @return
     *      Renvoie l'échiquier rempli
     */
    public static int[][] creerEtRemplirEchiquier(){

        int[][] echiquier = {{-6,-5,-4,-2,-3,-4,-5,-6},{-1,-1,-1,-1,-1,-1,-1,-1},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{1,1,1,1,1,1,1,1},{6,5,4,3,2,4,5,6}};
        return echiquier;
    }

    public static void affTab(int[][] tab){
        for (int i = 0 ; i < 8 ; i++){
            for (int j = 0 ; j < 8 ; j++){
                System.out.print(tab[i][j]);
            }
            System.out.println();
        }
    }
    public static void afficherEchiquier(int[][] echiquier){

        String pieceSurCase = "";
        System.out.println(" A    B    C    D    E    F    G    H ");
        System.out.println();
        for (int ligne = 0 ; ligne < 8 ; ligne++){
            for (int colonne = 0 ; colonne < 8 ; colonne++){

                switch (echiquier[ligne][colonne]){
                    case 0:
                        pieceSurCase = "  ";
                        break;
                    case 1:
                        pieceSurCase = "Pb";
                        break;
                    case -1:
                        pieceSurCase = "Pn";
                        break;
                    case 2:
                        pieceSurCase = "Rb";
                        break;
                    case -2:
                        pieceSurCase = "Rn";
                        break;
                    case 3:
                        pieceSurCase = "Db";
                        break;
                    case -3:
                        pieceSurCase = "Dn";
                        break;
                    case 4:
                        pieceSurCase = "Fb";
                        break;
                    case -4:
                        pieceSurCase = "Fn";
                        break;
                    case 5:
                        pieceSurCase = "Cb";
                        break;
                    case -5:
                        pieceSurCase = "Cn";
                        break;
                    case 6:
                        pieceSurCase = "Tb";
                        break;
                    case -6:
                        pieceSurCase = "Tn";
                        break;
                }
                if (colonne == 7){
                    System.out.print(" " + pieceSurCase + " ");
                    System.out.println("    " + (ligne+ 1 ));

                } else {
                    System.out.print(" " + pieceSurCase + " |");
                }
            }
            if (ligne != 7){
                System.out.println("---------------------------------------");
            }
        }
    }
}