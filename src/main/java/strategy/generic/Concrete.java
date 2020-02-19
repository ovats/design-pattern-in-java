package strategy.generic;

/**
 * Concrete class which only receives the strategy to execute through the setter method.
 */

public class Concrete {

    private IStrategy strategy;

    public Concrete(){
    }

    public void setStrategy (IStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        this.strategy.execute();
    }

}
