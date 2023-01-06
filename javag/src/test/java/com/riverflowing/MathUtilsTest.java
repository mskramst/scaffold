package com.riverflowing;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class MathUtilsTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void shouldAddTwoValues() {
        assertEquals(3, MathUtils.add(1,2));
    }

    @Test
    public void shouldSumValuesInArray() {
        double [] arr = {1.0,2.2,3.0,4.0,5.0,6.0};
        assertEquals(21.2, MathUtils.sumValues(arr),0);
    }
}
