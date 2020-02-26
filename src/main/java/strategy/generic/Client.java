package strategy.generic;

import strategy.generic.strategies.IStrategy;
import strategy.generic.strategies.StrategyOne;
import strategy.generic.strategies.StrategyTwo;

public class Client {

    private Context c;
    private IStrategy strategyOne;
    private IStrategy strategyTwo;

    public Client () {
        c = new Context();
    }

    public void testStrategis() {

        // Execute the algorithm with the first strategy
        IStrategy strategyOne = new StrategyOne();
        c.setStrategy(strategyOne);
        c.executeStrategy();

        // Execute the algorithm with the second strategy
        IStrategy strategyTwo = new StrategyTwo();
        c.setStrategy(strategyTwo);
        c.executeStrategy();
    }

}
