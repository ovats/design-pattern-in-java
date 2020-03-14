package decorator.examples.coffeeShop.beverages.condiments;

import decorator.examples.coffeeShop.beverages.Beverage;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", whip";
    }

    @Override
    public float getCost() {
        return super.getCost() + 0.18f;
    }
}
