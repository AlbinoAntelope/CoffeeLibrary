package coffee;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 * @version 0.1
 * @since 0.1
 */
public class CoffeeFactory {
    public CoffeeFactory(){
        
    }
    
    public Coffee makeCoffee(){
        return new Coffee();
    }
    
    public CoffeeIced makeCoffeeIced(){
        return new CoffeeIced();
    }
    
    public CoffeeEspresso makeCoffeeEspresso(){
        return new CoffeeEspresso();
    }
    
    public CoffeeLatte makeCoffeeLatte(){
        return new CoffeeLatte();
    }
}
