package abstractFactory.generic.creator;

import abstractFactory.generic.products.ConcreteProductA;
import abstractFactory.generic.products.IProduct;

public class ConcreteCreatorA extends Creator {

    @Override
    public IProduct createProduct(){
        return new ConcreteProductA();
    }
}
