public class IncomeTaxSquare extends Square {

    public IncomeTaxSquare() {
        super("Income Tax Square");
    }

    /**
     * action effectue en arrivant sur la case
     * @param p joueur jouant ce tour
     */
    @Override
    void landedOn(Player p) {

        int w = p.getNetWorth();

        p.removeCash(Math.min(200,w*10/100));
    }
}
