import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PieceTest {

    @ParameterizedTest
    @ValueSource(strings = { "shoe", "hat", "auto","ship" })
    void PieceHasName(String name) {

        Piece piece = new Piece(name);

        assertEquals(name,piece.getName());
        assertNotEquals("banane",piece.getName());
    }

    @Test
    void squareIsNullatInit(){

        Piece piece = new Piece("shoe");
        assertNull(piece.isOnSquare());


    }
}