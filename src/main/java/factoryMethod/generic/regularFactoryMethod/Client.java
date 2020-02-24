package factoryMethod.generic.regularFactoryMethod;

import factoryMethod.generic.regularFactoryMethod.creator.Creator;
import factoryMethod.generic.regularFactoryMethod.products.IProduct;
import factoryMethod.generic.regularFactoryMethod.products.ProductType;

public class Client {

    /**
     * There's no switch in the client class in this example.
     * The switch is within the factory method.
     *
     * @param args
     */
    public static void main(String args[]){
        Creator c = new Creator();
        IProduct p1 = c.createProduct(ProductType.TYPE_A);
        IProduct p2 = c.createProduct(ProductType.TYPE_B);
    }
}
