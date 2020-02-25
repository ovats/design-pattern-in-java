package abstractFactory.generic;

import abstractFactory.generic.creator.ConcreteCreatorA;
import abstractFactory.generic.creator.ConcreteCreatorB;
import abstractFactory.generic.creator.Creator;
import abstractFactory.generic.products.IProduct;

public class Client {

    public static void main(String args[]){
        // We're going to decid which product create in the Client class.

        // Actually here we can use "if" or "switch" statements to
        // select which creator we're going to use.

        Creator c = new ConcreteCreatorA();

        c.someOperation();
        c.someOtherOperation();
        // the first operation is someOperation
        // this method actually calls the abstract method to create products

    }
}
