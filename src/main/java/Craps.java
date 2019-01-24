/*
Craps (Main) Class
@author celina urwank
@version 11. January 2019
 */

public class Craps {

    // attributes
    private Dice dice;

    // constructor
    public Craps(Dice dice) {
        this.dice = dice;
    }

    // main method
    public static void main(String[] args) {

        Dice myDice = new Dice();
        Craps myCraps = new Craps(myDice);

        if (myCraps.play()) {
            System.out.println("That's a Win!");
        } else {
            System.out.println("You lost!");
        }
    }

    // play method
    public boolean play() {
        int sum = 0;
        int oldSum = 0;

        // 1st round
        sum = dice.roll();
        sum = sum + dice.roll();

        switch (sum) {
            case 7:
            case 11: // case 11 was added because it was missing
                return true;

            case 2:
            case 3: // case 3 was added because it was missing
            case 12:
                return false;

            default:
                break;
        }

        // other following rounds
        while (true) {
            oldSum = sum;
            sum = dice.roll();
            sum = sum + dice.roll();

            if (sum == oldSum) {
                return true;
            } else if (sum == 7) {
                return false;
            }
        }
        // for the while loop to work, you have to remove the break and the return false statements

    }
}