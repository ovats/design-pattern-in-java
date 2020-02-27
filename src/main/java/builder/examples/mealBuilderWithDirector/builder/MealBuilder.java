package builder.examples.mealBuilderWithDirector.builder;

import builder.examples.mealBuilderWithDirector.components.Meal;

public abstract class MealBuilder {

    private Meal meal;

    public final void setMeal(Meal meal) {
        this.meal = meal;
    }

    public final Meal getMeal(){
        return this.meal;
    }

    public abstract void buildDrink();
    public abstract void buildMain();
    public abstract void buildDessert();
}
