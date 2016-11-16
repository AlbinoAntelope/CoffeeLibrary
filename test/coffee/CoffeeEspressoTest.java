package coffee;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import coffee.CoffeeEspresso;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel
 */
public class CoffeeEspressoTest {
    
    public CoffeeEspressoTest() {
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

    /**
     * Test of makeCoffee method, of class CoffeeEspresso.
     */
    @Test
    public void testMakeCoffee() {
        System.out.println("makeCoffee");
        CoffeeEspresso instance = new CoffeeEspresso();
        String expResult = "Adding grounds...\n"
                + "Heating and pressurizing water...\n"
                + "Pouring pressurized hot water on grounds...\n"
                + "Brewing...";
        String result = instance.makeCoffee();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of howDoesItTaste method, of superclass Coffee.
     */
    @Test
    public void testTasteCoffee() {
        System.out.println("howDoesItTaste");
        CoffeeEspresso instance = new CoffeeEspresso();
        String expResult = "It tastes creamy!";
        String result = instance.howDoesItTaste();
        assertEquals(expResult, result);
    }
    
}
