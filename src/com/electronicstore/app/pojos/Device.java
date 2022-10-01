package com.electronicstore.app.pojos;

//Base class or Super Class
public class Device {

    private String name;
    private int model;
    private String color;
    private String version;

    //Default Constructor
    public Device () {
        System.out.println("I am in Device Class - Default Constructor");
    }

    //Parameterised Constructor
    public Device (String name, int model, String color, String version) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
