public class Board {

    private Square[] board;

    public Board() {
        board = new Square[40];

        board[0] = new Square("Go");
        for (int i = 1; i < 40; i++) {
            board[i] = new Square("Square " + i);
        }
    }
     public Square StartCase() {

             return board[0];
        }


}
