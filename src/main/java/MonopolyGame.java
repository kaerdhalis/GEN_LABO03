import java.util.Scanner;

public class MonopolyGame {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int nbPlayer = 0;
        while(nbPlayer<2|| nbPlayer>8) {
            System.out.println("Enter number of players");
            nbPlayer = in.nextInt();
        }
        Dice dices[] = new Dice[2];

        Board board = new Board();

        Player players[] = new Player[nbPlayer];

        for(int i = 0;i <nbPlayer;i++){
            players[i] = new Player("Joueur"+i,new Piece("piece"+i),dices,board);

        }

        Dice dice1 = new Dice();
        Dice dice2 = new Dice();


    }
}


