/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Shriya
 */
public class testcalculator {
    calculator c= new calculator();
    
    public testcalculator() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
     @Test
     public void testaddition() {
        assertEquals(6,c.addition(2,4));
     }
     
     @Test
     public void testsubtraction() {
        assertEquals(5,c.subtraction(8,3));
     }
     
     @Test
     public void testmultiplication() {
        assertEquals(24,c.multiplication(3,8));
     }
     
     @Test
     public void testdivision() {
        assertEquals(4.8,c.division(24,5),0.1);
     }
}
