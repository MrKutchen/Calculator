package com.zipcodewilmington.scientificcalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Team c3 on 10/30/20.
 */

public class CoreFeatures {

    private static final Scanner scanner = new Scanner(System.in);

    public static void coreFeaturesOptions() {
        boolean powerOn = true;
        while (powerOn) {
            System.out.print("\n" + "Choose one of the following options:\n" +
                    "1 - Current Display.\n" +
                    "2 - Clear Display.\n" +
                    "3 - Change the Display Value\n" +
                    "4 - Add, Subtract, Multiply or Divide the Display Value\n" +
                    "5 - Square the Display Value\n" +
                    "6 - Square Root the Display Value\n" +
                    "7 - Calculate the Variable Exponentiation (x^y)\n" +
                    "8 - Calculate the Inverse of the Display number\n" +
                    "9 - Invert the Sign of the Display Number\n" +
                    "10 - Main Menu\n" + "\n" +
                    "Enter choice here: -> ");

            try {
                int input = scanner.nextInt();
                switch (input) {
                    case 1:
                        Constants.currentMemory = Constants.display;
                        CoreFeatures.currentDisplay();
                        break;
                    case 2:
                        Constants.currentMemory = Constants.display;
                        CoreFeatures.clearDisplay();
                        break;
                    case 3:
                        Constants.currentMemory = Constants.display;
                        CoreFeatures.changeDisplay();
                        break;
                    case 4:
                        Constants.currentMemory = Constants.display;
                        CoreFeatures.basicOperators();
                        break;
                    case 5:
                        Constants.currentMemory = Constants.display;
                        CoreFeaturesCalculations.square();
                        break;
                    case 6:
                        Constants.currentMemory = Constants.display;
                        CoreFeaturesCalculations.squareRoot();
                        break;
                    case 7:
                        Constants.currentMemory = Constants.display;
                        CoreFeaturesCalculations.variableExponentiation();
                        break;
                    case 8:
                        Constants.currentMemory = Constants.display;
                        CoreFeaturesCalculations.inverseOfTheNumber();
                        break;
                    case 9:
                        Constants.currentMemory = Constants.display;
                        CoreFeaturesCalculations.invertTheSign();
                        break;
                    case 10:
                        powerOn = false;
                        break;
                    default:
                        System.out.println("\n" + "Err - Choose a correct option, you're a Zip Coder!");
                        break;
                }
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Err - Choose a correct option, you're a Zip Coder!");
            }
        }
    }

    public static void currentDisplay() {
        System.out.println("---------------------------------\n" +
                "CURRENT DISPLAY = " + Constants.display + "\n" +
                "---------------------------------\n");
    }

    public static void clearDisplay() {
        Constants.display = 0;
        System.out.println("\n" + "Display has been cleared.");
        currentDisplay();
    }

    public static void changeDisplay() {
        System.out.println("\n" + "Choose what you would like the display value to be?");
        Constants.display = scanner.nextInt();
        currentDisplay();
    }

    public static void basicOperators() {
        try {
            System.out.println("\n" + "Choose which operator you would like to use (+, -, *, /)?");
            String operators = scanner.next();
            switch (operators) {
                case "+":
                    CoreFeaturesCalculations.add();
                    break;
                case "-":
                    CoreFeaturesCalculations.subtract();
                    break;
                case "*":
                    CoreFeaturesCalculations.multiply();
                    break;
                case "/":
                    CoreFeaturesCalculations.divide();
                    break;
                default:
                    System.out.println("\n" + "Err - Choose a correct option, you're a Zip Coder!");
                    break;
            }
        } catch (InputMismatchException e) {
            scanner.next();
            System.out.println("Err - Choose a correct option, you're a Zip Coder!");
        }
    }
}



