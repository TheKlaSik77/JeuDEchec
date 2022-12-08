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

     Tn | Cn | Fn | Dn | Rn | Fn | Cn | Tn
    ---------------------------------------
     Pn | Pn | Pn | Pn | Pn | Pn | Pn | Pn
    ---------------------------------------
        |    |    |    |    |    |    |
    ---------------------------------------
        |    |    |    |    |    |    |
    ---------------------------------------
        |    |    |    |    |    |    |
    ---------------------------------------
        |    |    |    |    |    |    |
    ---------------------------------------
     Pb | Pb | Pb | Pb | Pb | Pb | Pb | Pb
    ---------------------------------------
     Tb | Cb | Fb | Db | Rb | Fb | Cb | Tb
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
        for (int ligne = 0 ; ligne < 8 ; ligne++){
            for (int colonne = 0 ; colonne < 8 ; colonne++){

                switch (echiquier[ligne][colonne]){
                    case 0:
                        pieceSurCase = "  ";
                    case 1:
                        pieceSurCase = "Pb";
                    case -1:
                        pieceSurCase = "Pn";
                    case 2:
                        pieceSurCase = "Rb";
                    case -2:
                        pieceSurCase = "Rn";
                    case 3:
                        pieceSurCase = "Db";
                    case -3:
                        pieceSurCase = "Dn";
                    case 4:
                        pieceSurCase = "Fb";
                    case -4:
                        pieceSurCase = "Fn";
                    case 5:
                        pieceSurCase = "Cb";
                    case -5:
                        pieceSurCase = "Cn";
                    case 6:
                        pieceSurCase = "Tb";
                    case -6:
                        pieceSurCase = "Tn";
                        break;

                }
                if (colonne == 7){
                    System.out.println(" " + pieceSurCase + " ");
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