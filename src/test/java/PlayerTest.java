import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @BeforeEach
    void init(TestInfo testInfo) {
        System.out.println("Start... " + testInfo.getDisplayName());
    }

    @Test
    @DisplayName("PalyerHasName Test")
    void PalyerHasName() {
        Player player = new Player("bobby",new Piece("auto"),new Dice[2],new Board());

        //verifie que le nom du joueur est bon
        assertEquals("bobby",player.getName());
        assertNotEquals("Sandrine",player.getName());

    }

    @Test
    @DisplayName("PlayerHasPiece Test")
    void PlayerHasPiece() {
        Player player = new Player("bobby",new Piece("auto"),new Dice[2],new Board());

        //verifie que le joueur possede une piece
        assertNotNull(player.getPiece());
        //verifie que le joueur possede la bonne piece
        assertEquals("auto",player.getPiece().getName());

    }

    @Test
    @DisplayName("pieceOnStartCase Test")
    void pieceOnStartCase(){

        Player player = new Player("bobby",new Piece("auto"),new Dice[2],new Board());

        assertEquals(player.getPiece().isOnSquare(),player.getBoard().StartCase());

    }
}