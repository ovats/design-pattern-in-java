package decorator.examples.coffeeShop.beverages;

public class Espresso extends Beverage {

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public float getCost() {
        return 1.4f;
    }
}
