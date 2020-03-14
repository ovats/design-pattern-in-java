package decorator.examples.coffeeShop.beverages;

public class HouseBlend extends Beverage {

    @Override
    public String getDescription() {
        return "Home Blend";
    }

    @Override
    public float getCost() {
        return 1.5f;
    }
}
