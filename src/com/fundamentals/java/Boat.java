package com.fundamentals.java;

public class Boat {

    private String material;
    private String engine;
    private int capacitySize;
    private String boatColor;

    // Default Constructor
    public Boat() {
        System.out.println("This is the default constructor");
    } // end constructor

    // Constructor with 1 parameter
    public Boat(String boatColor) {
        this.boatColor = boatColor;
        System.out.println("The boat color is " + boatColor);
    } // end constructor

    public Boat(String boatColor, String engine,
                 String material, int capacitySize) {
        this.boatColor = boatColor;
        this.engine = engine;
        this.material = material;
        this.capacitySize = capacitySize;
    } // end constructor

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getCapacitySize() {
        return capacitySize;
    }

    public void setCapacitySize(int capacitySize) {
        this.capacitySize = capacitySize;
    }

    public String getBoatColor() {
        return boatColor;
    }

    public void setBoatColor(String boatColor) {
        this.boatColor = boatColor;
    }
}
