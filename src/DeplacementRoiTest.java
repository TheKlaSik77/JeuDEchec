import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeplacementRoiTest {

    @Test
    void roiPeutAllerCase() {

        int[][] echiquier1 = {
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0,-4, 0, 0, 0},
                { 0, 0, 0, 0, 0,-3, 0, 0},
                { 0, 0, 0, 2, 0, 0, 0, 0},
                { 0, 0, 0, 6, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0}
        };

        assertFalse(DeplacementRoi.roiPeutAllerCase(echiquier1,3,3,7,3));
        assertFalse(DeplacementRoi.roiPeutAllerCase(echiquier1,3,3,4,3));
        assertFalse(DeplacementRoi.roiPeutAllerCase(echiquier1,3,3,3,4));
        assertFalse(DeplacementRoi.roiPeutAllerCase(echiquier1,3,3,2,3));
        assertFalse(DeplacementRoi.roiPeutAllerCase(echiquier1,3,3,2,2));
        assertFalse(DeplacementRoi.roiPeutAllerCase(echiquier1,3,3,2,4));
        assertFalse(DeplacementRoi.roiPeutAllerCase(echiquier1,3,3,3,4));
        assertTrue(DeplacementRoi.roiPeutAllerCase(echiquier1,3,3,4,4));
        assertFalse(DeplacementRoi.roiPeutAllerCase(echiquier1,3,3,3,2));



        int[][] echiquier2 = {
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 4, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0,-2, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertFalse(DeplacementRoi.roiPeutAllerCase(echiquier2,3,3,7,3));
        assertFalse(DeplacementRoi.roiPeutAllerCase(echiquier2,3,3,2,3));
    }

    @Test
    void deplacerRoi() {
        int[][] echiquier1 = {
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 4, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0,-2, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0}
        };

        int[][] echiquier2 = {
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 4, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0,-2, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0}
        };
        DeplacementRoi.deplacerRoi(echiquier1,3,3,4,3);
        assertArrayEquals(echiquier1,echiquier2);
    }

    @Test
    void roiMetEnEchecRoi() {
        int[][] echiquier1 = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 2, 0, 0, 0, 0},
                {0, 0, 0, -2, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertTrue(DeplacementRoi.roiMetEnEchecRoi(echiquier1, 3, 3));
        assertTrue(DeplacementRoi.roiMetEnEchecRoi(echiquier1, 2, 3));


        int[][] echiquier2 = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 2, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, -2, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertFalse(DeplacementRoi.roiMetEnEchecRoi(echiquier2,4,3));
        assertFalse(DeplacementRoi.roiMetEnEchecRoi(echiquier2,2,3));
    }


    @Test
    void estEchecEtMat(){

        int[][] echiquier1 = {
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0,-3, 0, 0, 0},
                { 0, 0, 0, 0, 0,-3, 0, 0},
                { 0, 0, 0, 2, 0, 0, 0, 0},
                { 0, 0, 0,-3, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertTrue(DeplacementRoi.estEchecEtMat(echiquier1,1));
        int[][] echiquier2 = {
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0,-3, 0, 0, 0},
                { 0, 0, 0, 0, 0,-3, 0, 0},
                { 0, 0, 0, 2, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertFalse(DeplacementRoi.estEchecEtMat(echiquier2,1));

        int[][] echiquier3 = {
                { 0, 6, 0, 0, 0, 0,-2, 0},
                { 0, 0, 0, 0, 0,-1,-1,-1},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertTrue(DeplacementRoi.estEchecEtMat(echiquier3,2));

        int[][] echiquier5 = {
                {-6,-5,-4,-3,-2,-4,-5,-6},
                {-1,-1,-1,-1,-1, 3, 0,-1},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0,-1, 0},
                { 0, 0, 4, 0, 1, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 1, 1, 1, 1, 0, 1, 1, 1},
                { 6, 5, 4, 0, 2, 0, 5, 6}
        };
        assertTrue(DeplacementRoi.estEchecEtMat(echiquier5,2));

        int[][] echiquier6 = {
                {-6,-5,-4,-3,-2,-4,-5,-6},
                {-1,-1,-1, 0,-1, 3, 0,-1},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0,-1, 0},
                { 0, 0, 4, 0, 1, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 1, 1, 1, 1, 0, 1, 1, 1},
                { 6, 5, 4, 0, 2, 0, 5, 6}
        };
        assertFalse(DeplacementRoi.estEchecEtMat(echiquier6,2));
    }
}