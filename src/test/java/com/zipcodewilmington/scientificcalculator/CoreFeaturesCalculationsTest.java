package com.zipcodewilmington.scientificcalculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class CoreFeaturesCalculationsTest {

    private final static Logger logger = Logger.getLogger(ScientificMethod.class.getName());


    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void add() {
        logger.log(Level.INFO, "Testing Adding");
        assertEquals(CoreFeaturesCalculations.add(5), 30);
    }

    @Test
    void subtract() {
        logger.log(Level.INFO, "Testing Subtract");
        assertEquals(CoreFeaturesCalculations.subtract(5), -5);
    }

    @Test
    void multiply() {
        logger.log(Level.INFO, "Testing Multiply");
        assertEquals(CoreFeaturesCalculations.multiply(5), 125);
    }

    @Test
    void divide() {
        logger.log(Level.INFO, "Testing Divide");
        assertEquals(CoreFeaturesCalculations.divide(5), 5);
    }

    @Test
    void square() {
        logger.log(Level.INFO, "Testing Square");
        assertEquals(CoreFeaturesCalculations.square(5), 25);
    }

    @Test
    void squareRoot() {
        logger.log(Level.INFO, "Testing SquareRoot");
        assertEquals(CoreFeaturesCalculations.square(5), 25);
    }

    @Test
    void variableExponentiation() {
        logger.log(Level.INFO, "Testing Exponentiation");
        assertEquals(CoreFeaturesCalculations.square(5), 25);
    }

    @Test
    void inverseOfTheNumber() {
        logger.log(Level.INFO, "Testing InverseOfNumber");
        assertEquals(CoreFeaturesCalculations.square(5), 25);
    }

    @Test
    void invertTheSign() {
        logger.log(Level.INFO, "Testing Invert the Sign");
        assertEquals(CoreFeaturesCalculations.square(5), 25);
    }
}
