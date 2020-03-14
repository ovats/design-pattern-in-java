package decorator.examples.coffeeShop.beverages.condiments;

import decorator.examples.coffeeShop.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {

    private Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public float getCost() {
        return beverage.getCost();
    }
}
