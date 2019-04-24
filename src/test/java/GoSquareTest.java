import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class GoSquareTest {

    @BeforeEach
    void init(TestInfo testInfo) {
        System.out.println("Start... " + testInfo.getDisplayName());
    }

    @Test
    @DisplayName("GoSquareGiveCash Test")
    void GoSquareGiveCash() {

        Square square = new GoSquare();

        Player p = new Player("steve",new Piece("shoe"),new Dice[2],new Board());
        square.landedOn(p);
        assertTrue(p.getNetWorth()==1700);
        assertFalse(p.getNetWorth()==1500);
    }

}