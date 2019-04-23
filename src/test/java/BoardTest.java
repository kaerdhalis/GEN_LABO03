import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    void startCase() {
        Board board = new Board();
        assertEquals(board.StartCase(),new Square("Go"));

    }
}