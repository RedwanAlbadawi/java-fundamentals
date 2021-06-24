package com.fundamentals.lessons;

/*
 *
 */

public class Lesson12 {

    private int height = 0;
    private int width = 0;

    public Lesson12(){}

    public Lesson12(int height, int width) {
        this.height = height;
        this.width = width;
    } // end method

    public double calculateArea() {
        System.out.println("Area of a square, rectangle or parallogram");
        return height * width;
    } // end method

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
} // end class
