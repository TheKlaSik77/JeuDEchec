import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodesDeplacementsTest {

    @org.junit.jupiter.api.Test
    void caseVide() {
        int[][] echiquier = AffichageEchiquier.creerEtRemplirEchiquier();

        assertTrue(MethodesDeplacements.caseVide(echiquier,5,5));
        assertFalse(MethodesDeplacements.caseVide(echiquier,2,1));
    }

    @Test
    void testCaseArriveeDifferentCamp(){
        int[][] echiquier1 = {
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0,-2, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 3, 2, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0}
        };

        assertTrue(MethodesDeplacements.testCaseArriveeDifferentCamp(echiquier1,3,3,1,3));
        assertFalse(MethodesDeplacements.testCaseArriveeDifferentCamp(echiquier1,3,3,3,4));
        assertTrue(MethodesDeplacements.testCaseArriveeDifferentCamp(echiquier1,3,3,3,2));
    }

    @Test
    void testPieceMetEnEchec(){
        int[][] echiquier1 = {
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0,-4, 0, 0, 0},
                { 0, 0, 0, 2, 0,-3, 0, 0},
                { 0, 0, 0, 1, 0, 0, 0, 0},
                { 0, 0, 0,-5, 0, 0, 0, 0},
                { 0, 0, 0, 0, 4, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0,-2, 0}
        };

        assertFalse(MethodesDeplacements.testPieceMetEnEchec(echiquier1,4,3));
        assertTrue(MethodesDeplacements.testPieceMetEnEchec(echiquier1,1,4));
        assertTrue(MethodesDeplacements.testPieceMetEnEchec(echiquier1,2,5));
        assertFalse(MethodesDeplacements.testPieceMetEnEchec(echiquier1,2,3));


        int[][] echiquier2 = {
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0,-4, 0, 0, 0},
                { 0, 0, 0, 2, 0,-3, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 5, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0}
        };

        assertTrue(MethodesDeplacements.testPieceMetEnEchec(echiquier2,1,4));
        assertTrue(MethodesDeplacements.testPieceMetEnEchec(echiquier2,2,5));

    }

    @Test
    void piecePeutBouger(){

        int[][] echiquier1 = {
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 2, 0, 0, 0, 0},
                { 0, 0, 0, 1, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0}
        };

        assertFalse(MethodesDeplacements.piecePeutBouger(echiquier1,3,3));
        assertTrue(MethodesDeplacements.piecePeutBouger(echiquier1,2,3));

        int[][] echiquier2 = {
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0,-3, 0, 0, 0},
                { 0, 0, 0, 0, 0,-3, 0, 0},
                { 0, 0, 0, 2, 0, 0, 0, 0},
                { 0, 0, 0,-3, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertFalse(MethodesDeplacements.piecePeutBouger(echiquier2,3,3));
    }

    @Test
    void partieEstNulle(){

        int[][] echiquier1 = {
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0,-3, 0, 0},
                { 0, 0, 0, 2, 0, 0, 0, 0},
                { 0,-3, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0}
        };

        assertTrue(MethodesDeplacements.partieEstNulle(echiquier1,1,40));

        int[][] echiquier2 = {
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 3, 0, 0},
                { 0, 0, 0,-2, 0, 0, 0, 0},
                { 0, 3, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0}
        };

        assertTrue(MethodesDeplacements.partieEstNulle(echiquier2,2,40));


        int[][] echiquier3 = {
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 3, 0, 0},
                { 0, 0, 0,-2, 0, 0, 0, 0},
                { 0, 3, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0,-1, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertFalse(MethodesDeplacements.partieEstNulle(echiquier3,2,40));

    }
}