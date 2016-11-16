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
 */
public class CoffeeFactoryTest {
    
    public CoffeeFactoryTest() {
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
     * Test of makeCoffee method, of class CoffeeFactory.
     */
    @Test
    public void testMakeCoffee() {
        System.out.println("makeCoffee");
        CoffeeFactory instance = new CoffeeFactory();
        Coffee result = instance.makeCoffee();
        assert(Coffee.class.isInstance(result));
    }

    /**
     * Test of makeCoffeeIced method, of class CoffeeFactory.
     */
    @Test
    public void testMakeCoffeeIced() {
        System.out.println("makeCoffeeIced");
        CoffeeFactory instance = new CoffeeFactory();
        Coffee result = instance.makeCoffeeIced();
        assert(CoffeeIced.class.isInstance(result));
    }

    /**
     * Test of makeCoffeeEspresso method, of class CoffeeFactory.
     */
    @Test
    public void testMakeCoffeeEspresso() {
        System.out.println("makeCoffeeEspresso");
        CoffeeFactory instance = new CoffeeFactory();
        Coffee result = instance.makeCoffeeEspresso();
        assert(CoffeeEspresso.class.isInstance(result));
    }

    /**
     * Test of makeCoffeeLatte method, of class CoffeeFactory.
     */
    @Test
    public void testMakeCoffeeLatte() {
        System.out.println("makeCoffeeEspresso");
        CoffeeFactory instance = new CoffeeFactory();
        Coffee result = instance.makeCoffeeLatte();
        assert(CoffeeLatte.class.isInstance(result));
    }
    
}
