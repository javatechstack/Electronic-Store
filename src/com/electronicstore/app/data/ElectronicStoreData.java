package com.electronicstore.app.data;

import com.electronicstore.app.pojos.Device;
import com.electronicstore.app.pojos.Mobile;
import com.electronicstore.app.pojos.Modem;
import com.electronicstore.app.pojos.WireLessBuds;

import java.util.ArrayList;
import java.util.List;

public class ElectronicStoreData {

    //This device list can store any mobile, modem or headphone devices
    private static final List<Device> devices = new ArrayList<>();

    public static void addDevice(Device device) {
        devices.add(device);
    }

    public static List<Mobile> viewAllMobiles() {
        List<Mobile> mobiles = new ArrayList<>();
        for(Device device: devices) {
            if (device instanceof Mobile) {
                mobiles.add((Mobile) device);
            }
        }
        return mobiles;
    }

    public static List<Modem> viewAllModems() {
        List<Modem> modems = new ArrayList<>();
        for(Device device: devices) {
            if (device instanceof Modem) {
                modems.add((Modem) device);
            }
        }
        return modems;
    }

    public static List<WireLessBuds> viewAllWirelessBuds() {
        List<WireLessBuds> wireLessBudsList = new ArrayList<>();
        for(Device device: devices) {
            if (device instanceof WireLessBuds) {
                wireLessBudsList.add((WireLessBuds) device);
            }
        }
        return wireLessBudsList;
    }
}
