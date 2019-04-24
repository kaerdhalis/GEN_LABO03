import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.*;

class GoToJailSquareTest {

    @BeforeEach
    void init(TestInfo testInfo) {
        System.out.println("Start... " + testInfo.getDisplayName());
    }

    @Test
    @DisplayName("GoToJailSquaresendTojail Test")
    void GoToJailSquaresendTojail() {

        Square square = new GoToJailSquare();

        Player p = new Player("steve",new Piece("shoe"),new Dice[2],new Board());
        square.landedOn(p);
        assertEquals(p.getPiece().isOnSquare(),p.getBoard().JailSquare());
    }





}