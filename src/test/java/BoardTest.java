import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    void startCase() {
        Board board = new Board();
        assertEquals(board.StartCase(),new Square("Go"));
    }

    @RepeatedTest(5)
    void changePosition(){


        Board board = new Board();
        Random rn = new Random();
        int value = rn.nextInt(40);

        int faceValue = rn.nextInt(12) + 1;

        Square square = board.getSquare(value);

        assertEquals(board.getSquare((value + faceValue)%40),board.newPosition(square,faceValue));
    }
}