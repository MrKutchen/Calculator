package com.zipcodewilmington.scientificcalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Team c3 on 10/30/20.
 */

public class Memory {
    public static Scanner scanner = new Scanner(System.in);

    public static void memoryOptions() {
        boolean powerOn = true;
        while (powerOn) {
            Console.println("\n" +
                    "Please choose from the following options:\n" +
                    "1 - Add the current displayed value to the value in memory\n" +
                    "2 - Reset memory\n" +
                    "3 - Recall current value from memory to display\n" +
                    "4 - Main Menu\n" + "\n" +
                    "Enter choice here: -> ");


            try {
                int input = scanner.nextInt();
                switch (input) {
                    case 1:
                        addToMemory();
                        CoreFeatures.currentDisplay();
                        break;
                    case 2:
                        resetMemory();
                        displayMemory();
                        break;
                    case 3:
                        displayMemory();
                        break;
                    case 4:
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


    public static void displayMemory() {
        System.out.println("---------------------------------\n" +
                "CURRENT DISPLAY FROM MEMORY = " + Constants.currentMemory + "\n" +
                "---------------------------------\n");
    }

    public static void addToMemory() {
        Constants.display += Constants.currentMemory;
        double resultOfMemoryPlusDisplay = Constants.display += Constants.currentMemory;
        CoreFeatures.currentDisplay();
        Constants.currentMemory = resultOfMemoryPlusDisplay;
    }

    public static void resetMemory() {
        Constants.currentMemory = 0;
        displayMemory();
    }

}
