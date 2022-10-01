package com.electronicstore.app.pojos;

/*
    Single Inheritance - If a super class has only one child class and vice versa.
        Device (Super Class)
          |
        Mobile (Child Class)
 */
public class Mobile extends Device {

    private Integer ramSize;
    private Integer cameraPixels;
    private Double displaySize;

    //Default Constructor
    public Mobile() {
        /*
            - super() is used to invoke parent or super class constructor
            - JAVA automatically adds super() call at start of constructor even if we don't add it.
            - If we add - super() call, it should be the first line in the constructor otherwise it will give
              compile-time error
         */
        super();
        System.out.println("I am in Mobile Class - Default Constructor");
    }

    //Parameterised Constructor
    public Mobile(Integer ramSize, Integer cameraPixels, Double displaySize) {
        //When we invoke this parameterised constructor, even though we did not add super() call here, JAVA automatically
        //adds it and calls super class default constructor.
        System.out.println("I am in Mobile Class - Parameterised Constructor - only Mobile Class variables initialised");
        this.ramSize = ramSize;
        this.cameraPixels = cameraPixels;
        this.displaySize = displaySize;
    }

    //Parameterised Constructor
    //This constructor will initialise instance variables of this class and super class as well.
    public Mobile(String name, int model, String color, String version, Integer ramSize, Integer cameraPixels, Double displaySize) {
        //this super() call matches parameters and their data types with the parent/super class constructor and calls it to
        // initialise the super class instance variables. If not found, it will give compile-time error.
        super(name, model, color, version);
        this.ramSize = ramSize;
        this.cameraPixels = cameraPixels;
        this.displaySize = displaySize;
    }

    public Integer getRamSize() {
        return ramSize;
    }

    public void setRamSize(Integer ramSize) {
        this.ramSize = ramSize;
    }

    public Integer getCameraPixels() {
        return cameraPixels;
    }

    public void setCameraPixels(Integer cameraPixels) {
        this.cameraPixels = cameraPixels;
    }

    public Double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(Double displaySize) {
        this.displaySize = displaySize;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "Name=" + getName() +
                ", Model=" + getModel() +
                ", ramSize=" + ramSize +
                ", cameraPixels=" + cameraPixels +
                '}';
    }
}
