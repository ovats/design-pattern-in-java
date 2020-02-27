package builder.examples.mealBuilder.builderDirector;

import builder.examples.mealBuilder.components.*;

/**
 * This is the class acting as builder and director.
 * In this example there are no subclasses (of Builder class).
 */

public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

}
