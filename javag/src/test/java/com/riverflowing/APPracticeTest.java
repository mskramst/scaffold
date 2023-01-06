
package com.riverflowing;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class APPracticeTest
{

    // display the longest streak of characters in a string
    @Test
    public void displayLongestCharStreak()
    {
        assertEquals("4 T", APPractice.dispStreak("CAAATTTT!!"));
        assertEquals("3 A", APPractice.dispStreak("EXXTRAAA!!"));
        assertEquals("3 U", APPractice.dispStreak("SUUUPPER!!"));
        assertEquals("2 l", APPractice.dispStreak("Balloon!"));
        assertEquals("5 i", APPractice.dispStreak("Electriciiiiity!"));


    }

    
}
