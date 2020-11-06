package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by Team c3 on 10/30/20.
 */

public class Display {
    public static Scanner scanner = new Scanner(System.in);
    private double display;
    private double currentMemory;
    private boolean radOrDeg; //true = Degrees, false = Radians
    private String displayMode;
    private int displayModeCount;
    private String displayModeValues;

    public Display() {
        this.display = 0;
        this.currentMemory = 0;
        this.radOrDeg = true;
        this.displayMode = "Decimal";
        this.displayModeCount = 1;
        this.displayModeValues = "";
    }

    public double getDisplay() {
        return display;
    }

    public void setDisplay(double display) {
        this.display = display;
    }

    public double getCurrentMemory() {
        return currentMemory;
    }

    public void setCurrentMemory(double currentMemory) {
        this.currentMemory = currentMemory;
    }

    public boolean isRadOrDeg() {
        return radOrDeg;
    }

    public void setRadOrDeg(boolean radOrDeg) {
        this.radOrDeg = radOrDeg;
    }

    public String getDisplayMode() {
        return displayMode;
    }

    public void setDisplayMode(String displayMode) {
        this.displayMode = displayMode;
    }

    public int getDisplayModeCount() {
        return displayModeCount;
    }

    public void setDisplayModeCount(int displayModeCount) {
        this.displayModeCount = displayModeCount;
    }

    public String getDisplayModeValues() {
        return displayModeValues;
    }

    public void setDisplayModeValues(String displayModeValues) {
        this.displayModeValues = displayModeValues;
    }

    public void clearDisplay() {
        this.display = 0;
        System.out.println("\n" + "Display has been cleared.");
        currentDisplay();
    }

    public void currentDisplay() {
        System.out.println("---------------------------------\n" +
                "CURRENT DISPLAY = " + this.display + "\n" +
                "---------------------------------\n");
    }

    public void changeDisplay() {
        System.out.println("\n" + "Choose what you would like the display value to be?");
        this.display = scanner.nextInt();
        currentDisplay();
    }

    public void currentDisplayMode() {
        System.out.println("\n" + "Current Display Mode - " + getDisplayMode());
    }

    public void switchDisplayMode() {
        int wrapInt = (int) this.display;

        if (getDisplayModeCount() == 1) {
            setDisplayMode("Binary");
            setDisplayModeValues(Integer.toBinaryString(wrapInt));
            System.out.println("\n" + "Current Display Mode = " +
                    getDisplayMode() + " " + getDisplayModeValues());
            setDisplayModeCount(getDisplayModeCount() + 1);

        } else if (getDisplayModeCount() == 2) {
            setDisplayModeValues("Octal");
            setDisplayModeValues(Integer.toOctalString(wrapInt));
            System.out.println("\n" + "Current Display Mode = " +
                    getDisplayMode() + " " + getDisplayModeValues());
            setDisplayModeCount(getDisplayModeCount() + 1);

        } else if (getDisplayModeCount() == 3) {
            setDisplayMode("Hexadecimal");
            setDisplayModeValues(Integer.toHexString(wrapInt));
            System.out.println("\n" + "Current Display Mode = " +
                    getDisplayMode() + " " + getDisplayModeValues());
            setDisplayModeCount(getDisplayModeCount() + 1);

        } else if (getDisplayModeCount() == 4) {
            setDisplayMode("Decimal");
            setDisplayModeValues(String.valueOf(wrapInt));
            System.out.println("\n" + "Current Display Mode = " +
                    getDisplayMode() + " " + getDisplayModeValues());
            setDisplayModeCount(0);
        }
    }
}
