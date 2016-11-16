package coffee;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import coffee.CoffeeIced;
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
public class CoffeeIcedTest {
    
    public CoffeeIcedTest() {
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
     * Test of makeCoffee method, of class CoffeeIced.
     */
    @Test
    public void testMakeCoffee() {
        System.out.println("makeCoffee");
        CoffeeIced instance = new CoffeeIced();
        String expResult = "Adding grounds...\n"
                + "Pouring hot water on grounds...\n"
                + "Brewing...\n"
                + "Adding ice & sugar...\n"
                + "Chilling...";
        String result = instance.makeCoffee();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of howDoesItTaste method, of superclass Coffee.
     */
    @Test
    public void testTasteCoffee() {
        System.out.println("howDoesItTaste");
        CoffeeIced instance = new CoffeeIced();
        String expResult = "It tastes sweet & cool!";
        String result = instance.howDoesItTaste();
        assertEquals(expResult, result);
    }
    
}
