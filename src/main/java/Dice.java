import java.util.Random;

public class Dice {

    private int faceValue = 0;

    /**
     * roule le de et sort value entre 1 et 6
     */
    public void rollDice(){

        Random rn = new Random();
         faceValue = rn.nextInt(6) + 1;
         System.out.println(faceValue);

    }

    /**
     *
     * @return la valeur sur la face du de
     */
    public int getFaceValue() {
        return faceValue;
    }
}
