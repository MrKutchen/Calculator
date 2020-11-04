package com.zipcodewilmington.scientificcalculator;

public class ScientificMethodCalculations {
    private Display displayValues;

//    Display scientificMethodCalculationsValues =

    public ScientificMethodCalculations(Display displayValues) {
        this.displayValues = displayValues;
    }

    public double getSine(Display displayValues) {
        //default math method accepts radian
        if (displayValues.isRadOrDeg()) {
            displayValues.setDisplay(Math.sin(displayValues.getDisplay()) * 57.2958);
        } else {
            displayValues.setDisplay(Math.sin(displayValues.getDisplay()));
        }
        return displayValues.getDisplay();
    }

    public double getCosine(Display displayValues) {
        //default math method accepts radian
        if (displayValues.isRadOrDeg()) {
            displayValues.setDisplay(Math.cos(displayValues.getDisplay()) * 57.2958);
        } else {
            displayValues.setDisplay(Math.cos(displayValues.getDisplay()));
        }
        return displayValues.getDisplay();
    }

    public double getTangent(Display displayValues) {
        //default math method accepts radian
        if (displayValues.isRadOrDeg()) {
            displayValues.setDisplay(Math.tan(displayValues.getDisplay()) * 57.2958);
        } else {
            displayValues.setDisplay(Math.tan(displayValues.getDisplay()));
        }
        return displayValues.getDisplay();
    }

    public double getInSine(Display displayValues) {
        //default math method accepts radian
        //default returns radian
        if (displayValues.isRadOrDeg()) {
            displayValues.setDisplay(Math.asin(displayValues.getDisplay()) * 57.2958);
        } else {
            displayValues.setDisplay(Math.asin(displayValues.getDisplay()));
        }
        return displayValues.getDisplay();
    }

    public double getInCosine(Display displayValues) {
        //default math method accepts radian
        if (displayValues.isRadOrDeg()) {
            displayValues.setDisplay(Math.acos(displayValues.getDisplay()) * 57.2958);
        } else {
            displayValues.setDisplay(Math.acos(displayValues.getDisplay()));
        }
        return displayValues.getDisplay();
    }

    public double getInTangent(Display displayValues) {
        //default math method accepts radian
        if (displayValues.isRadOrDeg()) {
            displayValues.setDisplay(Math.atan(displayValues.getDisplay()) * 57.2958);
        } else {
            displayValues.setDisplay(Math.atan(displayValues.getDisplay()));
        }
        return displayValues.getDisplay();
    }

    public void factorial(Display displayValues) {
        if (displayValues.getDisplay() == 0) {
            System.out.println("Please change the display value to a value higher than 0.");
        } else {
            int factValue = (int) displayValues.getDisplay();
            int res = 1, i;
            for (i = 2; i <= factValue; i++) {
                res *= i;
                displayValues.setDisplay(res);
            }
        }
    }

    public int log(Display displayValues) {
        this.displayValues.setDisplay(Math.log10(displayValues.getDisplay()));
        displayValues.currentDisplay();
        return (int) displayValues.getDisplay();
        //gives the Logarithmic of a number when the base is 10
    }

    public int inverseLog(Display displayValues) {
        this.displayValues.setDisplay(Math.pow(10.00, displayValues.getDisplay()));
        displayValues.currentDisplay();
        //10^x == y
        return (int) displayValues.getDisplay();
    }


    public int naturalLog(Display displayValues) {
        displayValues.setDisplay(Math.log(displayValues.getDisplay()));
        displayValues.currentDisplay();
        return (int) displayValues.getDisplay();
        /*returns the natural logarithm (base e) of a double value.
        //if the argument is NAN or less than zero, then the result is NAN
        if the argument is positive infinity, then the result is positive infinity*/
    }

    public int inverseNaturalLog(Display displayValues) {
        displayValues.setDisplay(Math.exp(displayValues.getDisplay()));
        displayValues.currentDisplay();
        return (int) displayValues.getDisplay();
        //returns euler’s number 'e' raised to the power of a double value
    }
}

