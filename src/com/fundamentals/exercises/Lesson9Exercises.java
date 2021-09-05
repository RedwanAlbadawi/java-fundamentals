package com.fundamentals.exercises;

public class Lesson9Exercises {
    public static void main(String[] args) {
        exercise6Example();
        exercise6Example2();
    }

    /*
    * Write a method that takes no parameters or return type.
    * Write a single dimensional string array of ice cream
    * flavors and print out the results of that array using
    * a loop.
     */
    static void exercise6Example(){
        String[] iceCreamFlavor = {"Vanilla", "Chocolate", "Cookies N' Cream",
                "Mint Chocolate Chip", "Coconut", "Cookie Dough"};
        for (int i = 0; i < iceCreamFlavor.length; i++){
            System.out.println(iceCreamFlavor[i]);
        }
    }

    /*
    * Write a method that takes no parameters or return type.
    * Write a two-dimensional array using the int data type.
    * Using a search engine, fill in each dimension with the
    * Chiefs football scores from the 2019 regular season.
    * Using a loop, print out the results. The first dimension
    * will be the home team while the second dimension will
    * be the away team.*/
    static void exercise6Example2(){
        int[][] myArray = {{26, 40}, {10, 28}, {33, 28}, {30, 34},
                {13, 19}, {24, 31}, {6, 30}, {24, 31}, {26, 23},
                {35, 32}, {17, 24}, {40, 9}, {16, 23}, {23, 3},
                {3, 26}, {31, 21}};
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                if (j == 0 ) {
                    System.out.println("Home team " + myArray[i][j] );
                } else {
                    System.out.println("Away team " + myArray[i][j]);

                }
            }
        }
    }
}
