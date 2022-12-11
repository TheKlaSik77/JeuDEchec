import static org.junit.jupiter.api.Assertions.*;

class MethodesDeplacementsTest {

    @org.junit.jupiter.api.Test
    void caseVide() {
        int[][] echiquier = AffichageEchiquier.creerEtRemplirEchiquier();

        assertTrue(MethodesDeplacements.caseVide(echiquier,5,5));
        assertFalse(MethodesDeplacements.caseVide(echiquier,2,1));
    }
}