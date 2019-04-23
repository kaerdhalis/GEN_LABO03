public class Piece {

    private String name;
    private Square location = null;

    /**
     *
     * @return nom de la piece
     */
    public String getName() {
        return name;
    }

    /**
     * change la piece de case
     * @param square nouvelle case
     */
    public void movePiece(Square square){

        this.location = square;
    }

    /**
     *
     * @return nom de la case ou se situe la piece
     */

    public Square isOnSquare(){

        return location;
    }

    /**
     *
     * @param name nom de la piece
     */
    public Piece(String name) {
        this.name = name;
    }
}
