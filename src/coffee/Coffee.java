package coffee;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel Eryavec
 * @version 0.1
 * @since 0.1
 */
public class Coffee {
    public String name;
    String taste;
    
    public Coffee(){
        this.name = "coffee";
        this.taste = "bitter";
    }
    
    /**
     * Describes process for making Coffee
     * @return Process for making Coffee
     */
    public String makeCoffee(){
        String str ="Adding grounds...\n"
                + "Pouring hot water on grounds...\n"
                + "Brewing...";
        return str;
    }
    
    /**
     * Describes the Coffee's taste
     * @return Description of the Coffee's taste
     */
    public String howDoesItTaste(){
        return "It tastes " + this.taste + "!";
    }
}
