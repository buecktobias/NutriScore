package gmo.nutriscore;

import static org.junit.jupiter.api.Assertions.*;
import gmo.nutriscore.NutriScore;
class NutriScoreTest {

    @org.junit.jupiter.api.Test
    void nutriScore() {
        assertEquals(NutriScore.nutriScore(123,50,3,6,4,78,55), 10);
    }
}