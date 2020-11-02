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

    public static double add(double value) {
        Constants.display += value;
        CoreFeatures.currentDisplay();
        return Constants.display;
    }

    public static double subtract(double value) {
        Constants.display -= value;
        CoreFeatures.currentDisplay();
        return Constants.display;
    }

    public static double multiply(double value) {
        Constants.display *= value;
        CoreFeatures.currentDisplay();
        return Constants.display;
    }

    public static double divide(double value) {
        Constants.display /= value;
        CoreFeatures.currentDisplay();
        return Constants.display;
    }

    public static double square(double value) {
        Constants.display = Math.pow(value, 2);
        CoreFeatures.currentDisplay();
        return Constants.display;
    }

    public static double squareRoot(double value) {
        Constants.display = Math.sqrt(value);
        CoreFeatures.currentDisplay();
        return Constants.display;
    }

    public static double variableExponentiation(double value1, double value2) {
        Constants.display = Math.pow(value1, value2);
        CoreFeatures.currentDisplay();
        return Constants.display;
    }

    public static double inverseOfTheNumber(double value) {
        if (Constants.display == 0) {
            System.out.println("\n You can't divide by zero!");
        } else {
            Constants.display = 1 / value;
            CoreFeatures.currentDisplay();
        }
        return Constants.display;
    }

    public static double invertTheSign(double value) {
        if (Constants.display == 0) {
            System.out.println("\n You can't invert zero!");
        } else {
            Constants.display = value * -1;
            CoreFeatures.currentDisplay();
        }
        return Constants.display;
    }

}
