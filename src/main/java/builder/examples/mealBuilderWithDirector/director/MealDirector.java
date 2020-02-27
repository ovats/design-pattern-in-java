package builder.examples.mealBuilderWithDirector.director;

import builder.examples.mealBuilderWithDirector.components.Meal;
import builder.examples.mealBuilderWithDirector.builder.MealBuilder;

public class MealDirector {

    public Meal createMeal(MealBuilder builder) {
        builder.buildDrink();
        builder.buildMain();
        builder.buildDessert();
        return builder.getMeal();
    }
}
