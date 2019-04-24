import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class DiceTest {

    @BeforeEach
    void init(TestInfo testInfo) {
        System.out.println("Start... " + testInfo.getDisplayName());
    }

    @RepeatedTest(10)
    @DisplayName("diceRollReturnValueBetweenOneAndSix Test")
    public void diceRollReturnValueBetweenOneAndSix(){
        Dice dice = new Dice();
        dice.rollDice();
        assertFalse(dice.getFaceValue() < 1);
        assertFalse(dice.getFaceValue() > 6);
    }

    @Test
    @DisplayName("dieHas0ValueAfterInit Test")
    public void dieHas0ValueAfterInit(){
        Dice d = new Dice();
        assertEquals(0, d.getFaceValue());
        d.rollDice();
        assertNotEquals(0, d.getFaceValue());
    }
}