package com.zipcodewilmington.scientificcalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScientificMethod {
    public static Scanner scanner = new Scanner(System.in);

    public static void scientificMethodOptions() {
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
                        CoreFeatures.changeDisplay();
                        break;
                    case 2:
                        CoreFeatures.clearDisplay();
                        break;
                    case 3:
                        currentDisplayMode();
                        break;
                    case 4:
                        switchDisplayMode();
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
                        ScientificMethodCalculations.factorial((int)Constants.display);
                        CoreFeatures.currentDisplay();
                        break;
                    case 11:
                        CoreFeatures.clearDisplay();
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

    public static void currentDisplayMode() {
        System.out.println("\n" + "Current Display Mode - " + Constants.displayMode);
        switch (Constants.displayMode) {
            case "Binary":
                System.out.println(Constants.displayModeValues);
                break;
            case "Octal":
                System.out.println(Constants.displayModeValues);
                break;
            case "Hexadecimal":
                System.out.println(Constants.displayModeValues);
                break;
            default:
                System.out.println(Constants.display);
                break;
        }


    }

    public static void switchDisplayMode() {
        int wrapInt = (int) Constants.display;
        String firstDisplay = "Binary";
        String secondDisplay = "Octal";
        String thirdDisplay = "Hexadecimal";
        String fourthDisplay = "Decimal";

        if (Constants.displayModeCount == 1) {
            Constants.displayMode = firstDisplay;
            Constants.displayModeValues = Integer.toBinaryString(wrapInt);
            System.out.println("\n" + "Current Display Mode = " +
                    Constants.displayMode + " " + Integer.toBinaryString(wrapInt));
            Constants.displayModeCount++;
        } else if (Constants.displayModeCount == 2) {
            Constants.displayMode = secondDisplay;
            Constants.displayModeValues = Integer.toOctalString(wrapInt);
            System.out.println("\n" + "Current Display Mode = " +
                    Constants.displayMode + " " + Integer.toOctalString(wrapInt));
            Constants.displayModeCount++;
        } else if (Constants.displayModeCount == 3) {
            Constants.displayMode = thirdDisplay;
            Constants.displayModeValues = Integer.toHexString(wrapInt);
            System.out.println("\n" + "Current Display Mode = " +
                    Constants.displayMode + " " + Integer.toHexString(wrapInt));
            Constants.displayModeCount++;
        } else if (Constants.displayModeCount == 4) {
            Constants.displayMode = fourthDisplay;
            Constants.display = Integer.parseInt(String.valueOf(wrapInt));
            System.out.println("\n" + "Current Display Mode = " +
                    Constants.displayMode + " " + (double) Integer.parseInt(String.valueOf(wrapInt)));
            Constants.displayModeCount = 1;
        }
    }

    public static void chooseDisplayMode() {
        //[binary, octal, decimal, hexadecimal]
        try {
            System.out.println("\n" + "Choose which Display Mode you would like to use?\n" +
                    "1 - Binary, 2 - Octal, 3 - Hexadecimal, 4 - Decimal");
            int mode = scanner.nextInt();
            int wrapInt = (int) Constants.display;
            switch (mode) {
                case 1:
                    Constants.displayMode = "Binary";
                    System.out.println("\n" + "Current Display Mode = " +
                            Constants.displayMode + " " + Integer.toBinaryString(wrapInt));
                    break;
                case 2:
                    Constants.displayMode = "Octal";
                    System.out.println("\n" + "Current Display Mode = " +
                            Constants.displayMode + " " + Integer.toOctalString(wrapInt));
                    break;
                case 3:
                    Constants.displayMode = "Hexadecimal";
                    System.out.println("\n" + "Current Display Mode = " +
                            Constants.displayMode + " " + Integer.toHexString(wrapInt));
                    break;
                case 4:
                    Constants.displayMode = "Decimal";
                    System.out.println("\n" + "Current Display Mode = " +
                            Constants.displayMode + " " + Integer.parseInt(String.valueOf(wrapInt)));
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

    public static void trigOptions() {
        try {
            System.out.println("\n" + "Choose which trig function you would like to use on the current display value?\n" +
                    "1 - Sine, 2 - Cosine, 3 - Tangent, 4 - Inverse Sine, 5 - Inverse Cosine, 6 - Inverse Tangent");
            int trigFunctions = scanner.nextInt();
            switch (trigFunctions) {
                case 1:
                    ScientificMethodCalculations.getSine(Constants.display);
                    CoreFeatures.currentDisplay();
                    break;
                case 2:
                    ScientificMethodCalculations.getCosine(Constants.display);
                    CoreFeatures.currentDisplay();
                    break;
                case 3:
                    ScientificMethodCalculations.getTangent(Constants.display);
                    CoreFeatures.currentDisplay();
                    break;
                case 4:
                    ScientificMethodCalculations.getInSine(Constants.display);
                    CoreFeatures.currentDisplay();
                    break;
                case 5:
                    ScientificMethodCalculations.getInCosine(Constants.display);
                    CoreFeatures.currentDisplay();
                    break;
                case 6:
                    ScientificMethodCalculations.getInTangent(Constants.display);
                    CoreFeatures.currentDisplay();
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

    public static void switchRadAndDeg() {
        if (Constants.radOrDeg == false) {
            convToDegree();
            Constants.radOrDeg = true;
        } else if (Constants.radOrDeg == true) {
            convToRad();
            Constants.radOrDeg = false;
        }
    }

    public static void chooseRadAndDeg() {
        System.out.println("Please choose if you would like Radians or Degrees?\n" +
                "1 - Degrees, 2 - Radians");
        int result = scanner.nextInt();
        if (result == 1  && !Constants.radOrDeg) {
            convToDegree();
            Constants.radOrDeg = true;
        } else if (result == 2 && Constants.radOrDeg) {
            convToRad();
            Constants.radOrDeg = false;
        } else {
            System.out.println(Constants.display + " - Degrees");
        }
    }

    public static void convToDegree() {
        Constants.display *= 57.2958;
        System.out.println(Constants.display + " - Degree");
    }

    public static void convToRad() {
        Constants.display /= 57.2958;
        System.out.println(Constants.display + " - Radians");
    }

    public static void chooseLogFunction() {
        //[binary, octal, decimal, hexadecimal]
        try {
            System.out.println("\n" + "Choose which Log Function you would like to use on the current display value?\n" +
                    "1 - Log, 2 - 10^x (inverse log), 3 - Ln (natural log), 4 - e^x (inverse natural log) ");
            int logs = scanner.nextInt();
            switch (logs) {
                case 1:
                    ScientificMethodCalculations.log((int)Constants.display);
                    break;
                case 2:
                    ScientificMethodCalculations.inverseLog((int)Constants.display);
                    break;
                case 3:
                    ScientificMethodCalculations.naturalLog((int)Constants.display);
                    break;
                case 4:
                    ScientificMethodCalculations.inverseNaturalLog((int)Constants.display);
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
