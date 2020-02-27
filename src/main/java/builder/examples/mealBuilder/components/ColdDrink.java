package builder.examples.mealBuilder.components;

public abstract class ColdDrink extends Item {

    public ColdDrink() {
        this.setPacking(new Bottle());
    }
}
