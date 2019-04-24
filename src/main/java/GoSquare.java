public class GoSquare extends Square {

    private static final int GO_CASH = 200;

    public GoSquare() {
        super("Go");
    }

    public void landedOn(Player p){

        p.addCash(GO_CASH);
    }
}
