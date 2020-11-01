//package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.ScientificMethod;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
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
    public void getSine() {
    ScientificMethod sin = new ScientificMethod();

    assertEquals(Double.valueOf(0),sin.getSine(0),0.00001);
    assertEquals(Double.valueOf(0.909297),sin.getSine(2),0.00001);
    }

    @Test
    public void degToRad() {
        ScientificMethod rad = new ScientificMethod();
        assertEquals(Double.valueOf(3.14159),rad.degToRad(180),0.00001);
        assertEquals(Double.valueOf(-3.14159),rad.degToRad(-180),0.00001);
        assertEquals(Double.valueOf(1.5708),rad.degToRad(90),0.00001);
    }
}