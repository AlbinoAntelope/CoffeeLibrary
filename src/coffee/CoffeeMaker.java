/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee;

/**
 *
 * @author Daniel
 * @version 0.1
 * @since 0.1
 */
public class CoffeeMaker {
    Coffee coffee;

    /**
     * Construct CoffeeMaker with default Coffee
     */
    public CoffeeMaker() {
        coffee = new Coffee();
    }

    /**
     * Construct CoffeeMaker with specific Coffee
     * @param coffee
     */
    public CoffeeMaker(Coffee coffee) {
        this.coffee = coffee;
    }
    
    /**
     * Set the Coffee this CoffeeMaker makes
     * @param coffee
     */
    public void setCoffee(Coffee coffee){
        this.coffee=coffee;
    }
    
    /**
     * Make a cup of coffee
     * @return process of making coffee
     */
    public String makeCoffee(){
        return "Making " + coffee.name + "...\n"
                + coffee.makeCoffee() +"\n"
                + "Done!";
    }
}
