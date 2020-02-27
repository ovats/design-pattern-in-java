package builder.generic;

import builder.generic.builders.ConcreteBuilder1;
import builder.generic.products.Product1;

public class Demo {

    public static void main(String args[]){
        Director director = new Director();
        ConcreteBuilder1 builder = new ConcreteBuilder1();

        director.makeA(builder);
        Product1 p = builder.getProduct();
    }
}
