package com.riverflowing;

/**
 * Warmups2 on Codingbat.com
 *
 */
public class Warmups2
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static String stringTimes(String str, int n) {

        String newStr = "";

        for (int i=0; i < n; i ++) {
            newStr += str;
        }
        return newStr;

    }

    public static String frontTimes(String str, int n) {

        String toRepeat;

        if (str.length() >=3) {
           toRepeat = str.substring(0,3);
        } else {
           toRepeat = str;
        }

        String newStr = "";
        for (int i=0; i < n; i ++) {
            newStr += toRepeat;
        }

        return newStr;
    }

    public static int countXX(String str) {

        int xxCount = 0;

        for (int i =0; i < str.length() - 1; i ++) {
            if (str.charAt(i) == 'x' && str.charAt(i+1) == 'x')
                xxCount++;
        }
        return xxCount;
    }

    public static boolean doubleX(String str) {

        if (str.length() < 2) return false;

        int indexOfX = str.indexOf("x");
        return (str.length() >= indexOfX && str.charAt(indexOfX + 1)=='x');
    }

    public static String stringBits(String str) {

        String newStr = "";

        for (int i=0; i < str.length(); i += 2) {
            newStr += str.charAt(i);
        }

        return newStr;
    }
    public static String stringSplosion(String str) {

        String newStr = "";

        for (int i=0; i <= str.length(); i ++) {
            newStr += str.substring(0,i);
        }

        return newStr;
    }

    public static int last2(String str) {

        if (str.length() < 2) return 0;
            String substr = str.substring(str.length() - 2);
        
        int count = 0;

        for (int i=0; i < str.length() - 2; i++) {
            if (str.charAt(i) == substr.charAt(0) && str.charAt(i+1) == substr.charAt(1))
                count ++;
        }
        return count;
    }

    public static int arrayCount9(int [] arr) {

        int count = 0;
        for (int i=0; i < arr.length; i ++) {
            if (arr[i] == 9)
                count++;
        }
        return count;
    }

    public static boolean arrayFront9 (int [] arr) {

        boolean isPresent = false ;
        int arrLength;

        if (arr.length >= 4)
            arrLength = 4;
        else 
            arrLength = arr.length;

        for (int i=0; i < arrLength; i ++) {
            if (arr[i] == 9)
                isPresent = true;
        }
        return isPresent; 
    }
    
    public static boolean array123 (int [] arr) {

        for (int i =0; i < arr.length - 2; i ++) {
            if (arr[i] == 1 && arr[i+1] == 2 && arr[i+2] ==3)
                return true;
        }
        return false;
    } 

    public static int stringMatch (String a, String b) {
        int count = 0;
        int strLength = a.length() < b.length() ? a.length() : b.length();

        for (int i =0; i < strLength - 1; i ++){
            if (a.charAt(i) == b.charAt(i) && a.charAt(i+1) == b.charAt(i+1))
                count ++;
        }
        return count;
    }

    public static String stringX (String str) {
        if (str.length() < 2) return str;
        String newStr = str.substring(0,1);
        for (int i=1; i < str.length()-1; i ++) {
            if (str.charAt(i)!='x')
                newStr += String.valueOf(str.charAt(i));
        }
        return newStr + str.substring(str.length()-1);
    }

    public static int array667 (int [] arr) {
        int count = 0;
        for (int i=0; i <arr.length-1; i ++) {
           if (arr[i] == 6 && arr[i+1] == 6) count++;
           if (arr[i] == 6 && arr[i+1] == 7) count++; 
        }
        return count;
    }

    public static boolean noTriples (int [] nums) {
        int count = 0;
        for (int i=0; i <nums.length-2; i ++) {
           int cVal = nums[i]; 
           if (cVal == nums[i+1] && cVal == nums[i+2]) count++;
        }
        return (count < 1);
    }

    public static boolean has271 (int [] nums) {
        for (int i=0; i <nums.length-2; i ++) {
           int cVal = nums[i];
           if (nums[i + 1] == cVal + 5 && nums[i + 2] == cVal - 1) return true;
        }
        return false;
    }
}
