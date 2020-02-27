package builder.examples.mealBuilderWithDirector.builder;

public class KidsMealBuilder extends MealBuilder {

    public void buildDrink() {
        // add drinks to the meal
        System.out.println("Adding drink for kids.");
    }

    public void buildMain() {
        // add main part of the meal
        System.out.println("Adding main food for kids.");
    }

    public void buildDessert() {
        // add dessert part to the meal
        System.out.println("Adding dessert for kids.");
    }

}
