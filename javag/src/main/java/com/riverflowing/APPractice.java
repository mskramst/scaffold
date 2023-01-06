
package com.riverflowing;

/**
 * Warmups2 on Codingbat.com
 *
 */
public class APPractice
{
    public static String displStreak(String str) {

        int current = 1;
        int max = 0;
        char maxLetter = ' ';

        System.out.println(str);

        for (int i = 0; i < str.length(); i ++) {

           char c = str.charAt(i);

           while (c == str.charAt(i+1) && i < str.length()) {

            current++;
            if (i < str.length() ) 
                i++;
           }
           
            if (current > max) {
                max = current;
                maxLetter = c;
            }
            current = 1;
            //System.out.println(current + " - " + maxLetter);
           System.out.println("i"+i); 
        }

        return max + " " + maxLetter;

    }

    public static String dispStreak(String s ) {
        int count = 0;
        int curCount = 1;
        char maxChar=' ';
        
        for (int i = 0; i < s.length() -1; i++) {
           
            char curChar = s.charAt(i);
            if (curChar == s.charAt(i + 1)) {
                curCount++;
                if (curCount > count) {
                    count = curCount;
                    maxChar = curChar;
                }
            } else {
                if (curCount > count) {
                    count = curCount;
                    maxChar = curChar;
                }
                curCount = 1;
            }
        }
    String result = count + " " + maxChar;
    System.out.println(result);
    return result;

                
    }

}

