
package com.zipcodewilmington.scientificcalculator;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by leon on 2/9/18.
 */
public class ScientificMethodTest {

    private final static Logger logger = Logger.getLogger(ScientificMethod.class.getName());

    @Test
    public void factorialTest() {
        logger.log(Level.INFO, "Testing Factorial");
        Display displayValues = new Display();
        displayValues.setDisplay(10);
        ScientificMethodCalculations scientificMethodCalculations = new ScientificMethodCalculations(displayValues);
        scientificMethodCalculations.factorial(displayValues);
        Assertions.assertEquals(displayValues.getDisplay(), 3628800.0);
    }

    @Test
    public void naturalLogTest() {

        logger.log(Level.INFO, "Testing Natural Log");
        Display displayValues = new Display();
        displayValues.setDisplay(10);
        ScientificMethodCalculations scientificMethodCalculations = new ScientificMethodCalculations(displayValues);
        scientificMethodCalculations.naturalLog(displayValues);
        Assertions.assertEquals(displayValues.getDisplay(), 2.302585092994046);
    }

//    @Test
//    public void logTest() {
//        logger.log(Level.INFO, "Testing Logarithmic of a number when the base is 10");
//        Display displayValues = new Display();
//        displayValues.setDisplay(10);
//        ScientificMethodCalculations scientificMethodCalculations = new ScientificMethodCalculations(displayValues);
//        scientificMethodCalculations.logTest(displayValues);
//        Assertions.assertEquals(displayValues.getDisplay(), 3628800.0);
//    }

    @Test
    public void inverseLogTest() {
        logger.log(Level.INFO, "Testing the inverse log 10^x ");
        Display displayValues = new Display();
        displayValues.setDisplay(10);
        ScientificMethodCalculations scientificMethodCalculations = new ScientificMethodCalculations(displayValues);
        scientificMethodCalculations.inverseLog(displayValues);
        Assertions.assertEquals(displayValues.getDisplay(), 1.0E10);
    }

    @Test
    public void getSine() {
        logger.log(Level.INFO, "Testing the Sine Function");
        Display displayValues = new Display();
        displayValues.setDisplay(10);
        ScientificMethodCalculations scientificMethodCalculations = new ScientificMethodCalculations(displayValues);
        scientificMethodCalculations.getSine(displayValues);
        Assertions.assertEquals(displayValues.getDisplay(), -31.170124765295153);
    }

    @Test
    public void getCosine() {
        logger.log(Level.INFO, "Testing the Cosine Function");
        Display displayValues = new Display();
        displayValues.setDisplay(10);
        ScientificMethodCalculations scientificMethodCalculations = new ScientificMethodCalculations(displayValues);
        scientificMethodCalculations.getCosine(displayValues);
        Assertions.assertEquals(displayValues.getDisplay(), -48.075274515658606);
    }

    @Test
    public void getTangent() {
        logger.log(Level.INFO, "Testing the Tangent Function");
        Display displayValues = new Display();
        displayValues.setDisplay(10);
        ScientificMethodCalculations scientificMethodCalculations = new ScientificMethodCalculations(displayValues);
        scientificMethodCalculations.getTangent(displayValues);
        Assertions.assertEquals(displayValues.getDisplay(), 37.14835229793034);
    }

    @Test
    public void getInSine() {
        logger.log(Level.INFO, "Testing the InSine Function");
        Display displayValues = new Display();
        displayValues.setDisplay(10);
        ScientificMethodCalculations scientificMethodCalculations = new ScientificMethodCalculations(displayValues);
        scientificMethodCalculations.getInSine(displayValues);
        Assertions.assertEquals(displayValues.getDisplay(), Double.NaN);
    }

    @Test
    public void getInCosine() {
        logger.log(Level.INFO, "Testing the InCosine Function");
        Display displayValues = new Display();
        displayValues.setDisplay(-100);
        ScientificMethodCalculations scientificMethodCalculations = new ScientificMethodCalculations(displayValues);
        scientificMethodCalculations.getInCosine(displayValues);
        Assertions.assertEquals(displayValues.getDisplay(), Double.NaN);

    }

    @Test
    public void getInTangent() {
        logger.log(Level.INFO, "Testing the InTangent Function");
        Display displayValues = new Display();
        displayValues.setDisplay(10);
        ScientificMethodCalculations scientificMethodCalculations = new ScientificMethodCalculations(displayValues);
        scientificMethodCalculations.getInTangent(displayValues);
        Assertions.assertEquals(displayValues.getDisplay(), 84.28943700137192);
    }
}
