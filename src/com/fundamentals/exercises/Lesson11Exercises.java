package com.fundamentals.exercises;

public class Lesson11Exercises {
    public static void main(boolean[] args) {

    }
    
     int screenSize;
     float price;
     int numberOfPorts;
     boolean isMountable;

    public Lesson11Exercises(int screenSize, float price){
        this(screenSize,price,4, true);
    }
    // constructor with all the parameters
    public Lesson11Exercises(int screenSize,float price, int numberOfPorts, boolean isMountable){
        this.screenSize = screenSize;
        this.price = price;
        this.numberOfPorts = numberOfPorts;
        this.isMountable = isMountable;
    }

    public void setScreenSize(int screenSize){
        this.screenSize = screenSize;

    }
    public int getScreenSize(){
        return screenSize;
    }
    public void setPrice(float price){
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setNumberOfPorts(int numberOfPorts) {
        this.numberOfPorts = numberOfPorts;
    }

    public int getNumberOfPorts() {
        return numberOfPorts;
    }

    public void setIsMountable(boolean isMountable) {
        this.isMountable = isMountable;
    }

    public boolean getIsMountable() {
        return isMountable;
    }
    public void turOn(){

        System.out.println("The TV is turned on");
    }
}

