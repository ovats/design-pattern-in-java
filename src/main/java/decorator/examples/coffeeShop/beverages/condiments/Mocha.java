package decorator.examples.coffeeShop.beverages.condiments;

import decorator.examples.coffeeShop.beverages.Beverage;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", mocha";
    }

    @Override
    public float getCost() {
        return super.getCost() + 0.20f;
    }
}
