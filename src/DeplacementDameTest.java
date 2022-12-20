import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeplacementDameTest {

    @Test
    void damePeutAller() {
        int[][] echiquier1 = {
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 3, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0}
        };

        assertTrue(DeplacementDame.damePeutAllerCase(echiquier1,3,3,0,3));
        assertTrue(DeplacementDame.damePeutAllerCase(echiquier1,3,3,7,3));
        assertTrue(DeplacementDame.damePeutAllerCase(echiquier1,3,3,3,0));
        assertTrue(DeplacementDame.damePeutAllerCase(echiquier1,3,3,3,7));
        assertTrue(DeplacementDame.damePeutAllerCase(echiquier1,3,3,7,7));
        assertTrue(DeplacementDame.damePeutAllerCase(echiquier1,3,3,0,0));
        assertTrue(DeplacementDame.damePeutAllerCase(echiquier1,3,3,0,0));
        assertTrue(DeplacementDame.damePeutAllerCase(echiquier1,3,3,0,6));
        assertTrue(DeplacementDame.damePeutAllerCase(echiquier1,3,3,6,0));

        assertFalse(DeplacementDame.damePeutAllerCase(echiquier1,3,3,4,7));


        int[][] echiquier2 = {
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 1, 1, 1, 0, 0, 0},
                { 0, 0, 1, 3, 1, 0, 0, 0},
                { 0, 0, 1, 1,-1, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0}
        };

        assertTrue(DeplacementDame.damePeutAllerCase(echiquier2,3,3,4,4));
        assertFalse(DeplacementDame.damePeutAllerCase(echiquier2,3,3,7,3));
        assertFalse(DeplacementDame.damePeutAllerCase(echiquier2,3,3,3,0));
        assertFalse(DeplacementDame.damePeutAllerCase(echiquier2,3,3,3,7));
        assertFalse(DeplacementDame.damePeutAllerCase(echiquier2,3,3,7,7));
        assertFalse(DeplacementDame.damePeutAllerCase(echiquier2,3,3,0,0));
        assertFalse(DeplacementDame.damePeutAllerCase(echiquier2,3,3,0,0));
        assertFalse(DeplacementDame.damePeutAllerCase(echiquier2,3,3,0,6));
        assertFalse(DeplacementDame.damePeutAllerCase(echiquier2,3,3,6,0));
        assertFalse(DeplacementDame.damePeutAllerCase(echiquier2,3,3,2,2));
        assertFalse(DeplacementDame.damePeutAllerCase(echiquier1,3,3,4,7));

    }

    @Test
    void deplacerDame() {

        int[][] echiquier1 = {
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 3, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0}
        };
        int[][] echiquier2 = {
                { 3, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0}
        };
        DeplacementDame.deplacerDame(echiquier1,3,3,0,0);
        assertArrayEquals(echiquier2, echiquier1);
    }

    @Test
    void dameMetEnEchecRoi(){
        // Cas diagonales
        int[][] echiquier1 = {
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0,-2, 0},
                { 0, 0, 0, 3, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0}
        };

        assertFalse(DeplacementDame.dameMetEnEchecRoi(echiquier1,3,3));
        int[][] echiquier2 = {
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0,-2, 0, 0},
                { 0, 0, 0, 0, 5, 0, 0, 0},
                { 0, 0, 0, 3, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertFalse(DeplacementDame.dameMetEnEchecRoi(echiquier2,3,3));
        int[][] echiquier3 = {
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 1, 0, 0, 0,-2, 0, 0},
                { 0, 0, 0, 0, 1, 0, 0, 0},
                { 0, 0, 0, 3, 0, 0, 0, 0},
                { 0, 0, 0, 0,-4, 0, 0, 0},
                { 0, 5, 0, 0, 0,-2, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertFalse(DeplacementDame.dameMetEnEchecRoi(echiquier3,3,3));

        int[][] echiquier4 = {
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0,-3, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 2, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertTrue(DeplacementDame.dameMetEnEchecRoi(echiquier4,3,3));

        int[][] echiquier5 = {
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0,-2, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 3, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertTrue(DeplacementDame.dameMetEnEchecRoi(echiquier5,3,3));

        // Cas : rangées

        int[][] echiquier6 = {
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 3, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0,-2, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0}
        };

        assertFalse(DeplacementDame.dameMetEnEchecRoi(echiquier6,3,3));
        int[][] echiquier7 = {
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 3, 5,-2, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertFalse(DeplacementDame.dameMetEnEchecRoi(echiquier7,3,3));
        int[][] echiquier8 = {
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0,-2, 0, 0, 0, 0},
                { 0, 0, 0, 1, 0, 0, 0, 0},
                { 0, 5, 0, 3, -4,-2, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 2, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertFalse(DeplacementDame.dameMetEnEchecRoi(echiquier8,3,3));

        int[][] echiquier9 = {
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0,-3, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 2, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertTrue(DeplacementDame.dameMetEnEchecRoi(echiquier9,3,3));

        int[][] echiquier10 = {
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0,-2, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 3, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertTrue(DeplacementDame.dameMetEnEchecRoi(echiquier10,3,3));

        int[][] echiquier11 = {
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0,-2, 0, 3, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertTrue(DeplacementDame.dameMetEnEchecRoi(echiquier11,3,3));

        int[][] echiquier12 = {
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 3, 0,-2, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertTrue(DeplacementDame.dameMetEnEchecRoi(echiquier12,3,3));

    }
}