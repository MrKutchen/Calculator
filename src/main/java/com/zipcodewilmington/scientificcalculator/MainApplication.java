package com.zipcodewilmington.scientificcalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static int display = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean powerOn = true;
        while (powerOn) {
            Console.println("\n" +
                    "Welcome to our c3 calculator!\n" +
                    "Please choose from the following options:\n" +
                    "Type 1 for Core Features\n" +
                    "Type 2 for Scientific Features\n" +
                    "Type 3 to power down\n" +
                    "The current display = " + display +"\n" + "\n" +
                    "Enter choice here: ");


            try {
                int input = scanner.nextInt();
                switch (input) {
                    case 1:
                        CoreFeatures.displayOptions();
                        break;
                    case 2:
                        CoreFeatures.clearDisplay();
                        break;
                    case 3:
                        powerOn = false;
                        System.out.println("Already....fine. Powering down. (-_-)");
                        break;
                    default:
                        System.out.println("Please choose a correct option, your a Zip Coder! We know you can read!\n" +
                                "");
                        break;
                }
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Please choose a correct option, you're a Zip Coder! We know you can read!");
            }
        }
    }

//        String s = Console.getStringInput("Enter a string");
//        Integer i = Console.getIntegerInput("Enter an integer");
//        Double d = Console.getDoubleInput("Enter a double.");
//
//        Console.println("The user input %s as a string", s);
//        Console.println("The user input %s as a integer", i);
//        Console.println("The user input %s as a d", d);
}

