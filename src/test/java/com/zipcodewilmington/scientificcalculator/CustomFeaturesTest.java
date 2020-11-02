package com.zipcodewilmington.scientificcalculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class CustomFeaturesTest {
    private final static Logger logger = Logger.getLogger(ScientificMethod.class.getName());

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void radius() {
        logger.log(Level.INFO, "Testing Radius");
        assertEquals(CoreFeaturesCalculations.add(5), 5);
    }

    @Test
    void conversion() {
        logger.log(Level.INFO, "Testing Radius");
        assertEquals(CoreFeaturesCalculations.add(5), 10);
    }
}