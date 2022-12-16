import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DeplacementCavalierTest {

    @Test
    void cavalierPeutAller() {

        int[][] echiquier1 = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0,-1, 0, 0, 0, 0, 0},
                {0,-1, 0, 0, 0,-1, 0, 0},
                {0, 0, 0, 5, 0, 0, 0, 0},
                {0,-1, 0, 0, 0,-1, 0, 0},
                {0, 0,-1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertTrue(DeplacementCavalier.cavalierPeutAller(echiquier1, 4, 3, 2, 2));
        assertTrue(DeplacementCavalier.cavalierPeutAller(echiquier1, 4, 3, 2, 4));
        assertTrue(DeplacementCavalier.cavalierPeutAller(echiquier1, 4, 3, 3, 1));
        assertTrue(DeplacementCavalier.cavalierPeutAller(echiquier1, 4, 3, 3, 5));
        assertTrue(DeplacementCavalier.cavalierPeutAller(echiquier1, 4, 3, 6, 2));
        assertTrue(DeplacementCavalier.cavalierPeutAller(echiquier1, 4, 3, 5, 1));
        assertTrue(DeplacementCavalier.cavalierPeutAller(echiquier1, 4, 3, 5, 5));
        assertTrue(DeplacementCavalier.cavalierPeutAller(echiquier1, 4, 3, 6, 4));

        int[][] echiquier2 = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 5, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 1, 0, 0},
                {0, 0, 1, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertFalse(DeplacementCavalier.cavalierPeutAller(echiquier2, 4, 3, 2, 2));
        assertFalse(DeplacementCavalier.cavalierPeutAller(echiquier2, 4, 3, 2, 4));
        assertFalse(DeplacementCavalier.cavalierPeutAller(echiquier2, 4, 3, 3, 1));
        assertFalse(DeplacementCavalier.cavalierPeutAller(echiquier2, 4, 3, 3, 5));
        assertFalse(DeplacementCavalier.cavalierPeutAller(echiquier2, 4, 3, 6, 2));
        assertFalse(DeplacementCavalier.cavalierPeutAller(echiquier2, 4, 3, 5, 1));
        assertFalse(DeplacementCavalier.cavalierPeutAller(echiquier2, 4, 3, 5, 5));
        assertFalse(DeplacementCavalier.cavalierPeutAller(echiquier2, 4, 3, 6, 4));

        int[][] echiquier3 = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, -5, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertTrue(DeplacementCavalier.cavalierPeutAller(echiquier3, 4, 3, 2, 2));
        assertTrue(DeplacementCavalier.cavalierPeutAller(echiquier3, 4, 3, 2, 4));
        assertTrue(DeplacementCavalier.cavalierPeutAller(echiquier3, 4, 3, 3, 1));
        assertTrue(DeplacementCavalier.cavalierPeutAller(echiquier3, 4, 3, 3, 5));
        assertTrue(DeplacementCavalier.cavalierPeutAller(echiquier3, 4, 3, 6, 2));
        assertTrue(DeplacementCavalier.cavalierPeutAller(echiquier3, 4, 3, 5, 1));
        assertTrue(DeplacementCavalier.cavalierPeutAller(echiquier3, 4, 3, 5, 5));
        assertTrue(DeplacementCavalier.cavalierPeutAller(echiquier3, 4, 3, 6, 4));

        int[][] echiquier4 = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, -1, 0, -1, 0, 0, 0},
                {0, -1, 0, 0, 0, -1, 0, 0},
                {0, 0, 0, -5, 0, 0, 0, 0},
                {0, -1, 0, 0, 0, -1, 0, 0},
                {0, 0, -1, 0, -1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };

        assertFalse(DeplacementCavalier.cavalierPeutAller(echiquier4, 4, 3, 2, 2));
        assertFalse(DeplacementCavalier.cavalierPeutAller(echiquier4, 4, 3, 2, 4));
        assertFalse(DeplacementCavalier.cavalierPeutAller(echiquier4, 4, 3, 3, 1));
        assertFalse(DeplacementCavalier.cavalierPeutAller(echiquier4, 4, 3, 3, 5));
        assertFalse(DeplacementCavalier.cavalierPeutAller(echiquier4, 4, 3, 6, 2));
        assertFalse(DeplacementCavalier.cavalierPeutAller(echiquier4, 4, 3, 5, 1));
        assertFalse(DeplacementCavalier.cavalierPeutAller(echiquier4, 4, 3, 5, 5));
        assertFalse(DeplacementCavalier.cavalierPeutAller(echiquier4, 4, 3, 6, 4));

    }

    @Test
    void seDeplace() {

        int[][] echiquier5 = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0,-1, 0, 0, 0, 0, 0},
                {0,-1, 0, 0, 0,-1, 0, 0},
                {0, 0, 0, 5, 0, 0, 0, 0},
                {0,-1, 0, 0, 0,-1, 0, 0},
                {0, 0,-1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };

        int[][] echiquier6 = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 5, 0, 0, 0, 0, 0},
                {0,-1, 0, 0, 0,-1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0,-1, 0, 0, 0,-1, 0, 0},
                {0, 0,-1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        DeplacementCavalier.seDeplace(echiquier5, 4, 3, 2, 2);
        assertArrayEquals(echiquier6, echiquier5);

        int[][] echiquier7 = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, -5, 0, 0, 0, 0},
                {0,1 , 0, 0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };

        int[][] echiquier8 = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, -5, 0, 0, 0},
                {0,1, 0, 0, 0,1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0,1, 0, 0, 0,1, 0, 0},
                {0, 0,1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        DeplacementCavalier.seDeplace(echiquier7, 4, 3, 2, 4);
        assertArrayEquals(echiquier8, echiquier7);
    }
}
