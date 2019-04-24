import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.*;

class IncomeTaxSquareTest {

    @BeforeEach
    void init(TestInfo testInfo) {
        System.out.println("Start... " + testInfo.getDisplayName());
    }

    @Test
    @DisplayName("IncomeSquarewithMorethan2000 Test")
    void IncomeSquarewithMoreThan200() {

        Square square = new IncomeTaxSquare();

        Player p = new Player("steve",new Piece("shoe"),new Dice[2],new Board());
        square.landedOn(p);
        assertTrue(p.getNetWorth()==1300);

    }

    @Test
    @DisplayName("IncomeSquarewithLessThan200 Test")
    void IncomeSquarewithLessThan200() {

        Square square = new IncomeTaxSquare();

        Player p = new Player("steve",new Piece("shoe"),new Dice[2],new Board());
        p.removeCash(1400);
        square.landedOn(p);
        assertTrue(p.getNetWorth()==90);

    }

}