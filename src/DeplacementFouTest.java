import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeplacementFouTest {

    @Test
    void fouCaseValide() {
        int[][] echiquier1 = {
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 6, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertTrue(DeplacementFou.fouCaseValide(3,3,5,1));
        assertFalse(DeplacementFou.fouCaseValide(3,3,3,6));
        assertTrue(DeplacementFou.fouCaseValide(3,3,0,6));
        assertTrue(DeplacementFou.fouCaseValide(3,3,2,2));
        assertTrue(DeplacementFou.fouCaseValide(3,3,7,7));

    }

    @Test
    void fouPeutAllerCase() {

        int[][] echiquier1 = {
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 6, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertTrue(DeplacementFou.fouPeutAllerCase(echiquier1,3,3,5,1));
        assertTrue(DeplacementFou.fouPeutAllerCase(echiquier1,3,3,0,6));
        assertTrue(DeplacementFou.fouPeutAllerCase(echiquier1, 3,3,2,2));
        assertTrue(DeplacementFou.fouPeutAllerCase(echiquier1, 3,3,7,7));
        assertFalse(DeplacementFou.fouPeutAllerCase(echiquier1,3,3,3,6));


        int[][] echiquier2 = {
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, -1, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 4, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 1, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0}
        };

        assertTrue(DeplacementFou.fouPeutAllerCase(echiquier2,3,3,4,2));
        assertFalse(DeplacementFou.fouPeutAllerCase(echiquier2,3,3,6,0));
        assertFalse(DeplacementFou.fouPeutAllerCase(echiquier2,3,3,5,1));
        assertTrue(DeplacementFou.fouPeutAllerCase(echiquier2,3,3,1,5));
        assertFalse(DeplacementFou.fouPeutAllerCase(echiquier2,3,3,0,6));

        int[][] echiquier3 = {
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 2, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 4, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, -6, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0}
        };

        assertTrue(DeplacementFou.fouPeutAllerCase(echiquier3,3,3,2,2));
        assertFalse(DeplacementFou.fouPeutAllerCase(echiquier3,3,3,0,0));
        assertFalse(DeplacementFou.fouPeutAllerCase(echiquier3,3,3,6,6));
        assertTrue(DeplacementFou.fouPeutAllerCase(echiquier3,3,3,5,5));
        assertFalse(DeplacementFou.fouPeutAllerCase(echiquier3,3,3,1,1));
    }

    @Test
    void deplacerFou() {

        int[][] echiquier1 = {
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 4, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0}
        };
        int[][] echiquier2 = {
                { 4, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0}
        };
        DeplacementFou.deplacerFou(echiquier1,3,3,0,0);
        assertArrayEquals(echiquier2, echiquier1);
    }
}