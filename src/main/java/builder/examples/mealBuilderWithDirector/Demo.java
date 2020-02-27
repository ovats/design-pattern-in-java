package builder.examples.mealBuilderWithDirector;

import builder.examples.mealBuilderWithDirector.components.Meal;
import builder.examples.mealBuilderWithDirector.director.MealDirector;
import builder.examples.mealBuilderWithDirector.builder.*;

public class Demo {

    public static void main(String[] args) {

        Boolean isKid = true;

        MealDirector director = new MealDirector();
        MealBuilder builder = null;
        if (isKid) {
            builder = new KidsMealBuilder();
        }
        else{
            builder = new AdultMealBuilder();
        }
        Meal meal = director.createMeal(builder);
    }
}
