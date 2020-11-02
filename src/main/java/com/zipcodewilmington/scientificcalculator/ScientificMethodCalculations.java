package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class ScientificMethodCalculations {
    public static Scanner scanner = new Scanner(System.in);

    public static void getSine() {
        //default math method accepts radian
        if (Constants.radOrDeg) {
            Constants.display = Math.sin(Constants.display);
        } else {
            Constants.display = Math.sin(Constants.display) * 57.2958;
        }
    }

    public static void getCosine() {
        //default math method accepts radian
        if (Constants.radOrDeg) {
            Constants.display = Math.cos(Constants.display);
        } else {
            Constants.display = Math.cos(Constants.display) * 57.2958;
        }
    }

    public static void getTangent() {
        //default math method accepts radian
        if (Constants.radOrDeg) {
            Constants.display = Math.tan(Constants.display);
        } else {
            Constants.display = Math.tan(Constants.display) * 57.2958;
        }
    }

    public static void getInSine() {
        //default math method accepts radian
        //default returns radian
        if (Constants.radOrDeg) {
            Constants.display = Math.asin(Constants.display);
        } else {
            Constants.display = Math.asin(Constants.display) * 57.2958;
        }
    }

    public static void getInCosine() {
        //default math method accepts radian
        if (Constants.radOrDeg) {
            Constants.display = Math.acos(Constants.display);
        } else {
            Constants.display = Math.acos(Constants.display) * 57.2958;
        }
    }

    public static void getInTangent() {
        //default math method accepts radian
        if (Constants.radOrDeg) {
            Constants.display = Math.atan(Constants.display);
        } else {
            Constants.display = Math.atan(Constants.display) * 57.2958;
        }
    }

    public static void factorial() {
        int factValue = scanner.nextInt();
        int res = 1, i;
        for (i = 2; i <= factValue; i++) {
            res *= i;
            Constants.display = res;
        }
    }

    public static void log() {
        Constants.display = Math.log10(Constants.display);
        CoreFeatures.currentDisplay();
        //gives the Logarithmic of a number when the base is 10
    }

    public static void inverseLog() {
        Constants.display = Math.pow(10.00, Constants.display);
        CoreFeatures.currentDisplay();
        //10^x == y
    }


    public static void naturalLog() {
        Constants.display = Math.log(Constants.display);
        CoreFeatures.currentDisplay();

        /*returns the natural logarithm (base e) of a double value.
        //if the argument is NAN or less than zero, then the result is NAN
        if the argument is positive infinity, then the result is positive infinity*/
    }

    public static void inverseNaturalLog() {
        Constants.display = Math.exp(Constants.display);
        CoreFeatures.currentDisplay();

        //returns euler’s number 'e' raised to the power of a double value
    }
}

