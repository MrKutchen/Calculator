package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by Team c3 on 10/30/20.
 */

public class CoreFeaturesCalculations {
    private static final Scanner scanner = new Scanner(System.in);
    public double getDisplayValue() {
        return Constants.display;
    }

    public static void add() {
        System.out.println("\n What value would you like to add to the display?");
        Constants.display += scanner.nextDouble();
        CoreFeatures.currentDisplay();
    }

    public static void subtract() {
        System.out.println("\n What value would you like to subtract from he display value?");
        Constants.display -= scanner.nextDouble();
        CoreFeatures.currentDisplay();
    }

    public static void multiply() {
        System.out.println("\n What value would you like to multiply the display value by?");
        Constants.display *= scanner.nextDouble();
        CoreFeatures.currentDisplay();
    }

    public static void divide() {
        System.out.println("\n What value would you like to divide the display value by?");
        Constants.display /= scanner.nextDouble();
        CoreFeatures.currentDisplay();
    }

    public static void square() {
        Constants.display = Math.pow(Constants.display, 2);
        CoreFeatures.currentDisplay();
    }

    public static void squareRoot() {
        Constants.display = Math.sqrt(Constants.display);
        CoreFeatures.currentDisplay();
    }

    public static void variableExponentiation() {
        System.out.println("\n Please input the first value you would like to use, press enter, then input the second value and press enter. (x^y)");
        Constants.display = Math.pow(scanner.nextDouble(), scanner.nextDouble());
        CoreFeatures.currentDisplay();
    }

    public static void inverseOfTheNumber() {
        if (Constants.display == 0) {
            System.out.println("\n You can't divide by zero!");
        } else {
            Constants.display = 1 / Constants.display;
            CoreFeatures.currentDisplay();
        }
    }

    public static void invertTheSign() {
        if (Constants.display == 0) {
            System.out.println("\n You can't invert zero!");
        } else {
            Constants.display = Constants.display * -1;
            CoreFeatures.currentDisplay();
        }
    }

}
