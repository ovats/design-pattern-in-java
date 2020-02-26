package abstractFactory.generic;

import abstractFactory.generic.creator.ConcreteCreatorA;
import abstractFactory.generic.creator.ConcreteCreatorB;
import abstractFactory.generic.creator.Creator;
import abstractFactory.generic.products.IProduct;

public class Client {

    public static void main(String args[]){

        Creator c = new ConcreteCreatorA();

        c.someOperation();
        c.someOtherOperation();
        // the first operation is method someOperation which is implemented
        // in the Creator abstract class.
        // This method actually calls the abstract method to create products
        // which needs to be implemented/overridden in the concrete creator classes.
        // This method then can instantiate any sublclass of package products.

    }
}
