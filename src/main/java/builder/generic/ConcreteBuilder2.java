package builder.generic;

/**
 * Concrete builders provide different implementations of the
 * construction steps.
 * Concrete builders may produce products that don't follow
 * the common interface.
 */

public class ConcreteBuilder2 implements IBuilder {

    private Product2 result;

    public void reset() {
        result = new Product2();
    }

    public void buildStepA() {
        // TODO: step A for concrete builder 2
    }

    public void buildStepB() {
        // TODO: step B for concrete builder 2
    }

    public void buildStepZ() {
        // TODO: step Z for concrete builder 2
    }

    public Product2 getResult(){
        return result;
    }

}
