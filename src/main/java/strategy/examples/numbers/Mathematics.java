package strategy.examples.numbers;

public class Mathematics {

    // Strategy pattern
    private ICalculation calculusStrategy;

    public void setCalculusStrategy(ICalculation calculusStrategy) {
        this.calculusStrategy = calculusStrategy;
    }

    public Long makeCalculation (Long x, Long y) {
        return this.calculusStrategy.calculus(x,y);
    }
}
