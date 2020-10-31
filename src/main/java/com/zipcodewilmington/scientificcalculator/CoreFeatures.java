package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class CoreFeatures {
    private static int display = 0;

    private static Scanner scanner = new Scanner(System.in);

    public static void displayOptions() {
        boolean powerOn = true;
        while(powerOn) {
            System.out.print("Please choose one of the following options:\n" +
                    "Type 1 for current display.\n" +
                    "Type 2 to clear display.\n" +
                    "Type 3 to exit.\n" +
                    "Enter choice here: ");

            int input = scanner.nextInt();
            switch (input) {
                case 1: CoreFeatures.currentDisplay();
                    break;
                case 2: CoreFeatures.clearDisplay();
                    break;
                case 3: powerOn = false;
            }
        }
    }

    public static void currentDisplay() {
        System.out.println("\n" +
                "Display = " + display + "\n");
    }

    public static void clearDisplay() {
        display = 0;
        System.out.println("\n" +
                "Display has been cleared. Display = " + display + "\n");
    }
}

