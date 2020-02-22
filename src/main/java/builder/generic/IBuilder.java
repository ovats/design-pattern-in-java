package builder.generic;

/**
 * The Builder interface declares product construction steps
 * that are common to all types of builders.
 */
public interface IBuilder {
    void reset();
    void buildStepA();
    void buildStepB();
    void buildStepZ();
}
