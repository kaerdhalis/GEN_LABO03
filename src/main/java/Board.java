import java.util.ArrayList;

public class Board {

    private static final int SQUARES = 40;
    private static final int GO = 0;
    private ArrayList<Square> board;

    /**
     * constructeur
     */
    public Board() {

        board = new ArrayList<>(SQUARES);

        board.add(0, new GoSquare());
        for (int i = 1; i < SQUARES; i++) {
            board.add(i, new RegularSquare("Square " + i));
        }

    }

    /**
     *
     * @return case de depart
     */
     public Square StartCase() {

             return board.get(GO);
        }


    /**
     *
     * @param previous ancienne case
     * @param value valeur tiree par le de
     * @return nouvelle case
     */
        public Square newPosition(Square previous ,int value){

        int index = board.indexOf(previous);

        return board.get((index+value)%SQUARES);

        }

    /**
     *
     * @param index  de la case desiree
     * @return case a l'index donne
     */
    public Square getSquare(int index){

        return board.get(index);
        }


}
