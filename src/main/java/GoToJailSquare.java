public class GoToJailSquare extends Square {


    public GoToJailSquare() {
        super("GoToJail");
    }

    /**
     * action effectue en arrivant sur la case
     * @param p joueur jouant ce tour
     */
    @Override
    void landedOn(Player p) {

        p.getPiece().movePiece(p.getBoard().JailSquare());

        System.out.println(p.getName() + " go to  "+ p.getPiece().isOnSquare().getName());

    }
}
