package com.zipcodewilmington.scientificcalculator;

import org.junit.jupiter.api.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class CoreFeaturesCalculationsTest {

    private final static Logger logger = Logger.getLogger(ScientificMethod.class.getName());

    @Test
    void add() {
        logger.log(Level.INFO, "Testing Adding");
        Display displayValues = new Display();
        displayValues.setDisplay(10);
        CoreFeaturesCalculations coreFeaturesCalculations = new CoreFeaturesCalculations(displayValues);
        coreFeaturesCalculations.add(5);
        assertEquals(displayValues.getDisplay(), 15);
    }

    @Test
    void subtract() {
        logger.log(Level.INFO, "Testing Subtract");
        Display displayValues = new Display();
        displayValues.setDisplay(10);
        CoreFeaturesCalculations coreFeaturesCalculations = new CoreFeaturesCalculations(displayValues);
        coreFeaturesCalculations.subtract(5);
        assertEquals(displayValues.getDisplay(), 5);
    }

    @Test
    void multiply() {
        logger.log(Level.INFO, "Testing Multiply");
        Display displayValues = new Display();
        displayValues.setDisplay(10);
        CoreFeaturesCalculations coreFeaturesCalculations = new CoreFeaturesCalculations(displayValues);
        coreFeaturesCalculations.multiply(5);
        assertEquals(displayValues.getDisplay(), 50);
    }

    @Test
    void divide() {
        logger.log(Level.INFO, "Testing Divide");
        Display displayValues = new Display();
        displayValues.setDisplay(10);
        CoreFeaturesCalculations coreFeaturesCalculations = new CoreFeaturesCalculations(displayValues);
        coreFeaturesCalculations.divide(2);
        assertEquals(displayValues.getDisplay(), 5);
    }

    @Test
    void square() {
        logger.log(Level.INFO, "Testing Square");
        Display displayValues = new Display();
        displayValues.setDisplay(10);
        CoreFeaturesCalculations coreFeaturesCalculations = new CoreFeaturesCalculations(displayValues);
        coreFeaturesCalculations.square();
        assertEquals(displayValues.getDisplay(), 100);
    }

    @Test
    void squareRoot() {
        logger.log(Level.INFO, "Testing SquareRoot");
        Display displayValues = new Display();
        displayValues.setDisplay(100);
        CoreFeaturesCalculations coreFeaturesCalculations = new CoreFeaturesCalculations(displayValues);
        coreFeaturesCalculations.squareRoot();
        assertEquals(displayValues.getDisplay(), 10);
    }

    @Test
    void variableExponentiation() {
        logger.log(Level.INFO, "Testing Exponentiation");
        Display displayValues = new Display();
        displayValues.setDisplay(10);
        CoreFeaturesCalculations coreFeaturesCalculations = new CoreFeaturesCalculations(displayValues);
        coreFeaturesCalculations.variableExponentiation(5, 5);
        assertEquals(displayValues.getDisplay(), 3125.0);
    }

    @Test
    void inverseOfTheNumber() {
        logger.log(Level.INFO, "Testing InverseOfNumber");
        Display displayValues = new Display();
        displayValues.setDisplay(10);
        CoreFeaturesCalculations coreFeaturesCalculations = new CoreFeaturesCalculations(displayValues);
        coreFeaturesCalculations.inverseOfTheNumber();
        assertEquals(displayValues.getDisplay(), 0.1);
    }

    @Test
    void invertTheSign() {
        logger.log(Level.INFO, "Testing Invert the Sign");
        Display displayValues = new Display();
        displayValues.setDisplay(10);
        CoreFeaturesCalculations coreFeaturesCalculations = new CoreFeaturesCalculations(displayValues);
        coreFeaturesCalculations.invertTheSign();
        assertEquals(displayValues.getDisplay(), -10);
    }
}
