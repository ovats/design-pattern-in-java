package factoryMethod.generic.variantAbstractMethod.creator;

import factoryMethod.generic.variantAbstractMethod.products.IProduct;

/**
 * The method createProduct is the factory method of the pattern.
 * Each subclass should implement (override) it.
 */

public abstract class Creator {

    public void someOperation(){
        IProduct p = createProduct();
        p.doStuff();
        // ...
    }

    public abstract IProduct createProduct();

}
