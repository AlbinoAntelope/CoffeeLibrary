package coffee;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import coffee.Coffee;
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
public class CoffeeTest {
    
    public CoffeeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    Coffee testCoffee;
    @Before
    public void setUp() {
        testCoffee = new Coffee();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of makeCoffee method, of class Coffee.
     */
    @Test
    public void testMakeCoffee() {
        System.out.println("makeCoffee");
        Coffee instance = new Coffee();
        String expResult = "Adding grounds...\n"
                + "Pouring hot water on grounds...\n"
                + "Brewing...";
        String result = instance.makeCoffee();
        assertEquals(expResult, result);
    }

    /**
     * Test of howDoesItTaste method, of class Coffee.
     */
    @Test
    public void testHowDoesItTaste() {
        System.out.println("howDoesItTaste");
        Coffee instance = new Coffee();
        String expResult = "It tastes bitter!";
        String result = instance.howDoesItTaste();
        assertEquals(expResult, result);
    }
    
}
