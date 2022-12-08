public class AffichageEchiquier {

    /*
    8x8
    int[][] echiquier -> Que des cases 0
    Partie commence avec pièces déjà installée
    [[-6,-5,-4,-3,-2,-4,-5,-6],
    [-1,-1,-1,-1,-1,-1],
    [0,0,0,0,0,0],
    [0,0,0,0,0,0],
    [0,0,0,0,0,0],
    [0,0,0,0,0,0],
    [1,1,1,1,1,1]
    [6,5,4,3,2,4,5,6]

     */

    public static void creationEchiquier() {
        int[][] echiquier = new int[8][8];
        for (int i = 0; i < echiquier.length; i++) {
            for (int j = 0; j < echiquier[i].length; j++) {
                echiquier[i][j] = 0;
            }
        }
    }

}