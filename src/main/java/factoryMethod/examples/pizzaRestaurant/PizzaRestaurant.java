package factoryMethod.examples.pizzaRestaurant;

import factoryMethod.examples.pizzaRestaurant.pizzas.Pizza;
import factoryMethod.examples.pizzaRestaurant.pizzas.create.PizzaFactory;
import factoryMethod.examples.pizzaRestaurant.pizzas.products.PizzaType;

public class PizzaRestaurant {

    public static void main(String args[]){
        PizzaFactory pf = new PizzaFactory();
        Pizza pizzaPepperoni = pf.createPizza(PizzaType.PEPPERONI);
    }
}
