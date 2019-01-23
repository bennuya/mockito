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

    /* FIRST ROUND */
    // first roll win 7
    @Test
    public void testRoundOneIfReturnSumOf7IsTrue() {

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
    public void testRoundOneIfReturnSumOf11IsTrue() {

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
    public void testRoundOneIfReturnSumOf2IsFalse() {

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
    public void testRoundOneIfReturnSumOf3IsFalse() {

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
    public void testRoundOneIfReturnSumOf12IsFalse() {

        // mock for class Dice is getting created
        Dice dice = mock(Dice.class);
        // defines that first call is gonna be a 6 and the second and next ones are 6
        when(dice.roll()).thenReturn(6).thenReturn(6);

        testE = new Craps(dice);
        // game rules say that a game is lost if you have a 12. play needs to return false then
        assertTrue(testE.play() == false);
    }

    // first roll again
    @Test
    public void testRoundOneIfReturnDefault() {

        // mock for class Dice is getting created
        Dice dice = mock(Dice.class);
        when(dice.roll()).thenReturn(5).thenReturn(5);
    }


    /* SECOND ROUND */
    // first roll lose 7
    @Test
    public void testRoundTwoIfReturnSumOf7IsFalse() {

        // mock for class Dice is getting created
        Dice dice = mock(Dice.class);
        when(dice.roll())
                .thenReturn(5).thenReturn(5)
                .thenReturn(5).thenReturn(2);

        testE = new Craps(dice);
        assertTrue(testE.play() == false);
    }

    // first roll win same sum
    @Test
    public void testRoundTwoIfReturnSumAsBeforeIsTrue() {

        // mock for class Dice is getting created
        Dice dice = mock(Dice.class);
        when(dice.roll())
                .thenReturn(2).thenReturn(2)
                .thenReturn(2).thenReturn(2);

        testE = new Craps(dice);
        assertTrue(testE.play() == true);
    }

    // first roll again
    @Test
    public void testRoundTwoIfReturnDefault() {

        // mock for class Dice is getting created
        Dice dice = mock(Dice.class);
        when(dice.roll())
                .thenReturn(3).thenReturn(1)
                .thenReturn(5).thenReturn(5);
    }


    /* THIRD ROUND */
    // first roll lose 7
    @Test
    public void testRoundThreeIfReturnSumOf7IsFalse() {

        // mock for class Dice is getting created
        Dice dice = mock(Dice.class);
        when(dice.roll())
                .thenReturn(5).thenReturn(5)
                .thenReturn(4).thenReturn(1)
                .thenReturn(3).thenReturn(4);

        testE = new Craps(dice);
        assertTrue(testE.play() == false);
    }

    // first roll win same sum
    @Test
    public void testRoundThreeIfReturnSumAsBeforeIsTrue() {

        // mock for class Dice is getting created
        Dice dice = mock(Dice.class);
        when(dice.roll())
                .thenReturn(5).thenReturn(5)
                .thenReturn(2).thenReturn(2)
                .thenReturn(2).thenReturn(2);

        testE = new Craps(dice);
        assertTrue(testE.play() == true);
    }

    // first roll again
    @Test
    public void testRoundThreeIfReturnDefault() {

        // mock for class Dice is getting created
        Dice dice = mock(Dice.class);
        when(dice.roll())
                .thenReturn(3).thenReturn(1)
                .thenReturn(5).thenReturn(5)
                .thenReturn(2).thenReturn(2);
    }


    /* FOURTH ROUND */
    // first roll lose 7
    @Test
    public void testRoundFourIfReturnSumOf7IsFalse() {

        // mock for class Dice is getting created
        Dice dice = mock(Dice.class);
        when(dice.roll())
                .thenReturn(5).thenReturn(5)
                .thenReturn(4).thenReturn(1)
                .thenReturn(3).thenReturn(2)
                .thenReturn(3).thenReturn(4);

        testE = new Craps(dice);
        assertTrue(testE.play() == true);
    }

    // first roll win same sum
    @Test
    public void testRoundFourIfReturnSumAsBeforeIsTrue() {

        // mock for class Dice is getting created
        Dice dice = mock(Dice.class);
        when(dice.roll())
                .thenReturn(5).thenReturn(5)
                .thenReturn(3).thenReturn(2)
                .thenReturn(2).thenReturn(2)
                .thenReturn(2).thenReturn(2);

        testE = new Craps(dice);
        assertTrue(testE.play() == true);
    }

    // first roll again
    @Test
    public void testRoundFourIfReturnDefault() {

        // mock for class Dice is getting created
        Dice dice = mock(Dice.class);
        when(dice.roll())
                .thenReturn(3).thenReturn(1)
                .thenReturn(5).thenReturn(5)
                .thenReturn(2).thenReturn(2)
                .thenReturn(2).thenReturn(3);
    }

}
