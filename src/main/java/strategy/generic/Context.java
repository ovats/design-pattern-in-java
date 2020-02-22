package strategy.generic;

/**
 * Maintains a reference to one of the concrete strategies and
 * communicates with this object only via the strategy interface.
 */

public class Context {

    private IStrategy strategy;

    public Context(){
    }

    public void setStrategy (IStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        this.strategy.execute();
    }

}
