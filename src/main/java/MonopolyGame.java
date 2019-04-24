import java.util.Scanner;

public class MonopolyGame {

    private static final int NUMBER_TURN = 40;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int nbPlayer = 0;

        //recuperation  nombre de joueurs
        while(nbPlayer<2|| nbPlayer>8) {
            System.out.println("Enter number of players");
            nbPlayer = in.nextInt();
        }

        //creation des des
        Dice dices[] = new Dice[]{
                new Dice(),new Dice()};

        //creation du board
        Board board = new Board();

        //initialisation des joueurs
        Player players[] = new Player[nbPlayer];
        for(int i = 0;i <nbPlayer;i++){
            players[i] = new Player("Joueur"+i,new Piece("piece"+i),dices,board);

        }

        //tours de jeux
        for(int i = 0; i<NUMBER_TURN; i++){

            for(Player player :players){
                player.playTurn();
            }
        }

    }
}


