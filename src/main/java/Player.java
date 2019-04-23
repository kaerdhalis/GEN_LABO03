public class Player {

    private String name;
    private Piece piece;

    /**
     *
     * @param name nom du joueur
     * @param piece piece du joueur
     */
    public Player(String name, Piece piece) {
        this.name = name;
        this.piece = piece;
    }

    /**
     *
     * @return nom du joueur
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return piece du joueur
     */
    public Piece getPiece() {
        return piece;
    }
}
