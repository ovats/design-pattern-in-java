package factoryMethod.generic.regularFactoryMethod.creator;

import factoryMethod.generic.regularFactoryMethod.products.ConcreteProductA;
import factoryMethod.generic.regularFactoryMethod.products.ConcreteProductB;
import factoryMethod.generic.regularFactoryMethod.products.IProduct;
import factoryMethod.generic.regularFactoryMethod.products.ProductType;

public class Creator {

    public IProduct createProduct(ProductType type){
        IProduct product = null;
        switch (type) {
            case TYPE_A:
                product = new ConcreteProductA();
                break;
            case TYPE_B:
                product = new ConcreteProductB();
                break;
        }
        return product;
    }
}
