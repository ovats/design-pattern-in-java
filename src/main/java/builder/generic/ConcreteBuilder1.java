package builder.generic;

/**
 * Concrete builders provide different implementations of the
 * construction steps.
 * Concrete builders may produce products that don't follow
 * the common interface.
 */

public class ConcreteBuilder1 implements IBuilder {

    private Product1 result;

    public void reset() {
        result = new Product1();
    }

    public void buildStepA() {
        // TODO: step A for concrete builder 1
    }

    public void buildStepB() {
        // TODO: step B for concrete builder 1
    }

    public void buildStepZ() {
        // TODO: step Z for concrete builder 1
    }

    public Product1 getResult(){
        return result;
    }

}
