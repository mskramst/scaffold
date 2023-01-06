package com.riverflowing;

/**
 * Hello world!
 *
 */
public class MathUtils 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static int add (int a, int b) {
        return a + b;
    }

    public static double sumValues(double [] arr) {
        double sum = 0;
        for (int i=0; i < arr.length; i ++) {
            sum += arr[i];
        }
        return sum;
    }
}
