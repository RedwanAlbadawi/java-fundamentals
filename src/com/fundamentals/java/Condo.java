package com.fundamentals.java;

/*
* This class is sub class of House & is  part of
* Lesson 12 - Inheritance
* */
public class Condo extends House {

    private String balcony;

    public Condo() {
        System.out.println("Default condo constructor");
    } // end constructor

    public String getBalcony() {
        return balcony;
    } // end method

    public void setBalcony(String balcony) {
        this.balcony = balcony;
    } // end method

    @Override
    public void doorOpenClose(){

        System.out.println("I have no door");
    }

    public void maintenance() {
        System.out.println("Will fix condo issues");
    } // end method

} // end class
