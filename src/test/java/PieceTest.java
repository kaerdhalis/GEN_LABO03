import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PieceTest {

    @Test
    void PieceHasName() {

        Piece piece = new Piece("shoe");

        assertEquals("shoe",piece.getName());
    }
}