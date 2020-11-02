
package com.zipcodewilmington.scientificcalculator;


import com.zipcodewilmington.scientificcalculator.MainApplication;
import com.zipcodewilmington.scientificcalculator.ScientificMethod;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by leon on 2/9/18.
 */
public class ScientificMethodTest {

    private final static Logger logger = Logger.getLogger(ScientificMethod.class.getName());

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }


    @Test
    public void factorialTest() {

        logger.log(Level.INFO, "Testing Factorial");
        Assertions.assertTrue(ScientificMethodCalculations.factorial(5) == 120);
    }

    @Test
    public void naturalLogTest() {

        logger.log(Level.INFO, "Testing Natural Log");
        Assertions.assertEquals(ScientificMethodCalculations.naturalLog(5), 4.0);
    }

    @Test
    public void logTest() {
        logger.log(Level.INFO, "Testing Logarithmic of a number when the base is 10");
        Assertions.assertEquals(ScientificMethodCalculations.log(10), 1);
    }

    @Test
    public void inverseLogTest() {
        logger.log(Level.INFO, "Testing the inverse log 10^x ");
        Assertions.assertEquals(ScientificMethodCalculations.inverseLog(1), 61304);


    }

    @Test
    public void getSine() {
        logger.log(Level.INFO, "Testing the Sine Function");
        Assertions.assertEquals(CoreFeaturesCalculations.add(5), 10.0);
    }

    @Test
    public void getCosine() {
        logger.log(Level.INFO, "Testing the Cosine Function");
        Assertions.assertEquals(CoreFeaturesCalculations.add(5), 15.0);
    }

    @Test
    public void getTangent() {
        logger.log(Level.INFO, "Testing the Tangent Function");
        Assertions.assertEquals(CoreFeaturesCalculations.add(5), 5.0);
    }

    @Test
    public void getInSine() {
        logger.log(Level.INFO, "Testing the InSine Function");
        Assertions.assertEquals(CoreFeaturesCalculations.add(5), 6.0);
    }

    @Test
    public void getInCosine() {
        logger.log(Level.INFO, "Testing the InCosine Function");
        Assertions.assertEquals(CoreFeaturesCalculations.add(5), 61309.41362633611);
    }

    @Test
    public void getInTangent() {
        logger.log(Level.INFO, "Testing the InTangent Function");
        Assertions.assertEquals(CoreFeaturesCalculations.add(5), 61314.41362633611);
    }
}
