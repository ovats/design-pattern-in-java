package builder.examples.mealBuilder.components;

public abstract class Item {

    private String name;
    private IPacking packing;
    private float price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IPacking getPacking() {
        return packing;
    }

    public void setPacking(IPacking packing) {
        this.packing = packing;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
