package factoryMethod.examples.pizzaRestaurant.pizzas;

/**
 * This class could be also an interface instead of an abstract class.
 * In a abstract class, all the common methods doesn't have to be implemented on each subtype.
 */
public abstract class Pizza {

    private Double price;

    public void makeDough() {

    }

    public void rollDough() {

    }

    public void bake(){

    }

    public void addSauce() {

    }

    public void addTopings() {

    }

    public void cutInSlices() {

    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }
}
