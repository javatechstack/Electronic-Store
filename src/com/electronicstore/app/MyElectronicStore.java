package com.electronicstore.app;

import com.electronicstore.app.service.AdminFunctionality;
import com.electronicstore.app.util.Role;

import java.util.Scanner;

public class MyElectronicStore {

    public static void main(String[] args) {
        System.out.println("***************************************************");
        System.out.println("******** Welcome to the Electronic Store!! ********");
        System.out.println("***************************************************");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        startApplication(scanner);
    }

    private static void startApplication(Scanner scanner) {
        while (true) {
            //Admin can create, update or delete products
            System.out.println("1. Login as Admin");
            // select and buy products
            System.out.println("2. Login as User");
            System.out.println("3. Exit");

            System.out.print("Select your option: ");
            //reads an int value from the console
            int userInput = scanner.nextInt();

            if (userInput == 3) {
                System.out.println("Thank you. Visit Again!!");
                System.exit(0);
                break;
            }

            Role role = Role.getRole(userInput);
            switch (role) {
                case ADMIN:
                    loginAsAdmin(scanner);
                    break;
                case USER:
                    loginAsUser(scanner);
                    break;
                default:
                    System.out.println("You selected a wrong option. Please choose again :) ");
                    break;
            }
        }
    }

    private static void loginAsUser(Scanner scanner) {
        System.out.println("Logged in as User...");
    }

    private static void loginAsAdmin(Scanner scanner) {
        System.out.println();
        System.out.println("Logged in as Admin...");

        AdminFunctionality adminFunctionality = new AdminFunctionality(scanner);
        adminFunctionality.startAdminView();
    }
}
