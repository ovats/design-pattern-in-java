package decorator.examples.coffeeShop;

import decorator.examples.coffeeShop.beverages.*;
import decorator.examples.coffeeShop.beverages.condiments.*;

public class CoffeeShop {

    public static void main(String[] args) {

        Beverage b1 = new Decaf();
        b1 = new Milk(b1);
        b1 = new Milk(b1);
        System.out.println("Beverage: " + b1.getDescription() + " $" + b1.getCost());

        Beverage b2 = new Espresso();
        b2 = new Mocha(b2);
        b2 = new Whip(b2);
        System.out.println("Beverage: " + b2.getDescription() + " $" + b2.getCost());
    }
}
