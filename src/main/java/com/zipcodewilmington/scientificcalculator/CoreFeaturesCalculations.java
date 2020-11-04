package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by Team c3 on 10/30/20.
 */

public class CoreFeaturesCalculations {
    private Display displayValues;

    public CoreFeaturesCalculations(Display Display) {
        this.displayValues = Display;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public double add(double value) {
        this.displayValues.setDisplay(displayValues.getDisplay() + value);
        displayValues.currentDisplay();
        return displayValues.getDisplay();
    }

    public double subtract(double value) {
        this.displayValues.setDisplay(displayValues.getDisplay() - value);
        displayValues.currentDisplay();
        return displayValues.getDisplay();
    }

    public double multiply(double value) {
        this.displayValues.setDisplay(displayValues.getDisplay() * value);
        displayValues.currentDisplay();
        return displayValues.getDisplay();
    }

    public double divide(double value) {
        this.displayValues.setDisplay(displayValues.getDisplay() / value);
        displayValues.currentDisplay();
        return displayValues.getDisplay();
    }

    public double square() {
        this.displayValues.setDisplay(Math.pow(displayValues.getDisplay(), 2));
        displayValues.currentDisplay();
        return displayValues.getDisplay();
    }

    public double squareRoot() {
        this.displayValues.setDisplay(Math.sqrt(displayValues.getDisplay()));
        displayValues.currentDisplay();
        return displayValues.getDisplay();
    }

    public double variableExponentiation(double value1, double value2) {
        this.displayValues.setDisplay(Math.pow(value1, value2));
        displayValues.currentDisplay();
        return displayValues.getDisplay();
    }

    public double inverseOfTheNumber() {
        if (this.displayValues.getDisplay() == 0) {
            System.out.println("\n You can't divide by zero!");
        } else {
            this.displayValues.setDisplay(1 / displayValues.getDisplay());
            displayValues.currentDisplay();
        }
        return displayValues.getDisplay();
    }

    public double invertTheSign() {
        if (this.displayValues.getDisplay() == 0) {
            System.out.println("\n You can't invert zero!");
        } else {
            this.displayValues.setDisplay(displayValues.getDisplay() * -1);
            displayValues.currentDisplay();
        }
        return displayValues.getDisplay();
    }

}
