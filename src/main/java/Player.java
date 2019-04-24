public class Player {

    private String name;
    private Piece piece;
    private  Dice[] dices;
    private Board board;



    /**
     *
     * @param name nom du joueur
     * @param piece piece du joueur
     */
    public Player(String name, Piece piece,Dice[] dices,Board board) {
        this.name = name;
        this.piece = piece;
        this.dices = dices;
        this.board = board;

        this.piece.movePiece(board.StartCase());
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

    /**
     *
     * @return board de jeu
     */
    public Board getBoard() {
        return board;
    }


    /**
     * fait un tour de jeu pour le joueur
     */
    public void playTurn(){

        dices[1].rollDice();
        dices[2].rollDice();
        int die = dices[1].getFaceValue() +dices[2].getFaceValue();

        System.out.println(name + "rolled a "+ die);

        Square position = piece.isOnSquare();
        piece.movePiece(board.newPosition(position,die));

        System.out.println(name + "landed on  "+ piece.isOnSquare().getName());

    }
}


