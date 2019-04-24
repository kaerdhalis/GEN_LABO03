import java.util.ArrayList;

public class Board {

    private ArrayList<Square> board;

    public Board() {
        board = new ArrayList<>(40);

        board.add(0, new Square("Go"));
        for (int i = 1; i < 40; i++) {
            board.add(i, new Square("Square " + i));
        }
    }
     public Square StartCase() {

             return board.get(0);
        }


        public Square newPosition(Square previous ,int value){

        int index = board.indexOf(previous);

        return board.get((index+value)%40);

        }

        public Square getSquare(int index){

        return board.get(index);
        }


}
