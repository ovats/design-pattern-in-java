package abstractFactory.generic.creator;

import abstractFactory.generic.products.IProduct;

/**
 * Each subclass must implement (override) createProduct abstract method.
 */

public abstract class Creator {

    private IProduct p;

    public void someOperation(){
        p = createProduct();
        p.doStuff();
        // ...
    }

    public void someOtherOperation(){
        // Do something else on the product
    }

    // This method must be implemented in the subclasses
    // Each sublcass know how to create this product
    public abstract IProduct createProduct();

}
