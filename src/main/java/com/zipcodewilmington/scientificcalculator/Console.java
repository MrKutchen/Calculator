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
                    "CURRENT DISPLAY = " + Constants.display + "\n" +
                    "---------------------------------\n" +
                    "Enter choice here: -> ");


            try {
                int input = scanner.nextInt();
                switch (input) {
                    case 1:
                        CoreFeatures.coreFeaturesOptions();
                        break;
                    case 2:
                        System.out.println(Constants.currentMemory);
                        break;
                    case 3:
                        CustomFeatures.customFeaturesOptions();
                        break;
                    case 4:
                        Memory.memoryOptions();
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
//
//    public static String getStringInput(String prompt) {
//        Scanner scanner = new Scanner(System.in);
//        println(prompt);
//        String userInput = scanner.nextLine();
//        return userInput;
//    }

//    public static Integer getIntegerInput(String prompt) {
//        return null;
//    }
//
//    public static Double getDoubleInput(String prompt) {
//        return null;
//    }
}
