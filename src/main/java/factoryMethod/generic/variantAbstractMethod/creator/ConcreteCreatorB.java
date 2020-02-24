package factoryMethod.generic.variantAbstractMethod.creator;

import factoryMethod.generic.variantAbstractMethod.products.ConcreteProductB;
import factoryMethod.generic.variantAbstractMethod.products.IProduct;

public class ConcreteCreatorB extends Creator {

    @Override
    public IProduct createProduct() {
        return new ConcreteProductB();
    }
}
