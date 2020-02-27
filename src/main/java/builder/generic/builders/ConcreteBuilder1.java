package builder.generic.builders;

import builder.generic.products.Product1;

/**
 * Concrete builders provide different implementations of the
 * construction steps.
 * Concrete builders may produce products that don't follow
 * the common interface.
 */

public class ConcreteBuilder1 implements IBuilder {

    private Product1 product;

    public void reset() {
        System.out.println("Concrete builder 1: reset");
        product = new Product1();
    }

    public void buildStepA() {
        System.out.println("Concrete builder 1: step A");
    }

    public void buildStepB() {
        System.out.println("Concrete builder 1: step B");
    }

    public void buildStepZ() {
        System.out.println("Concrete builder 1: step Z");
    }

    public Product1 getProduct(){
        return product;
    }

}
