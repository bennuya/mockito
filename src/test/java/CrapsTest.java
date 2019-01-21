/*
Craps Test Class
@author celina urwank
@version 118.01-2019
 */

import static org.mockito.Mockito.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class CrapsTest {

    Craps testE;

    /* first round */
    // first roll win 7
    @Test
    public void testRoundOneIfReturnSumOf7IsTrue () {

        // mock for class Dice is getting created
        Dice dice = mock(Dice.class);
        // defines that first call is gonna be a 3 and the second and next ones are 4
        when(dice.roll()).thenReturn(3).thenReturn(4);

        testE = new Craps(dice);
        // game rules say that a game is won if you have a 7. play needs to return true then
        assertTrue(testE.play() == true);
    }

    // first roll win 11
    @Test
    public void testRoundOneIfReturnSumOf11IsTrue () {

        // mock for class Dice is getting created
        Dice dice = mock(Dice.class);
        // defines that first call is going to be a 5 and the second and next ones are 6
        when(dice.roll()).thenReturn(5).thenReturn(6);

        testE = new Craps(dice);
        // game rules say that a game is won if you have an 11. play needs to return true then
        assertTrue(testE.play() == true);
    }

    // first roll lose 2
    @Test
    public void testRoundOneIfReturnSumOf2IsTrue () {

        // mock for class Dice is getting created
        Dice dice = mock(Dice.class);
        // defines that first call is gonna be a 1 and the second and next ones are 1
        when(dice.roll()).thenReturn(1).thenReturn(1);

        testE = new Craps(dice);
        // game rules say that a game is lost if you have a 2. play needs to return false then
        assertTrue(testE.play() == false);
    }

    // first roll lose 3
    @Test
    public void testRoundOneIfReturnSumOf3IsTrue () {

        // mock for class Dice is getting created
        Dice dice = mock(Dice.class);
        // defines that first call is gonna be a 2 and the second and next ones are 1
        when(dice.roll()).thenReturn(2).thenReturn(1);

        testE = new Craps(dice);
        // game rules say that a game is lost if you have a 3. play needs to return false then
        assertTrue(testE.play() == false);
    }

    // first roll lose 12
    @Test
    public void testRoundOneIfReturnSumOf12IsTrue () {

        // mock for class Dice is getting created
        Dice dice = mock(Dice.class);
        // defines that first call is gonna be a 6 and the second and next ones are 6
        when(dice.roll()).thenReturn(6).thenReturn(6);

        testE = new Craps(dice);
        // game rules say that a game is lost if you have a 12. play needs to return false then
        assertTrue(testE.play() == false);
    }


}
