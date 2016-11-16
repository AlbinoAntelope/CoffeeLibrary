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
public class CoffeeLatte extends CoffeeEspresso {

    public CoffeeLatte() {
        super();
        this.name="latte";
    }
    
    @Override
    public String makeCoffee(){
        return super.makeCoffee() + "\n"
                + "Adding milk...";
    }
}
