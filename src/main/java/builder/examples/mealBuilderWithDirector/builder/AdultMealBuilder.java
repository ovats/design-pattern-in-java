package builder.examples.mealBuilderWithDirector.builder;

public class AdultMealBuilder extends MealBuilder {

    public void buildDrink(){
        // add drinks to the meal
        System.out.println("Adding drink for adults.");
    }

    public void buildMain(){
        // add main part of the meal
        System.out.println("Adding main food for adults.");
    }

    public void buildDessert(){
        // add dessert part to the meal
        System.out.println("Adding dessert for adults.");
    }

}
