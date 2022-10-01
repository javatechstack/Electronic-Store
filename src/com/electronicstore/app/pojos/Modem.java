package com.electronicstore.app.pojos;

/*
    Hierarchical Inheritance - A Super class has multiple child classes (i.e., Multiple child classes extends same super class)
            Device
            /   \
        Mobile  Modem
 */
public class Modem extends Device {

    private String frequency;
    private Double speed;
    private String ModemType;

    public Modem(String name, int model, String color, String version, String frequency, Double speed) {
        super(name, model, color, version);
        this.frequency = frequency;
        this.speed = speed;
    }

    public Modem(String frequency, Double speed, String modemType) {
        this.frequency = frequency;
        this.speed = speed;
        ModemType = modemType;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public String getModemType() {
        return ModemType;
    }

    public void setModemType(String modemType) {
        ModemType = modemType;
    }
}
