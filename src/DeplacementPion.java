import javax.swing.*;
import java.util.Scanner;

public class DeplacementPion {

    /**
     * @param echiquier
     * @return vrai si le pion peut avancer de 2 cases
     */
    public static boolean avance2Cases(int[][] echiquier, int ligne, int colonne) {

        if (echiquier[6][colonne] == 1) //piece blanc
            return true;
        else if (echiquier[1][colonne] == -1) // pièce noire
            return true;
        else {
            return false;
        }
    }
}

