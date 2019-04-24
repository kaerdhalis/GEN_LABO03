public class GoSquare extends Square {

    private static final int GO_CASH = 200;

    /**
     * constructeur
     */
    public GoSquare() {
        super("Go");
    }

    /**
     * action effectue en arrivant sur la case
     * @param p joueur jouant ce tour
     */
    public void landedOn(Player p){

        p.addCash(GO_CASH);

        System.out.println(p.getName() + " receive"+ GO_CASH);
    }
}
