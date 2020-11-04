package com.zipcodewilmington.scientificcalculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class CustomFeaturesTest {
    private final static Logger logger = Logger.getLogger(ScientificMethod.class.getName());

    @Test
    void radius() {
        logger.log(Level.INFO, "Testing Radius");
        Display displayValues = new Display();
        displayValues.setDisplay(10);
        CustomFeatures customFeatures = new CustomFeatures();
        customFeatures.radius(displayValues);
        assertEquals(displayValues.getDisplay(), 314.1592653589793);
    }
}