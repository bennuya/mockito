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
            case 11:
                return true;

            case 2:
            case 3:
            case 12:
                return false;

            default:
                break;
        }

        // 2nd round
        while (true) {
            oldSum = sum;
            sum = dice.roll();
            sum = sum + dice.roll();

            if (sum == oldSum) {
                return true;
            } else if (sum == 7) {
                return false;
            }

            break;
        }


        // 3rd round
        while (true) {
            oldSum = sum;
            sum = dice.roll();
            sum = sum + dice.roll();

            if (sum == oldSum) {
                return true;
            } else if (sum == 7) {
                return false;
            }

            break;
        }

        // 4th round
        while (true) {
            oldSum = sum;
            sum = dice.roll();
            sum = sum + dice.roll();

            if (sum == oldSum) {
                return true;
            } else if (sum == 7) {
                return false;
            }

            break;
        }


        return false;

    }
}