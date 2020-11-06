package com.zipcodewilmington.scientificcalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Team c3 on 10/30/20.
 */

public class CustomFeatures {
    public static Scanner scanner = new Scanner(System.in);

    public static void customFeaturesOptions(Display displayValues) {
        boolean powerOn = true;
        while (powerOn) {
            Console.println("\n" +
                    "Please choose from the following options:\n" +
                    "1 - Change the Display Value\n" +
                    "2 - Find the area of the Radius\n" +
                    "3 - Try out some Conversions\n" +
                    "4 - Reset Display\n" +
                    "5 - Main Menu\n" + "\n" +
                    "Enter choice here: -> ");


            try {
                int input = scanner.nextInt();
                switch (input) {
                    case 1:
                        displayValues.changeDisplay();
                        break;
                    case 2:
                        radius(displayValues);
                        break;
                    case 3:
                        conversion(displayValues);
                        break;
                    case 4:
                        displayValues.clearDisplay();
                        break;
                    case 5:
                        powerOn = false;
                        break;
                    default:
                        System.out.println("\n" + "Err - Choose a correct option, you're a Zip Coder!");
                        break;
                }
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("\n" + "Err - Choose a correct option, you're a Zip Coder!");
            }
        }
    }

    public static void radius(Display displayValues) {
        displayValues.setDisplay(Math.PI * Math.pow(displayValues.getDisplay(), 2));
        String pi = String.format("%.3f", displayValues.getDisplay());
        System.out.println("\u03c0 = " + pi);
    }

    public static void conversion(Display displayValues) {
        System.out.println("\n" + "1 - To convert " + displayValues.getDisplay() + " mm to cm\n" +
                "2 - Convert " + String.format("%.1f", displayValues.getDisplay()) + " cm to mm\n" +
                "3 - " + String.format("%.1f", displayValues.getDisplay()) + " cm to inches\n" +
                "4 - Convert " + String.format("%.1f", displayValues.getDisplay()) + " inches to cm\n" +
                "5 - Convert " + String.format("%.1f", displayValues.getDisplay()) + " inches to feet\n" +
                "6 - Convert " + String.format("%.1f", displayValues.getDisplay()) + " feet to inches");

        try {
            int k = scanner.nextInt();
            switch (k) {
                case 1:
                    double milliCent = displayValues.getDisplay() / 10;
                    System.out.println(displayValues.getDisplay() + " millimeters equals " + milliCent + " centimeters");
                    break;
                case 2:
                    double centMilli = displayValues.getDisplay() * 10;
                    System.out.println(displayValues.getDisplay() + " centimeters equals " + centMilli + " millimeters");
                    break;
                case 3:
                    double centInch = displayValues.getDisplay() * 0.393701;
                    System.out.println(displayValues.getDisplay() + " centimeters equals " + centInch + " inches");
                    break;
                case 4:
                    double inchCent = displayValues.getDisplay() * 2.54;
                    System.out.println(displayValues.getDisplay() + " inches equals " + inchCent + " centimeters");
                    break;
                case 5:
                    double inchFeet = displayValues.getDisplay() / 12;
                    System.out.println(displayValues.getDisplay() + " inches equals " + inchFeet + " feet");
                    break;
                case 6:
                    double feetInch = displayValues.getDisplay() * 12;
                    System.out.println(displayValues.getDisplay() + " feet equals " + feetInch + " inches");
                    break;
                default:
                    System.out.println("\n" + "Err - Choose a correct option, you're a Zip Coder!");
                    break;
            }
        } catch (InputMismatchException e) {
            scanner.next();
            System.out.println("\n" + "Err - Choose a correct option, you're a Zip Coder!");
        }
    }
}



