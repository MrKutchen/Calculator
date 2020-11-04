package com.zipcodewilmington.scientificcalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Team c3 on 10/30/20.
 */

public class CoreFeatures {

    private Display displayValues;
    private CoreFeaturesCalculations calculations;

    public CoreFeatures(Display displayValues, CoreFeaturesCalculations calculations) {
        this.displayValues = displayValues;
        this.calculations = calculations;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public void coreFeaturesOptions() {

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
                        displayValues.setCurrentMemory(displayValues.getDisplay());
                        displayValues.currentDisplay();
                        break;
                    case 2:
                        displayValues.setCurrentMemory(displayValues.getDisplay());
                        displayValues.clearDisplay();
                        break;
                    case 3:
                        displayValues.setCurrentMemory(displayValues.getDisplay());
                        displayValues.changeDisplay();
                        break;
                    case 4:
                        displayValues.setCurrentMemory(displayValues.getDisplay());
                        basicOperators(displayValues);
                        break;
                    case 5:
                        displayValues.setCurrentMemory(displayValues.getDisplay());
                        calculations.square();
                        break;
                    case 6:
                        displayValues.setCurrentMemory(displayValues.getDisplay());
                        calculations.squareRoot();
                        break;
                    case 7:
                        displayValues.setCurrentMemory(displayValues.getDisplay());
                        System.out.println("\n Please input the first value you would like to use, press enter, then input the second value and press enter. (x^y)");
                        calculations.variableExponentiation(scanner.nextDouble(), scanner.nextDouble());
                        break;
                    case 8:
                        displayValues.setCurrentMemory(displayValues.getDisplay());
                        calculations.inverseOfTheNumber();
                        break;
                    case 9:
                        displayValues.setCurrentMemory(displayValues.getDisplay());
                        calculations.invertTheSign();
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

    public void basicOperators(Display displayValues) {
        try {
            System.out.println("\n" + "Choose which operator you would like to use (+, -, *, /)?");
            String operators = scanner.next();
            switch (operators) {
                case "+":
                    System.out.println("\n What value would you like to add to the display?");
                    double valueAdd = scanner.nextDouble();
                    this.calculations.add(valueAdd);
                    break;
                case "-":
                    System.out.println("\n What value would you like to subtract from the display value?");
                    double valueSubtract = scanner.nextDouble();
                    this.calculations.subtract(valueSubtract);
                    break;
                case "*":
                    System.out.println("\n What value would you like to multiply the display value by?");
                    double valueMulti = scanner.nextDouble();
                    this.calculations.multiply(valueMulti);
                    break;
                case "/":
                    System.out.println("\n What value would you like to divide the display value by?");
                    double valueDivide = scanner.nextDouble();
                    this.calculations.divide(valueDivide);
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



