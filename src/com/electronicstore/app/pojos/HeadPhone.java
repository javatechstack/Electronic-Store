package com.electronicstore.app.pojos;

/*
    Multi-Level Inheritance - A super class has one child class and that child class acts as super class to another child class
        Device (Super Class)
          |
        HeadPhone (Child of Device)
          |
        WireLessBuds (Child of HeadPhone)
 */
public class HeadPhone extends Device {
    private boolean withMic;
    private String chargingTime;

    public HeadPhone(boolean withMic, String chargingTime) {
        this.withMic = withMic;
        this.chargingTime = chargingTime;
    }

    public HeadPhone(String name, int model, String color, String version, boolean withMic, String chargingTime) {
        super(name, model, color, version);
        this.withMic = withMic;
        this.chargingTime = chargingTime;
    }

    public boolean isWithMic() {
        return withMic;
    }

    public void setWithMic(boolean withMic) {
        this.withMic = withMic;
    }

    public String getChargingTime() {
        return chargingTime;
    }

    public void setChargingTime(String chargingTime) {
        this.chargingTime = chargingTime;
    }
}
