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
}