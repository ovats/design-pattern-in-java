package factoryMethod.generic.variantAbstractMethod.creator;

import factoryMethod.generic.variantAbstractMethod.products.ConcreteProductA;
import factoryMethod.generic.variantAbstractMethod.products.IProduct;

public class ConcreteCreatorA extends Creator {

    @Override
    public IProduct createProduct(){
        return new ConcreteProductA();
    }
}
