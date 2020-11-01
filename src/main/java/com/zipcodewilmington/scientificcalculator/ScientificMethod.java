package com.zipcodewilmington.scientificcalculator;

//import java.io.*;
import java.lang.Math;
import java.util.Scanner;

public class ScientificMethod {



    public static Integer factorial(Integer enteredNum){
        Integer factValue = 1;
        for(int i=1; i <= enteredNum; i++ ){
            factValue = factValue*i;
        }
        return  factValue;
    }

    public static Double log(Double enteredNum){
        Double result = Math.log10(enteredNum);

        //gives the Logarithmic of a number when the base is 10

        return result;
    }

    public static Double inverseLog(Double enteredNum){
        Double result = Math.pow(10.00, enteredNum);
        //10^x == y

        return result;
    }


    public static Double naturalLog(Double enteredNum){
        Double result = Math.log(enteredNum);

        /*returns the natural logarithm (base e) of a double value.
        //if the argument is NAN or less than zero, then the result is NAN
        if the argument is positive infinity, then the result is positive infinity*/

        return result;
    }


    public static Double inverseNaturalLog(Double enteredNum){
        Double result = Math.exp(enteredNum);

        //returns euler’s number 'e' raised to the power of a double value

        return result;
    }


}
