package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class ScientificMethodCalculations {
    public static Scanner scanner = new Scanner(System.in);

    public static double getSine(double value) {
        //default math method accepts radian
        if (Constants.radOrDeg) {
            Constants.display = Math.sin(value);
        } else {
            Constants.display = Math.sin(value) * 57.2958;
        }
        return Constants.display;
    }

    public static double getCosine(double value) {
        //default math method accepts radian
        if (Constants.radOrDeg) {
            Constants.display = Math.cos(value);
        } else {
            Constants.display = Math.cos(value) * 57.2958;
        }
        return Constants.display;
    }

    public static double getTangent(double value) {
        //default math method accepts radian
        if (Constants.radOrDeg) {
            Constants.display = Math.tan(value);
        } else {
            Constants.display = Math.tan(value) * 57.2958;
        }
        return Constants.display;
    }

    public static double getInSine(double value) {
        //default math method accepts radian
        //default returns radian
        if (Constants.radOrDeg) {
            Constants.display = Math.asin(value);
        } else {
            Constants.display = Math.asin(value) * 57.2958;
        }
        return Constants.display;
    }

    public static double getInCosine(double value) {
        //default math method accepts radian
        if (Constants.radOrDeg) {
            Constants.display = Math.acos(value);
        } else {
            Constants.display = Math.acos(value) * 57.2958;
        }
        return Constants.display;
    }

    public static double getInTangent(double value) {
        //default math method accepts radian
        if (Constants.radOrDeg) {
            Constants.display = Math.atan(value);
        } else {
            Constants.display = Math.atan(value) * 57.2958;
        }
        return Constants.display;
    }

    public static int factorial(int value) {
        if (Constants.display == 0) {
            System.out.println("Please change the display value to a value higher than 0.");
        } else {
        int factValue = value;
        int res = 1, i;
        for (i = 2; i <= factValue; i++) {
            res *= i;
            Constants.display = res;
            }
        }
        return (int)Constants.display;
    }

    public static int log(int value) {
        Constants.display = Math.log10(value);
        CoreFeatures.currentDisplay();
        return (int)Constants.display;
        //gives the Logarithmic of a number when the base is 10
    }

    public static int inverseLog(int value) {
        Constants.display = Math.pow(10.00, Constants.display);
        CoreFeatures.currentDisplay();
        //10^x == y
        return (int)Constants.display;
    }


    public static int naturalLog(int value) {
        Constants.display = Math.log(Constants.display);
        CoreFeatures.currentDisplay();
        return (int)Constants.display;
        /*returns the natural logarithm (base e) of a double value.
        //if the argument is NAN or less than zero, then the result is NAN
        if the argument is positive infinity, then the result is positive infinity*/
    }

    public static int inverseNaturalLog(int value) {
        Constants.display = Math.exp(Constants.display);
        CoreFeatures.currentDisplay();
        return (int)Constants.display;
        //returns euler’s number 'e' raised to the power of a double value
    }
}

