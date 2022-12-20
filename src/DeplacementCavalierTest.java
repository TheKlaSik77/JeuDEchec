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
        assertTrue(DeplacementCavalier.cavalierPeutAllerCase(echiquier1, 4, 3, 2, 2));
        assertTrue(DeplacementCavalier.cavalierPeutAllerCase(echiquier1, 4, 3, 2, 4));
        assertTrue(DeplacementCavalier.cavalierPeutAllerCase(echiquier1, 4, 3, 3, 1));
        assertTrue(DeplacementCavalier.cavalierPeutAllerCase(echiquier1, 4, 3, 3, 5));
        assertTrue(DeplacementCavalier.cavalierPeutAllerCase(echiquier1, 4, 3, 6, 2));
        assertTrue(DeplacementCavalier.cavalierPeutAllerCase(echiquier1, 4, 3, 5, 1));
        assertTrue(DeplacementCavalier.cavalierPeutAllerCase(echiquier1, 4, 3, 5, 5));
        assertTrue(DeplacementCavalier.cavalierPeutAllerCase(echiquier1, 4, 3, 6, 4));

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
        assertFalse(DeplacementCavalier.cavalierPeutAllerCase(echiquier2, 4, 3, 2, 2));
        assertFalse(DeplacementCavalier.cavalierPeutAllerCase(echiquier2, 4, 3, 2, 4));
        assertFalse(DeplacementCavalier.cavalierPeutAllerCase(echiquier2, 4, 3, 3, 1));
        assertFalse(DeplacementCavalier.cavalierPeutAllerCase(echiquier2, 4, 3, 3, 5));
        assertFalse(DeplacementCavalier.cavalierPeutAllerCase(echiquier2, 4, 3, 6, 2));
        assertFalse(DeplacementCavalier.cavalierPeutAllerCase(echiquier2, 4, 3, 5, 1));
        assertFalse(DeplacementCavalier.cavalierPeutAllerCase(echiquier2, 4, 3, 5, 5));
        assertFalse(DeplacementCavalier.cavalierPeutAllerCase(echiquier2, 4, 3, 6, 4));

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
        assertTrue(DeplacementCavalier.cavalierPeutAllerCase(echiquier3, 4, 3, 2, 2));
        assertTrue(DeplacementCavalier.cavalierPeutAllerCase(echiquier3, 4, 3, 2, 4));
        assertTrue(DeplacementCavalier.cavalierPeutAllerCase(echiquier3, 4, 3, 3, 1));
        assertTrue(DeplacementCavalier.cavalierPeutAllerCase(echiquier3, 4, 3, 3, 5));
        assertTrue(DeplacementCavalier.cavalierPeutAllerCase(echiquier3, 4, 3, 6, 2));
        assertTrue(DeplacementCavalier.cavalierPeutAllerCase(echiquier3, 4, 3, 5, 1));
        assertTrue(DeplacementCavalier.cavalierPeutAllerCase(echiquier3, 4, 3, 5, 5));
        assertTrue(DeplacementCavalier.cavalierPeutAllerCase(echiquier3, 4, 3, 6, 4));

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

        assertFalse(DeplacementCavalier.cavalierPeutAllerCase(echiquier4, 4, 3, 2, 2));
        assertFalse(DeplacementCavalier.cavalierPeutAllerCase(echiquier4, 4, 3, 2, 4));
        assertFalse(DeplacementCavalier.cavalierPeutAllerCase(echiquier4, 4, 3, 3, 1));
        assertFalse(DeplacementCavalier.cavalierPeutAllerCase(echiquier4, 4, 3, 3, 5));
        assertFalse(DeplacementCavalier.cavalierPeutAllerCase(echiquier4, 4, 3, 6, 2));
        assertFalse(DeplacementCavalier.cavalierPeutAllerCase(echiquier4, 4, 3, 5, 1));
        assertFalse(DeplacementCavalier.cavalierPeutAllerCase(echiquier4, 4, 3, 5, 5));
        assertFalse(DeplacementCavalier.cavalierPeutAllerCase(echiquier4, 4, 3, 6, 4));

    }

    @Test
    void deplacerCavalier() {

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
        DeplacementCavalier.deplacerCavalier(echiquier5, 4, 3, 2, 2);
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
        DeplacementCavalier.deplacerCavalier(echiquier7, 4, 3, 2, 4);
        assertArrayEquals(echiquier8, echiquier7);
    }

    @Test
    void cavalierMetEnEchecRoi() {
        int[][] echiquier1 = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0,-2, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 5, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };

        assertTrue(DeplacementCavalier.cavalierMetEnEchecRoi(echiquier1, 4, 3));

        int[][] echiquier2 = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, -2, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 5, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertTrue(DeplacementCavalier.cavalierMetEnEchecRoi(echiquier2, 4,3));

        int[][] echiquier3 = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 5, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, -2, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertTrue(DeplacementCavalier.cavalierMetEnEchecRoi(echiquier3, 4,3));

        int[][] echiquier4 = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 5, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, -2, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertTrue(DeplacementCavalier.cavalierMetEnEchecRoi(echiquier4, 4,3));

        int[][] echiquier5 = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, -2, 0, 0},
                {0, 0, 0, 5, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertTrue(DeplacementCavalier.cavalierMetEnEchecRoi(echiquier5, 4,3));

        int[][] echiquier6 = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, -2, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 5, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertTrue(DeplacementCavalier.cavalierMetEnEchecRoi(echiquier6, 4,3));

        int[][] echiquier7 = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 5, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, -2, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertTrue(DeplacementCavalier.cavalierMetEnEchecRoi(echiquier7, 4,3));

        int[][] echiquier8 = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 5, 0, 0, 0, 0},
                {0, -2, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertTrue(DeplacementCavalier.cavalierMetEnEchecRoi(echiquier8, 4,3));

        int[][] echiquier1Bis = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 2, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, -5, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };

        assertTrue(DeplacementCavalier.cavalierMetEnEchecRoi(echiquier1Bis, 4, 3));

        int[][] echiquier2Bis = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 2, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0,-5, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertTrue(DeplacementCavalier.cavalierMetEnEchecRoi(echiquier2Bis, 4,3));

        int[][] echiquier3Bis = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, -5, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 2, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertTrue(DeplacementCavalier.cavalierMetEnEchecRoi(echiquier3Bis, 4,3));

        int[][] echiquier4Bis = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, -5, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 2, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertTrue(DeplacementCavalier.cavalierMetEnEchecRoi(echiquier4Bis, 4,3));

        int[][] echiquier5Bis = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 0},
                {0, 0, 0, -5, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertTrue(DeplacementCavalier.cavalierMetEnEchecRoi(echiquier5Bis, 4,3));

        int[][] echiquier6Bis = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 2, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, -5, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertTrue(DeplacementCavalier.cavalierMetEnEchecRoi(echiquier6Bis, 4,3));

        int[][] echiquier7Bis = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, -5, 0, 0, 0, 0},
                {0, 2, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertTrue(DeplacementCavalier.cavalierMetEnEchecRoi(echiquier7Bis, 4,3));


        int[][] echiquier8Bis = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, -5, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertTrue(DeplacementCavalier.cavalierMetEnEchecRoi(echiquier8Bis, 4,3));

        int[][] echiquier9 = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 2, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 5, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertFalse(DeplacementCavalier.cavalierMetEnEchecRoi(echiquier9, 4,3));

        int[][] echiquier9Bis = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, -2, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, -5, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertFalse(DeplacementCavalier.cavalierMetEnEchecRoi(echiquier9Bis, 4,3));

        int[][] echiquier10 = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, -2, 0, 0},
                {0, 0, 0, -5, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertFalse(DeplacementCavalier.cavalierMetEnEchecRoi(echiquier10, 4,3));

        int[][] echiquier10Bis = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, -2, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, -5, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertFalse(DeplacementCavalier.cavalierMetEnEchecRoi(echiquier10Bis, 4,3));

        int[][] echiquier11 = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, -5, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, -2, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertFalse(DeplacementCavalier.cavalierMetEnEchecRoi(echiquier11, 4,3));
        int[][] echiquier11Bis = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 5, 0, 0, 0, 0},
                {0, 2, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertFalse(DeplacementCavalier.cavalierMetEnEchecRoi(echiquier11Bis, 4,3));

        int[][] echiquier12 = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, -5, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertFalse(DeplacementCavalier.cavalierMetEnEchecRoi(echiquier12, 4,3));
    }
}
