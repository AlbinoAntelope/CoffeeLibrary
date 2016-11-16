/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel
 * @version 0.1
 * @since 0.1
 */
public class CoffeeMakerTest {
    
    public CoffeeMakerTest() {
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
     * Test of setCoffee method, of class CoffeeMaker.
     */
    @Test
    public void testSetCoffee() {
        System.out.println("setCoffee");
        Coffee coffee = null;
        CoffeeMaker instance = new CoffeeMaker();
        instance.setCoffee(coffee);
        Coffee result = instance.coffee;
        Coffee expectedResult = coffee;
        assertEquals(expectedResult, result);
        
        coffee = new Coffee();
        instance.setCoffee(coffee);
        result = instance.coffee;
        expectedResult = coffee;
        assertEquals(expectedResult, result);
        
        coffee = new CoffeeLatte();
        instance.setCoffee(coffee);
        result = instance.coffee;
        expectedResult = coffee;
        assertEquals(expectedResult, result);
    }

    /**
     * Test of makeCoffee method, of class CoffeeMaker, on plain coffee.
     */
    @Test
    public void testMakeCoffee() {
        System.out.println("makeCoffee");
        CoffeeMaker instance = new CoffeeMaker();
        String expResult = "Making coffee...\n"
                + "Adding grounds...\n"
                + "Pouring hot water on grounds...\n"
                + "Brewing...\n"
                + "Done!";
        String result = instance.makeCoffee();
        assertEquals(expResult, result);
    }

    /**
     * Test of makeCoffee method, of class CoffeeMaker, on a latte.
     */
    @Test
    public void testMakeLatte() {
        System.out.println("makeCoffee");
        CoffeeMaker instance = new CoffeeMaker(new CoffeeLatte());
        String expResult = "Making latte...\n"
                + "Adding grounds...\n"
                + "Heating and pressurizing water...\n"
                + "Pouring pressurized hot water on grounds...\n"
                + "Brewing...\n"
                + "Adding milk...\n"
                + "Done!";
        String result = instance.makeCoffee();
        assertEquals(expResult, result);
    }
    
}
