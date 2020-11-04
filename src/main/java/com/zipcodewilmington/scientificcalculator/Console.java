package com.zipcodewilmington.scientificcalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Team c3 on 10/30/20.
 */
public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static void runTheConsole() {
        Display displayValues = new Display();

        CoreFeaturesCalculations calculations = new CoreFeaturesCalculations(displayValues);

        CoreFeatures core = new CoreFeatures(displayValues, calculations);
        
        ScientificMethod scienceMethodValuesToPass = new ScientificMethod(displayValues);

        Scanner scanner = new Scanner(System.in);
        boolean powerOn = true;
        System.out.println("Beep, Bop, Clunky Noises....Powering ON....\n" +

                "Welcome to our c3 calculator!");
        while (powerOn) {
            Console.println("\n" +
                    "Please choose from the following options:\n" +
                    "1 - Core Features\n" +
                    "2 - Scientific Features\n" +
                    "3 - Custom Features\n" +
                    "4 - Memory\n" +
                    "5 - Power Down\n" +
                    "---------------------------------\n" +
                    "CURRENT DISPLAY = " + displayValues.getDisplay() + "\n" +
                    "---------------------------------\n" +
                    "Enter choice here: -> ");


            try {
                int input = scanner.nextInt();
                switch (input) {
                    case 1:
                        core.coreFeaturesOptions();
                        break;
                    case 2:
                        scienceMethodValuesToPass.scientificMethodOptions();
                        break;
                    case 3:
                        CustomFeatures.customFeaturesOptions(displayValues);
                        break;
                    case 4:
                        Memory.memoryOptions(displayValues);
                        break;
                    case 5:
                        powerOn = false;
                        System.out.println("Alrighty....fine. Powering down. (-_-)");
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
}
