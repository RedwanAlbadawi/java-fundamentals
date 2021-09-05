package com.fundamentals.lessons;

import com.fundamentals.java.House;

/*
 * This class goes over the Lesson 18 content
 * Expection Handling
 * */
public class Lesson18 {
    House ranch;

    public void exampleThrows() throws NullPointerException {
        System.out.println(ranch.getWindowSize());
    } // end method

    public void exampleException1() {
        int[] values = {2, 4, 6};
        try {
            System.out.println(values[3]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index out of bounds " + ex.getMessage());
        }
    } // end method

    public void exampleException2() {
        String[] names = {"Matt", "Debbie", "Paul"};
        try {
            System.out.println(names[3]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index out of bounds " + ex.getMessage());
        } catch (NullPointerException ax) {
            System.out.println("Null pointer " + ax.getMessage());
        }
    }
} // end class
