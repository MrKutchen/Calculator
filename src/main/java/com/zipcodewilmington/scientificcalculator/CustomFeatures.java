package com.zipcodewilmington.scientificcalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Team c3 on 10/30/20.
 */

public class CustomFeatures {
    public static Scanner scanner = new Scanner(System.in);

    public static void customFeaturesOptions() {
        boolean powerOn = true;
        while (powerOn) {
            Console.println("\n" +
                    "Please choose from the following options:\n" +
                    "1 - Change the Display Value\n" +
                    "2 - Convert the Display to Area of Circle based on Radius\n" +
                    "3 - Try out some Conversions\n" +
                    "4 - Reset Display\n" +
                    "5 - Main Menu\n" + "\n" +
                    "Enter choice here: -> ");


            try {
                int input = scanner.nextInt();
                switch (input) {
                    case 1:
                        CoreFeatures.changeDisplay();
                        break;
                    case 2:
                        radius();
                        break;
                    case 3:
                        conversion();
                        break;
                    case 4:
                        CoreFeatures.clearDisplay();
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

    public static void radius() {
        Constants.display = Math.PI * Math.pow(Constants.display, 2);
        String pi = String.format("%.3f", Constants.display);
        System.out.println("\u03c0 = " + pi);
    }

    public static void conversion() {
        System.out.println("\n" + "1 - To convert " + Constants.display + " mm to cm\n" +
                "2 - Convert " + Constants.display + " cm to mm\n" +
                "3 - " + Constants.display + " cm to inches\n" +
                "4 - Convert " + Constants.display + " inches to cm\n" +
                "5 - Convert " + Constants.display + " inches to feet\n" +
                "6 - Convert " + Constants.display + " feet to inches");

        try {
            int k = scanner.nextInt();
            switch (k) {
                case 1:
                    double milliCent = Constants.display / 10;
                    System.out.println(Constants.display + " millimeters equals " + milliCent + " centimeters");
                    break;
                case 2:
                    double centMilli = Constants.display * 10;
                    System.out.println(Constants.display + " centimeters equals " + centMilli + " millimeters");
                    break;
                case 3:
                    double centInch = Constants.display * 0.393701;
                    System.out.println(Constants.display + " centimeters equals " + centInch + " inches");
                    break;
                case 4:
                    double inchCent = Constants.display * 2.54;
                    System.out.println(Constants.display + " inches equals " + inchCent + " centimeters");
                    break;
                case 5:
                    double inchFeet = Constants.display / 12;
                    System.out.println(Constants.display + " inches equals " + inchFeet + " feet");
                    break;
                case 6:
                    double feetInch = Constants.display * 12;
                    System.out.println(Constants.display + " feet equals " + feetInch + " inches");
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



