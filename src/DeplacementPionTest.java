import static org.junit.jupiter.api.Assertions.*;

public class DeplacementPionTest {
    @org.junit.jupiter.api.Test

    void Peutavancer2Cases(){

        int[][] echiquier1 = {
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { -1,-1,-1, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 1, 1, 1, 1, 1},
                { 0, 0, 0, 0, 0, 0, 0, 0}
        };

        assertTrue(DeplacementPion.Peutavancer2Cases(echiquier1, 6), "Cas du début de partie");

    }


}

