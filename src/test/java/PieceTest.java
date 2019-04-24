import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PieceTest {

    @BeforeEach
    void init(TestInfo testInfo) {
        System.out.println("Start..." + testInfo.getDisplayName());
    }

    @ParameterizedTest
    @ValueSource(strings = { "shoe", "hat", "auto","ship" })
    @DisplayName("PieceHasName Test")
    void PieceHasName(String name) {

        Piece piece = new Piece(name);

        assertEquals(name,piece.getName());
        assertNotEquals("banane",piece.getName());
    }

    @Test
    @DisplayName("squareIsNullatInit Test")
    void squareIsNullatInit(){

        Piece piece = new Piece("shoe");
        assertNull(piece.isOnSquare());


    }
}