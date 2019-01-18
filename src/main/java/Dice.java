/*
Dice Class
@author celina urwank
@version 11. January 2019
 */

import java.util.Random;

public class Dice {

   // attributes
   private Random random;

   // constructor
   public Dice() {
      random = new Random();
   }

   // roll method for Main Class
   public int roll() {
      return (random.nextInt(5)+1);
   }

}