package builder.examples.mealBuilder.components;

public abstract class Burger extends Item {

    public Burger() {
        this.setPacking(new Wrapper());
    }
}
