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
public class CoffeeIced extends Coffee {
    
    public CoffeeIced(){
        this.name="iced coffee";
        this.taste="sweet & cool";
    }
    
    
    @Override
    public String makeCoffee(){
        return super.makeCoffee()
                +"\nAdding ice & sugar...\n"
                + "Chilling...";
    }
    
}
