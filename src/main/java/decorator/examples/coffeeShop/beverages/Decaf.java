package decorator.examples.coffeeShop.beverages;

import decorator.examples.coffeeShop.beverages.Beverage;

public class Decaf extends Beverage {

    @Override
    public String getDescription() {
        return "Decaf";
    }

    @Override
    public float getCost() {
        return 1f;
    }
}
