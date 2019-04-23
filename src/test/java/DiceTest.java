import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiceTest {

    @RepeatedTest(10)
    public void diceRollReturnValueBetweenOneAndSix(){
        Dice dice = new Dice();
        dice.rollDice();
        assertFalse(dice.getFaceValue() < 1);
        assertFalse(dice.getFaceValue() > 6);
    }

    @Test
    public void dieHas0ValueAfterInit(){
        Dice d = new Dice();
        assertEquals(0, d.getFaceValue());
        d.rollDice();
        assertNotEquals(0, d.getFaceValue());
    }
}