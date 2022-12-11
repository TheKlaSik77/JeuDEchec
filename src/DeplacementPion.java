import javax.swing.*;
import java.util.Scanner;

public class DeplacementPion {

    /**
     * @param echiquier
     * @return vrai si le pion peut avancer de 2 cases
     */
    public static boolean avance2Cases(int[][] echiquier, int colonne) {

        if (echiquier[6][colonne] == 1 || echiquier[1][colonne] == -1) //piece blanche
            return true;
        else {
            return false;
        }
    }
}

