package com.electronicstore.app.pojos;

/*
    Multi-Level Inheritance - A super class has one child class and that child class acts as super class to another child class
        Device (Super Class)
          |
        HeadPhone (Child of Device)
          |
        WireLessBuds (Child of HeadPhone)
 */
public class WireLessBuds extends HeadPhone {

    private String bluetoothRange;
    private boolean isWaterResistent;

    public WireLessBuds(String name, int model, String color, boolean withMic, String bluetoothRange) {
        super(name, model, color, null, withMic, null);
        this.bluetoothRange = bluetoothRange;
    }

    public WireLessBuds(boolean withMic, String chargingTime, String bluetoothRange, boolean isWaterResistent) {
        super(withMic, chargingTime);
        this.bluetoothRange = bluetoothRange;
        this.isWaterResistent = isWaterResistent;
    }

    public String getBluetoothRange() {
        return bluetoothRange;
    }

    public void setBluetoothRange(String bluetoothRange) {
        this.bluetoothRange = bluetoothRange;
    }

    public boolean isWaterResistent() {
        return isWaterResistent;
    }

    public void setWaterResistent(boolean waterResistent) {
        isWaterResistent = waterResistent;
    }
}
