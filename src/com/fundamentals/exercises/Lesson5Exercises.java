package com.fundamentals.exercises;

public class Lesson5Exercises {

    public static void main(String[] args) {
        exercise5Example1();
        exercise5Example2();
        exercise5Example3();
    }

    /*
     * Write a method that will print the output of the number 29 based on the
     *  following number systems. Utilize the following url to get the number
     *  systems equivalent.
     * https://www.rapidtables.com/math/number/Numeral_system.html#numeral
     * Decimal, Hexadecimal, and Binary
     * */
    static void exercise5Example1() {
        // create reference of Lesson5Exercise class here and call the methods
        int valueDecimal = 29; // Decimal value of 29
        int valueHex = 0x1d; // Hexadecimal value of 29
        int valueBinary = 0b11101; // Binary value of 29
        System.out.println(valueDecimal);
        System.out.println(valueHex);
        System.out.println(valueBinary);
    }

    /*
     * Write a method using a Widening conversion from/to the following types
     * and print the results.
     * */
    static void exercise5Example2() {
        byte byteValue = 10;
        short shortValue = 250;
        int intValue = 1993;
        int intValue2 = byteValue; // byte to int
        long longValue = shortValue; // short to long
        float floatValue = intValue; //int to float
        System.out.println(intValue2);
        System.out.println(longValue);
        System.out.println(floatValue);
    } // end method

    /*
     *Write a method using a Narrowing conversion from/to the following types
     * and print the results.
     * */
    static void exercise5Example3() {
        double douvleValue = 99D;
        float floatValue = 75.53F;
        long longValue = 10_000_575_375L;
        long longValue2 = (long) douvleValue; // double to long
        int intValue = (int) floatValue; // float to int
        short shortValue = (short) longValue; // long to short
        System.out.println(longValue2);
        System.out.println(intValue);
        System.out.println(shortValue);
    }
}
