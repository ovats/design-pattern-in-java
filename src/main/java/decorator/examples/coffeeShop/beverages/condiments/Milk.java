package decorator.examples.coffeeShop.beverages.condiments;

import decorator.examples.coffeeShop.beverages.Beverage;
import decorator.examples.coffeeShop.beverages.condiments.CondimentDecorator;

public class Milk extends CondimentDecorator {

    public Milk (Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", milk";
    }

    @Override
    public float getCost() {
        return super.getCost() + 0.15f;
    }
}
