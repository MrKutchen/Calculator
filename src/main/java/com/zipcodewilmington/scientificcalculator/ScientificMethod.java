package com.zipcodewilmington.scientificcalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScientificMethod {

    private Display displayValues;
    private ScientificMethodCalculations functions;

    public static Scanner scanner = new Scanner(System.in);


    public ScientificMethod(Display displayValues) {
        this.displayValues = displayValues;
        this.functions = new ScientificMethodCalculations(displayValues);

    }

    public void scientificMethodOptions() {
        boolean powerOn = true;
        while (powerOn) {
            Console.println("\n" +
                    "Please choose from the following options:\n" +
                    "1 - Change Current Display Value\n" +
                    "2 - Clear Current Display\n" +
                    "3 - Current Display Mode\n" +
                    "4 - Switch Display Mode\n" +
                    "5 - Choose Display Mode\n" +
                    "6 - Trig Functions\n" +
                    "7 - Switch Units (Degrees, Radians)\n" +
                    "8 - Choose Units\n" +
                    "9 - Logarithmic Functions\n" +
                    "10 - Factorial Function\n" +
                    "11 - Main Menu\n" + "\n" +
                    "Enter choice here: -> ");

            try {
                int input = scanner.nextInt();
                switch (input) {
                    case 1:
                        displayValues.changeDisplay();
                        break;
                    case 2:
                        displayValues.clearDisplay();
                        break;
                    case 3:
                        displayValues.currentDisplayMode();
                        break;
                    case 4:
                        displayValues.switchDisplayMode();
                        break;
                    case 5:
                        chooseDisplayMode();
                        break;
                    case 6:
                        trigOptions();
                        break;
                    case 7:
                        switchRadAndDeg();
                        break;
                    case 8:
                        chooseRadAndDeg();
                        break;
                    case 9:
                        chooseLogFunction();
                        break;
                    case 10:
                        functions.factorial(displayValues);
                        displayValues.currentDisplay();
                        break;
                    case 11:
                        displayValues.clearDisplay();
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

    public void chooseDisplayMode() {
        //[binary, octal, decimal, hexadecimal]
        int wrapInt = (int) displayValues.getDisplay();
        try {
            System.out.println("\n" + "Choose which Display Mode you would like to use?\n" +
                    "1 - Binary, 2 - Octal, 3 - Hexadecimal, 4 - Decimal");
            int mode = scanner.nextInt();
            switch (mode) {
                case 1:
                    displayValues.setDisplayMode("Binary");
                    displayValues.setDisplayModeValues(Integer.toBinaryString(wrapInt));
                    System.out.println("\n" + "Current Display Mode = " +
                            displayValues.getDisplayMode() + " " + displayValues.getDisplayModeValues());
                    break;
                case 2:
                    displayValues.setDisplayMode("Octal");
                    displayValues.setDisplayModeValues(Integer.toOctalString(wrapInt));
                    System.out.println("\n" + "Current Display Mode = " +
                            displayValues.getDisplayMode() + " " + displayValues.getDisplayModeValues());
                    break;
                case 3:
                    displayValues.setDisplayMode("Hexadecimal");
                    displayValues.setDisplayModeValues(Integer.toHexString(wrapInt));
                    System.out.println("\n" + "Current Display Mode = " +
                            displayValues.getDisplayMode() + " " + displayValues.getDisplayModeValues());
                    break;
                case 4:
                    displayValues.setDisplayMode("Decimal");
                    displayValues.setDisplayModeValues(String.valueOf(wrapInt));
                    System.out.println("\n" + "Current Display Mode = " +
                            displayValues.getDisplayMode() + " " + displayValues.getDisplayModeValues());
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

    public void trigOptions() {
        try {
            System.out.println("\n" + "Choose which trig function you would like to use on the current display value?\n" +
                    "1 - Sine, 2 - Cosine, 3 - Tangent, 4 - Inverse Sine, 5 - Inverse Cosine, 6 - Inverse Tangent");
            int trigFunctions = scanner.nextInt();
            switch (trigFunctions) {
                case 1:
                    displayValues.setDisplay(functions.getSine(displayValues));
                    displayValues.currentDisplay();
                    break;
                case 2:
                    displayValues.setDisplay(functions.getCosine(displayValues));
                    displayValues.currentDisplay();
                    break;
                case 3:
                    displayValues.setDisplay(functions.getTangent(displayValues));
                    displayValues.currentDisplay();
                    break;
                case 4:
                    displayValues.setDisplay(functions.getInSine(displayValues));
                    displayValues.currentDisplay();
                    break;
                case 5:
                    displayValues.setDisplay(functions.getInCosine(displayValues));
                    displayValues.currentDisplay();
                    break;
                case 6:
                    displayValues.setDisplay(functions.getInTangent(displayValues));
                    displayValues.currentDisplay();
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

    public void switchRadAndDeg() {
        if (!displayValues.isRadOrDeg()) {
            convToDegree();
            displayValues.setRadOrDeg(true);
        } else if (displayValues.isRadOrDeg()) {
            convToRad();
            displayValues.setRadOrDeg(false);
        }
    }

    public void chooseRadAndDeg() {
        System.out.println("Please choose if you would like Radians or Degrees?\n" +
                "1 - Degrees, 2 - Radians");
        int result = scanner.nextInt();
        if (result == 1  && !displayValues.isRadOrDeg()) {
            convToDegree();
            displayValues.setRadOrDeg(true);
        } else if (result == 2 && displayValues.isRadOrDeg()) {
            convToRad();
            displayValues.setRadOrDeg(false);
        } else {
            System.out.println(displayValues.getDisplay() + " - Degrees");
        }
    }

    public void convToDegree() {
        this.displayValues.setDisplay(displayValues.getDisplay() * 57.2958);
        System.out.println(displayValues.getDisplay() + " - Degree");
    }

    public void convToRad() {
        this.displayValues.setDisplay(displayValues.getDisplay() / 57.2958);
        System.out.println(displayValues.getDisplay() + " - Radians");
    }

    public void chooseLogFunction() {
        //[binary, octal, decimal, hexadecimal]
        try {
            System.out.println("\n" + "Choose which Log Function you would like to use on the current display value?\n" +
                    "1 - Log, 2 - 10^x (inverse log), 3 - Ln (natural log), 4 - e^x (inverse natural log) ");
            int logs = scanner.nextInt();
            switch (logs) {
                case 1:
                    displayValues.setDisplay(functions.log(displayValues));
                    break;
                case 2:
                    displayValues.setDisplay(functions.inverseLog(displayValues));
                    break;
                case 3:
                    displayValues.setDisplay(functions.naturalLog(displayValues));
                    break;
                case 4:
                    displayValues.setDisplay(functions.inverseNaturalLog(displayValues));
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