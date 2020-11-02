
package com.zipcodewilmington.scientificcalculator;


import com.zipcodewilmington.scientificcalculator.MainApplication;
import com.zipcodewilmington.scientificcalculator.ScientificMethod;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.assertTrue;

/**
 * Created by leon on 2/9/18.
 */
//public class ScientificMethodTest {
//
//    private final static Logger logger = Logger.getLogger(ScientificMethod.class.getName());
//
//    @Before
//    public void setUp() throws Exception{
//
//    }
//
//    @After
//    public void tearDown() throws Exception{
//
//    }



//    @Test
//        public void factorialTest() {
//
//        logger.log(Level.INFO, "Testing Factorial");
//            assertTrue(ScientificMethod.factorial(0) == 1);
//            assertTrue(ScientificMethod.factorial(1) == 1);
//            assertTrue(ScientificMethod.factorial(5) == 120);
//        }
//
//    @Test
//    public void naturalLogTest() {
//
//        logger.log(Level.INFO, "Testing Natural Log");
//
//
//        assertTrue(ScientificMethod.naturalLog(100.00) == 4.605170185988092);
//        assertTrue(ScientificMethod.naturalLog(50.50)==3.9219733362813143);
//        assertTrue(ScientificMethod.naturalLog(99999.00)==11.512915464920228);
//        assertTrue(ScientificMethod.naturalLog(334.4567)== 5.812507424253581);
//
//    }
//
//    @Test
//    public void logTest() {
//        logger.log(Level.INFO, "Testing Logarithmic of a number when the base is 10");
//
//        assertTrue(ScientificMethod.log(1.00) == 0.0);
//        assertTrue(ScientificMethod.log(1234.56) == 3.0915122016277716);
//        assertTrue(ScientificMethod.log(150.99) == 2.178948185116802);
//    }
//
//    @Test
//    public void inverseLogTest() {
//        logger.log(Level.INFO, "Testing the inverse log 10^x ");
//
//        assertTrue(ScientificMethod.inverseLog(1.00)==10);
//        assertTrue(ScientificMethod.inverseLog(0.00)==1);
//        assertTrue(ScientificMethod.inverseLog(-5.00)==0.00001);
//
//    }

//        @Test
//        public void getSine() {
//            ScientificMethod sin = new ScientificMethod();
//
//            assertEquals(Double.valueOf(0),sin.getSine(0),0.00001);
//            assertEquals(Double.valueOf(0.909297),sin.getSine(2),0.00001);
//        }
//
//        @Test
//        public void degToRad() {
//            ScientificMethod rad = new ScientificMethod();
//            assertEquals(Double.valueOf(3.14159),rad.degToRad(180),0.00001);
//            assertEquals(Double.valueOf(-3.14159),rad.degToRad(-180),0.00001);
//            assertEquals(Double.valueOf(1.5708),rad.degToRad(90),0.00001);
//}
