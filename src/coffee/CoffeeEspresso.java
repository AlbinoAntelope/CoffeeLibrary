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
public class CoffeeEspresso extends Coffee {

    public CoffeeEspresso() {
        this.name = "espresso";
        this.taste = "creamy";
    }
    
    public String makeCoffee(){
        return "Adding grounds...\n"
                + "Heating and pressurizing water...\n"
                + "Pouring pressurized hot water on grounds...\n"
                + "Brewing...";
    }
    
}
