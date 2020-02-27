package builder.generic.builders;

import builder.generic.products.Product2;

/**
 * Concrete builders provide different implementations of the
 * construction steps.
 * Concrete builders may produce products that don't follow
 * the common interface.
 */

public class ConcreteBuilder2 implements IBuilder {

    private Product2 product;

    public void reset() {
        System.out.println("Concrete builder 2: reset");
        product = new Product2();
    }

    public void buildStepA() {
        System.out.println("Concrete builder 2: step A");
    }

    public void buildStepB() {
        System.out.println("Concrete builder 2: step B");
    }

    public void buildStepZ() {
        System.out.println("Concrete builder 2: step Z");
    }

    public Product2 getProduct(){
        return product;
    }

}
