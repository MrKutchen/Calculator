package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by Zekai He 10/31/2020
 */
public class ScientificMethod2 {

    boolean radOrDeg = true; //true = Deg, false = Rad
    String displayMode = "Decimal"; //default

    public static void main(String[] args) {

        ScientificMethod2 testRun = new ScientificMethod2();

        //testRun.switchUnitsMode("Degrees");
        //testRun.getUnit();
        //testRun.convToDecimal("64","Hexadecimal");
    }

    public String getUserInput(){
        Scanner userInputMode = new Scanner(System.in);
        String userInput = userInputMode.nextLine();
        return userInput;
    }

//    public void switchDisplayMode(){
//        //[binary, octal, decimal, hexadecimal]
//        String[] displayModeList = {"Binary","Octal","Decimal","Hexadecimal"};
//        String display= "";
//        for(int i=0; i<=3; i++){
//            display += " " + displayModeList[i];
//        }
//        System.out.println(display);
//        System.out.println("Current display set to " + displayMode);
//        String mode = this.getUserInput();
//
//        switch (mode){
//            case "Binary":
//                displayMode = "Binary";
//                break;
//            case "Octal":
//                displayMode = "Octal";
//                break;
//            case "Decimal":
//                displayMode = "Decimal";
//                break;
//            case "Hexadecimal":
//                displayMode = "Hexadecimal";
//                break;
//        }
//        System.out.println("DisplayMode has been set to " + mode);
//    }

//    public void switchDisplayMode(double output){
//        //checks if there are fractional numbers
//        double digitsRight = output-Math.floor(output);
//        String reuseForCalc = "";
//        if (digitsRight>0){
//            System.out.println("Can't convert fractional numbers, please enter a whole number");
//        }
//        else {
//            int wrapInt = (int)output; //if not, change double to integer
//            switch (displayMode){
//                case "Binary":
//                    System.out.println(Integer.toBinaryString(wrapInt));
//                    break;
//                case "Octal":
//                    System.out.println(Integer.toOctalString(wrapInt));
//                    break;
//                case "Hexadecimal":
//                    System.out.println(Integer.toHexString(wrapInt));
//                    break;
//                default:
//                    System.out.println(output);
//            }
//        }
//    }

//    public void convToDecimal(String value, String displayMode){
//        switch (displayMode) {
//            case "Binary":
//                System.out.println(Integer.parseInt(value, 2));
//                break;
//            case "Octal":
//                System.out.println(Integer.parseInt(value, 8));
//                break;
//            case "Hexadecimal":
//                System.out.println(Integer.parseInt(value, 16));
//                break;
//            default:
//        }
//    }

    public void switchUnitsMode(){
        String unitValue = "";
        if (radOrDeg) {
            unitValue = "Degrees";
        }
        else{
            unitValue = "Radians";
        }
        System.out.println("Current unit set to " + unitValue);
        System.out.println("Your options are Radians or Degrees");
    }

    public void switchUnitsMode(String unit){
        if (unit.equals("Radians")){
            radOrDeg = false;
            System.out.println("Unit set to Radians");
        }
        else if (unit.equals("Degrees")){
            radOrDeg = true;
            System.out.println("Unit set to Degrees");
        }
        else {
            System.out.println("Invalid entry, please redo command.");
        }
    }

    // used internally in trig functions
    public double degToRad(double deg){
     double degInput;
     degInput = Math.toRadians(deg);
     return degInput;
    }

    //For Peter, do for all trig functions below!
    //Replace "userInput1" arg with Constant.display
    //This method might not need to return anything, could change type to "void"
    //Replace "output" with Constant.display
    public double getSine(double userInput1, boolean unitsMode){
        //default math method accepts radian
        double output; //delete this line when merging
        if (unitsMode) {
            output = Math.sin(this.degToRad(userInput1));
        }
        else {
            output = Math.sin(userInput1);
        }
        return output;
    }

//    public double getCosine(double userInput1,boolean unitsMode){
//        //default math method accepts radian
//        double output;
//        if (unitsMode) {
//            output = Math.cos(this.degToRad(userInput1));
//        }
//        else {
//            output = Math.cos(userInput1);
//        }
//        return output;
//    }
//
//    public double getTangent(double userInput1,boolean unitsMode){
//        //default math method accepts radian
//        double output;
//        if (unitsMode) {
//            output = Math.tan(this.degToRad(userInput1));
//        }
//        else {
//            output = Math.tan(userInput1);
//        }
//        return output;
//    }
//
//    public double getInSine(double userInput1, boolean unitsMode){
//        //default math method accepts radian
//        //default returns radian
//        double output;
//        if (unitsMode) {
//            output = Math.toDegrees(Math.asin(userInput1));
//        }
//        else {
//            output = Math.asin(userInput1);
//        }
//        return output;
//    }
//
//    public double getInCosine(double userInput1, boolean unitsMode){
//        //default math method accepts radian
//        double output;
//        if (unitsMode) {
//            output = Math.toDegrees(Math.acos(userInput1));
//        }
//        else {
//            output = Math.acos(userInput1);
//        }
//        return output;
//    }
//
//    public double getInTangent(double userInput1, boolean unitsMode){
//        //default math method accepts radian
//        double output;
//        if (unitsMode) {
//            output = Math.toDegrees(Math.atan(userInput1));
//        }
//        else {
//            output = Math.atan(userInput1);
//        }
//        return output;
//    }


}
