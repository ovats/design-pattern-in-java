package decorator.examples.coffeeShop.beverages;

public class DarkRoast extends Beverage {

    @Override
    public String getDescription() {
        return "Dark Roast";
    }

    @Override
    public float getCost() {
        return 1.6f;
    }
}
