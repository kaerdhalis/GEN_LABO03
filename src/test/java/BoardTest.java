import org.junit.jupiter.api.*;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @BeforeEach
    void init(TestInfo testInfo) {
        System.out.println("Start..." + testInfo.getDisplayName());
    }

    @Test
    @DisplayName("startCase Test")
    void startCase() {
        Board board = new Board();
        assertEquals(board.StartCase(),new GoSquare());
    }

    @RepeatedTest(5)
    @DisplayName("changePosition Test")
    void changePosition(){


        Board board = new Board();
        Random rn = new Random();
        int value = rn.nextInt(40);

        int faceValue = rn.nextInt(12) + 1;

        Square square = board.getSquare(value);

        assertEquals(board.getSquare((value + faceValue)%40),board.newPosition(square,faceValue));
    }


    @Test
    @DisplayName("hasSpecialSquare Test")
    void hasSpecialSquare() {
        Board board = new Board();

        assertEquals(board.StartCase(),new GoSquare());
        assertEquals(board.JailSquare(),new JailSquare());

        assertNotEquals(board.StartCase(),board.JailSquare());

    }

}