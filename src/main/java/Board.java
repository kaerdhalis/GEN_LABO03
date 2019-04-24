import java.util.ArrayList;
import java.util.Random;

public class Board {

    private static final int SQUARES = 40;
    private static final int GO = 0;
    private static final int JAIL = 20;
    private ArrayList<Square> board;

    /**
     * constructeur
     */
    public Board() {

        board = new ArrayList<>(SQUARES);

        board.add(GO, new GoSquare());


        Random rn = new Random();
        int gotojail = rn.nextInt(JAIL);

        int income = rn.nextInt(SQUARES - JAIL + 1) + JAIL+1;

        for (int i = 1; i < SQUARES; i++) {

            if(i == gotojail)
                board.add(i, new GoToJailSquare());

            else if(i == income)
                board.add(i, new IncomeTaxSquare());
            else
            board.add(i, new RegularSquare("Square " + i));
        }
        board.add(JAIL, new JailSquare());

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
     * @return case de prison
     */
    public Square JailSquare() {

        return board.get(JAIL);
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
