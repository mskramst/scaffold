
package com.riverflowing;

import static org.junit.Assert.*;

import org.junit.Test;

public class Warmups2Test 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void displayStringNTimes() {
        assertEquals("HiHiHi", Warmups2.stringTimes("Hi", 3));
        assertEquals("aaaaa", Warmups2.stringTimes("a",5));
    }

    @Test 
    public void displayFront3CharsNTimes() {
        assertEquals("appappappappapp", Warmups2.frontTimes("apple",5));
        assertEquals("ababab", Warmups2.frontTimes("ab", 3));
        assertEquals("aaaaaa", Warmups2.frontTimes("a", 6));
        assertEquals("", Warmups2.frontTimes("", 2));
    }
    @Test
    public void displayTotalDoubleXsInString() {
        assertEquals(1, Warmups2.countXX("xx"));
        assertEquals(2, Warmups2.countXX("xxx"));
        assertEquals(3, Warmups2.countXX("xxxx"));
    }
    @Test
    public void displayIfDoubleXXIsFirstInString() {
        assertEquals(true, Warmups2.doubleX("axxbb"));
        assertEquals(false, Warmups2.doubleX("axaxax"));
        assertEquals(true, Warmups2.doubleX("xxxxxxx"));
        assertEquals(false, Warmups2.doubleX(""));
    }
    @Test
    public void displayEveryOtherCharInString() {
        assertEquals("Hlo", Warmups2.stringBits("Hello"));
        assertEquals("H", Warmups2.stringBits("H"));
        assertEquals("Gobe", Warmups2.stringBits("Goodbye"));
    }
    @Test
    public void expandStringByOneCharAtEndTilWordComplete () {
        assertEquals("CCoCodCode", Warmups2.stringSplosion("Code"));
        assertEquals("aababc", Warmups2.stringSplosion("abc"));
        assertEquals("aab", Warmups2.stringSplosion("ab"));
    }

    @Test
    public void determineHowOftenSubstringAppearsInString () {
        assertEquals(1, Warmups2.last2("hixxxhi"));
        assertEquals(2, Warmups2.last2("hixxhixxhixx"));
        assertEquals(0, Warmups2.last2("hihihixx"));
        assertEquals(0, Warmups2.last2(""));
    }
    @Test 
    public void countTotalNumberOf9sInArray () {
        int[] arr1 = {9,9,9};
        assertEquals(3, Warmups2.arrayCount9(arr1));
        int[] arr2 = {0, 1, 2, 3};
        assertEquals(0, Warmups2.arrayCount9(arr2));
        int[] arr3 = {1, 2, 3, 4, 9, 5, 6};
        assertEquals(1, Warmups2.arrayCount9(arr3));
    }
    @Test
    public void determineIfOneOfFirstFourElementsIs9 () {
        int[] arr1 = {1,2,3,9,5};
        assertEquals(true, Warmups2.arrayFront9(arr1));
        int[] arr2 = {9,1};
        assertEquals(true, Warmups2.arrayFront9(arr2));
        int[] arr3 = {0,1,2,3,5};
        assertEquals(false, Warmups2.arrayFront9(arr3));
    }
    @Test
    public void determineIfSequence123AppearsInArray () {
        int [] arr1 = {1,2,3};
        assertEquals(true, Warmups2.array123(arr1));
        int [] arr2 = {1,2,1,2,1,2};
        assertEquals(false, Warmups2.array123(arr2));
        int [] arr3 = {1,1,1,2,3};
        assertEquals(true, Warmups2.array123(arr3));
    }
    @Test
    public void countSame2CharsInTwoStrings () {
        assertEquals(2, Warmups2.stringMatch("abc", "abc"));
        assertEquals(0, Warmups2.stringMatch("abc", "axc"));
        assertEquals(3, Warmups2.stringMatch("xxcaazz", "xxbaaz"));
    }
    @Test 
    public void removeXsFromString () {
        assertEquals("xHix", Warmups2.stringX("xxHixx"));
        assertEquals("abcd", Warmups2.stringX("abxxxcd"));
        assertEquals("xabcdx", Warmups2.stringX("xabxxxcdx"));
        assertEquals("x", Warmups2.stringX("x"));
    }
    @Test
    public void determineIftwo6sInArrayor7 () {
        int [] arr1 = {6,6,2};
        int [] arr2 = {6,6,2,6};
        int [] arr3 = {6,7,2,6};
        assertEquals(1, Warmups2.array667(arr1));
        assertEquals(1, Warmups2.array667(arr2));
        assertEquals(1, Warmups2.array667(arr3));
    }

    @Test
    public void returnIfArrayContainsNoTriples() {
        int [] arr1 = {1,1,2,2,1};
        int [] arr2 = {1,1,2,2,2,1};
        int [] arr3 = {1,1,1,2,2,2,1};
        assertEquals(true, Warmups2.noTriples(arr1));
        assertEquals(false, Warmups2.noTriples(arr2));
        assertEquals(false, Warmups2.noTriples(arr3));
    }

    @Test
    public void returnTrueIfContains271pattern () {
        int [] arr1 = {2, 7, 1, 3};
        int [] arr2 = {1, 3, 8, 2};
        int [] arr3 = {1, 2, 3, 7};
        int [] arr4 = {10, 15, 9, 7, 1};
        assertEquals(true, Warmups2.has271(arr1));
        assertEquals(true, Warmups2.has271(arr2));
        assertEquals(false, Warmups2.has271(arr3));
        assertEquals(true, Warmups2.has271(arr4));
    }
}
