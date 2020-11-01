package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by Team c3 on 10/30/20.
 */

public class CoreFeaturesCalculations {
    private static final Scanner scanner = new Scanner(System.in);
    public static String whichInt = "What integer would you like to use?";

    public static void add() {
        System.out.println("What integer would you like to add to the display value?");
        CoreFeatures.currentDisplay();
        Constants.display += scanner.nextDouble();
        CoreFeatures.currentDisplay();
    }

    public static void subtract() {
        System.out.println("What integer would you like to subtract from he display value?");
        CoreFeatures.currentDisplay();
        Constants.display -= scanner.nextDouble();
        CoreFeatures.currentDisplay();
    }

    public static void multiply() {
        System.out.println("What integer would you like to multiply the display value by?");
        CoreFeatures.currentDisplay();
        Constants.display *= scanner.nextDouble();
        CoreFeatures.currentDisplay();
    }

    public static void divide() {
        System.out.println("What integer would you like to divide the display value by?");
        CoreFeatures.currentDisplay();
        Constants.display /= scanner.nextDouble();
        CoreFeatures.currentDisplay();
    }

    public static void square() {
        System.out.println(whichInt + "This will take the current value and raise it to your input integer.");
        Constants.display = Math.pow(Constants.display, scanner.nextDouble());
        CoreFeatures.currentDisplay();
    }

    public static void squareRoot() {
        System.out.println(whichInt + "This will square the input integer.");
        Constants.display = Math.sqrt(scanner.nextDouble());
        CoreFeatures.currentDisplay();
    }

    public static void variableExponentiation() {
        System.out.println("Please input the first integer you would like to use, press enter, then input the second and press enter. (x^y)");
        Constants.display = Math.pow(scanner.nextDouble(), scanner.nextDouble());
        CoreFeatures.currentDisplay();
    }

    public static void inverseOfTheNumber() {
        System.out.println("Here is the inverse of the display value.");
        Constants.display = 1 / Constants.display;
        CoreFeatures.currentDisplay();
    }

    public static void invertTheSign() {
        System.out.println("Here is the display value with the sign of the integer inverted.");
        Constants.display = Constants.display * -1;
        CoreFeatures.currentDisplay();
    }

}
