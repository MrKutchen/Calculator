package com.zipcodewilmington.scientificcalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Team c3 on 10/30/20.
 */

public class Memory {
    public static Scanner scanner = new Scanner(System.in);

    public static void memoryOptions(Display displayValues) {
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
                        addToMemory(displayValues);
                        displayValues.currentDisplay();
                        break;
                    case 2:
                        resetMemory(displayValues);
                        displayMemory(displayValues);
                        break;
                    case 3:
                        displayMemory(displayValues);
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


    public static void displayMemory(Display displayValues) {
        System.out.println("---------------------------------\n" +
                "CURRENT DISPLAY FROM MEMORY = " + displayValues.getCurrentMemory() + "\n" +
                "---------------------------------\n");
    }

    public static void addToMemory(Display displayValues) {
        displayValues.setCurrentMemory(displayValues.getCurrentMemory() + displayValues.getDisplay());
        displayMemory(displayValues);
    }

    public static void resetMemory(Display displayValues) {
        displayValues.setCurrentMemory(0);
        displayMemory(displayValues);
    }

}
