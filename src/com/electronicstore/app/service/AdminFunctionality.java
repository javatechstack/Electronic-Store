package com.electronicstore.app.service;

import com.electronicstore.app.data.ElectronicStoreData;
import com.electronicstore.app.pojos.Device;
import com.electronicstore.app.pojos.Mobile;
import com.electronicstore.app.pojos.Modem;
import com.electronicstore.app.pojos.WireLessBuds;

import java.util.List;
import java.util.Scanner;

public class AdminFunctionality {

    private final Scanner scanner;

    public AdminFunctionality(Scanner scanner) {
        this.scanner = scanner;
    }

    public void startAdminView() {
        while (true) {
            System.out.println("1. Create a Product");
            System.out.println("2. View All Products");
            System.out.println("3. Delete a Product");
            System.out.println("4. Update Quantity");
            System.out.println("5. Logout");

            System.out.println("Select your option: ");

            int userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    createProduct();
                    break;
                case 2:
                    viewAllProducts();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    updateQuantity();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("You selected a wrong option. Please choose again: ");
                    break;
            }
        }
        
    }

    private void updateQuantity() {
    }

    private void deleteProduct() {
    }

    private void viewAllProducts() {
        System.out.println("Select a Product Type to View available Products: ");
        System.out.println("1. Mobile");
        System.out.println("2. Modem");
        System.out.println("3. HeadPhones");
        System.out.println("4. Go Back");

        int userInput = scanner.nextInt();

        switch (userInput) {
            case 1:
                List<Mobile> mobiles = ElectronicStoreData.viewAllMobiles();
                System.out.println("List of available mobiles: " + (mobiles.size() == 0 ? "None available." : ""));
                for (Mobile mobile: mobiles) {
                    System.out.println(mobile);
                }
                break;
            case 2:
                List<Modem> modems = ElectronicStoreData.viewAllModems();
                System.out.println("List of available Modems: " + (modems.size() == 0 ? "None available." : ""));
                for (Modem modem: modems) {
                    System.out.println(modem);
                }
                break;
            case 3:
                List<WireLessBuds> wireLessBudsList  = ElectronicStoreData.viewAllWirelessBuds();
                System.out.println("List of available WirelessBuds: " + (wireLessBudsList.size() == 0 ? "None available." : ""));
                for (WireLessBuds wireLessBuds: wireLessBudsList) {
                    System.out.println(wireLessBuds);
                }
                break;
            case 4:
                break;
            default:
                System.out.println("You selected a wrong option. Please choose again: ");
                break;
        }
    }

    private void createProduct() {
        System.out.println("Select a Product Type to create: ");
        System.out.println("1. Mobile");
        System.out.println("2. Modem");
        System.out.println("3. Wireless HeadPhones");
        System.out.println("4. Go Back");

        int userInput = scanner.nextInt();

        switch (userInput) {
            case 1:
                createMobile();
                break;
            case 2:
                createModem();
                break;
            case 3:
                createHeadPhone();
                break;
            case 4:
                break;
            default:
                System.out.println("You selected a wrong option. Please choose again: ");
                break;
        }
    }

    private void createHeadPhone() {
        System.out.print("Enter Headphone Name: ");
        String name = scanner.next();
        System.out.println();

        System.out.print("Enter Headphone Model: ");
        int model = scanner.nextInt();
        System.out.println();

        System.out.print("Enter Headphone withMic (true/false): ");
        boolean withMic = scanner.nextBoolean();
        System.out.println();

        System.out.print("Enter Headphone Bluetooth range: ");
        String range = scanner.next();
        System.out.println();

        WireLessBuds wireLessBuds = new WireLessBuds(name, model, null, withMic, range);
        ElectronicStoreData.addDevice(wireLessBuds);

        System.out.println("Headphone has been added successfully.");
        System.out.println();
    }

    private void createModem() {
        System.out.print("Enter Modem Name: ");
        String name = scanner.next();
        System.out.println();

        System.out.print("Enter Modem Model: ");
        int model = scanner.nextInt();
        System.out.println();

        System.out.print("Enter Modem Frequency: ");
        String frequency = scanner.next();
        System.out.println();

        System.out.print("Enter Modem Speed: ");
        Double speed = scanner.nextDouble();
        System.out.println();

        Modem modem = new Modem(name, model, null, null, frequency, speed);

        ElectronicStoreData.addDevice(modem);

        System.out.println("Modem has been added successfully.");
        System.out.println();
    }

    private void createMobile() {
        System.out.print("Enter Mobile Name: ");
        String name = scanner.next();
        System.out.println();

        System.out.print("Enter Mobile Model: ");
        int model = scanner.nextInt();
        System.out.println();

        System.out.print("Enter Mobile Color: ");
        String color = scanner.next();
        System.out.println();

        System.out.print("Enter Mobile RAM SIZE: ");
        Integer ramSize = scanner.nextInt();
        System.out.println();

        System.out.print("Enter Mobile Camera Pixels: ");
        Integer cameraPixels = scanner.nextInt();
        System.out.println();

        Mobile mobile = new Mobile(name, model, color, null, ramSize, cameraPixels, null);

        ElectronicStoreData.addDevice(mobile);

        System.out.println("Mobile has been added successfully.");
        System.out.println();
    }
}
