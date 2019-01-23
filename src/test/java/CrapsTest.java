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

    @Test
    public void testRoundOneIfReturnSumOf7IsTrue () {

        // mock for class Dice is getting created
        Dice dice = mock(Dice.class);
        // defines that first call is gonna be a 3 and the second and next ones are 4
        when(dice.roll()).thenReturn(3).thenReturn(4);

        testE = new Craps(dice);
        // games rules say that a game is won if you have a 7. play needs to return true then
        assertTrue(testE.play() == true);
    }

}
