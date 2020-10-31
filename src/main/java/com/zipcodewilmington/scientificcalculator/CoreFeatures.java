package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class CoreFeatures {

    private static final Scanner scanner = new Scanner(System.in);

    public static void displayOptions() {
        boolean powerOn = true;
        while(powerOn) {
            System.out.print("\n" +
                    "Please choose one of the following options:\n" +
                    "Type 1 for current display.\n" +
                    "Type 2 to clear display.\n" +
                    "Type 3 to change the display value\n" +
                    "Type 4 to go back to the Main Menu.\n" + "\n" +
                    "Enter choice here: ");

            int input = scanner.nextInt();
            switch (input) {
                case 1: CoreFeatures.currentDisplay();
                    break;
                case 2: CoreFeatures.clearDisplay();
                    break;
                case 3: CoreFeatures.changeDisplay();
                break;
                case 4: powerOn = false;
                break;
            }
        }
    }

    public static void currentDisplay() {
        System.out.println("\n" +
                "Display = " + MainApplication.display);
    }

    public static void clearDisplay() {
        MainApplication.display = 0;
        System.out.println("\n" +
                "Display has been cleared. Display = " + MainApplication.display);
    }

    public static void changeDisplay() {
        System.out.println("\n" +
                "Please choose what you would like the display integer to be?");
        MainApplication.display = scanner.nextInt();
        currentDisplay();
    }
}

