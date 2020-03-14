package decorator.examples.coffeeShop.beverages.condiments;

import decorator.examples.coffeeShop.beverages.Beverage;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", soy";
    }

    @Override
    public float getCost() {
        return super.getCost() + 0.22f;
    }
}
