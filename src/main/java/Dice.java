import java.util.Random;

public class Dice {

    private int faceValue = 0;

    public void rollDice(){

        Random rn = new Random();
         faceValue = rn.nextInt(6) + 1;
         System.out.println(faceValue);

    }

    public int getFaceValue() {
        return faceValue;
    }
}
