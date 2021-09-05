package com.fundamentals.exercises;

public class Lesson6Exercises {

    public static void main(String[] args) {
        exercise6Example("Kansas City");
        exercise6Example2();
        exercise6Example3();
    }

    /*
    * Write a method that takes a string parameter. Inside this method,
    * create a statement(s) that will take that string and print it out
    * in lowercase.
     */
    static void exercise6Example(String myString) {
        System.out.println(myString.toLowerCase());
    }

    /*
    * Write a method that will print out the Pilcrow Sign using the char
    * primitive type. Utilize this url to complete this.
    * https://www.online-toolz.com/tools/character-map.php
    * */
    static void exercise6Example2() {
        System.out.println('\u00B6');
    }

    /*
     * Write a method that will display a poem. Utilizing 1 string and
     * 1 println statement, print out the below Jack & Jill poem with
     * each verse on its own line.
     * Output:
     * Jack and Jill
     * Went up the hill
     * To fetch a pail of water.
     * Jack fell down and broke his crown
     * And Jill came tumbling after.
     */

    static void exercise6Example3(){
        String poem = "Jack and Jill  " +
                "\n Went up the pail of water" +
                "\n To fetch a pail of water." +
                "\n Jack fell down and broke his crown" +
                "\n And Jill came tumbling after.";
        System.out.println(poem);
    }

}
