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

        assertTrue(DeplacementDame.damePeutAller(echiquier1,3,3,0,3));
        assertTrue(DeplacementDame.damePeutAller(echiquier1,3,3,7,3));
        assertTrue(DeplacementDame.damePeutAller(echiquier1,3,3,3,0));
        assertTrue(DeplacementDame.damePeutAller(echiquier1,3,3,3,7));
        assertTrue(DeplacementDame.damePeutAller(echiquier1,3,3,7,7));
        assertTrue(DeplacementDame.damePeutAller(echiquier1,3,3,0,0));
        assertTrue(DeplacementDame.damePeutAller(echiquier1,3,3,0,0));
        assertTrue(DeplacementDame.damePeutAller(echiquier1,3,3,0,6));
        assertTrue(DeplacementDame.damePeutAller(echiquier1,3,3,6,0));

        assertFalse(DeplacementDame.damePeutAller(echiquier1,3,3,4,7));


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

        assertTrue(DeplacementDame.damePeutAller(echiquier2,3,3,4,4));
        assertFalse(DeplacementDame.damePeutAller(echiquier2,3,3,7,3));
        assertFalse(DeplacementDame.damePeutAller(echiquier2,3,3,3,0));
        assertFalse(DeplacementDame.damePeutAller(echiquier2,3,3,3,7));
        assertFalse(DeplacementDame.damePeutAller(echiquier2,3,3,7,7));
        assertFalse(DeplacementDame.damePeutAller(echiquier2,3,3,0,0));
        assertFalse(DeplacementDame.damePeutAller(echiquier2,3,3,0,0));
        assertFalse(DeplacementDame.damePeutAller(echiquier2,3,3,0,6));
        assertFalse(DeplacementDame.damePeutAller(echiquier2,3,3,6,0));
        assertFalse(DeplacementDame.damePeutAller(echiquier2,3,3,2,2));
        assertFalse(DeplacementDame.damePeutAller(echiquier1,3,3,4,7));

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
}