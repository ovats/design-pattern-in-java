package factoryMethod.examples.pizzaRestaurant.pizzas.create;

import factoryMethod.examples.pizzaRestaurant.pizzas.Pizza;
import factoryMethod.examples.pizzaRestaurant.pizzas.products.FourCheesePizza;
import factoryMethod.examples.pizzaRestaurant.pizzas.products.PepperoniPizza;
import factoryMethod.examples.pizzaRestaurant.pizzas.products.PizzaType;
import factoryMethod.examples.pizzaRestaurant.pizzas.products.SpinachTomatoPizza;

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
