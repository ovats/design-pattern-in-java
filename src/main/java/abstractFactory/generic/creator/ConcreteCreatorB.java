package abstractFactory.generic.creator;

import abstractFactory.generic.products.ConcreteProductB;
import abstractFactory.generic.products.IProduct;

public class ConcreteCreatorB extends Creator {

    @Override
    public IProduct createProduct() {
        return new ConcreteProductB();
    }
}
