package factoryMethod.generic.variantAbstractMethod;

import factoryMethod.generic.variantAbstractMethod.creator.ConcreteCreatorA;
import factoryMethod.generic.variantAbstractMethod.creator.ConcreteCreatorB;
import factoryMethod.generic.variantAbstractMethod.creator.Creator;
import factoryMethod.generic.variantAbstractMethod.products.IProduct;

public class Client {

    public static void main(String args[]){
        // We're going to decid which product create in the Client class.

        // Actually here we can use "if" or "switch" statements to
        // select which creator we're going to use.

        Creator c = new ConcreteCreatorA();

        IProduct p1 = c.createProduct();
        p1.doStuff();

        c = new ConcreteCreatorB();
        IProduct p2 = c.createProduct();
        p2.doStuff();

    }
}
