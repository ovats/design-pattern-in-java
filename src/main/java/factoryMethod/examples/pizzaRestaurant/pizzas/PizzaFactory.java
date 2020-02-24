package factoryMethod.examples.pizzaRestaurant.pizzas;

public class PizzaFactory {

    public Pizza createPizza(PizzaType type) {
        Pizza pizza = null;
        switch (type){
            case PEPPERONI:
                pizza = new PepperoniPizza();
                break;
            case SPINACH_TOMATO:
                pizza = new SpinachTomatoPizza();
                break;
            case FOUR_CHEESE:
                pizza = new FourCheesePizza();
                break;
        }
        return pizza;
    }
}
