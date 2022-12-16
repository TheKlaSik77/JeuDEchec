import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DeplacementPionTest {

    @Test
    void peutAllerCase() {
        int[][] echiquier1 = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {-1, -1, -1, -1, -1, -1, -1, -1},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertTrue(DeplacementPion.pionPeutAllerCase(echiquier1, 6, 7, 4, 7));
        assertTrue(DeplacementPion.pionPeutAllerCase(echiquier1, 6, 7, 5, 7));
        assertTrue(DeplacementPion.pionPeutAllerCase(echiquier1, 1, 7, 3, 7));
        assertTrue(DeplacementPion.pionPeutAllerCase(echiquier1, 1, 7, 2, 7));
        assertFalse(DeplacementPion.pionPeutAllerCase(echiquier1, 1, 7, 2, 6));
        assertFalse(DeplacementPion.pionPeutAllerCase(echiquier1, 1, 7, 4, 7));


        int[][] echiquier2 = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, -1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertTrue(DeplacementPion.pionPeutAllerCase(echiquier2, 4, 2, 3, 2));
        assertTrue(DeplacementPion.pionPeutAllerCase(echiquier2, 2, 4, 3, 4));
        assertFalse(DeplacementPion.pionPeutAllerCase(echiquier2, 2, 4, 4, 4));
        assertFalse(DeplacementPion.pionPeutAllerCase(echiquier2, 2, 4, 5, 4));

        int[][] echiquier3 = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, -2, 0, -3, 0, 0, 0},
                {2, 0, 0, 1, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };

        assertTrue(DeplacementPion.pionPeutAllerCase(echiquier3, 4, 3, 3, 4));
        assertTrue(DeplacementPion.pionPeutAllerCase(echiquier3, 4, 3, 3, 2));
        assertFalse(DeplacementPion.pionPeutAllerCase(echiquier3, 5, 1, 4, 0));

        int[][] echiquier4 = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, -5, 0},
                {0, -6, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertTrue(DeplacementPion.pionPeutAllerCase(echiquier4, 4, 0, 3, 1));
        assertTrue(DeplacementPion.pionPeutAllerCase(echiquier4, 3, 7, 2, 6));
    }

    @Test
    public void deplacerPion() {

        int[][] echiquier1 = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        int[][] echiquier2 = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        DeplacementPion.deplacerPion(echiquier1, 3, 3, 2, 3);
        assertArrayEquals(echiquier2, echiquier1);

        int[][] echiquier3 = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, -1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        int[][] echiquier4 = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, -1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        DeplacementPion.deplacerPion(echiquier3, 2, 3, 3, 3);
        assertArrayEquals(echiquier4, echiquier3);
    }

    @Test
    void testPromotion() {
        int[][] echiquier1 = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };

        int[][] echiquier2 = {
                {0, 0, 0, 0, 0, 3, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };

        DeplacementPion.deplacerPion(echiquier1, 1, 5, 0, 5);
        assertArrayEquals(echiquier2, echiquier1);


        int[][] echiquier3 = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, -1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };

        int[][] echiquier4 = {
                {0, 0, 0, 0, 0, 3, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, -3, 0, 0}
        };
        DeplacementPion.deplacerPion(echiquier3, 6, 5, 7, 5);
        assertArrayEquals(echiquier4, echiquier3);
    }

}

