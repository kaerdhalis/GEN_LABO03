import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void PalyerHasName() {
        Player player = new Player("bobby",new Piece("auto"));

        //verifie que le nom du joueur est bon
        assertEquals("bobby",player.getName());
        assertNotEquals("Sandrine",player.getName());

    }

    @Test
    void PlayerHasPiece() {
        Player player = new Player("bobby",new Piece("auto"));

        //verifie que le joueur possede une piece
        assertNotNull(player.getPiece());
        //verifie que le joueur possede la bonne piece
        assertEquals("auto",player.getPiece().getName());

    }
}