package strategy.examples.computeNumbers;

import strategy.examples.computeNumbers.strategies.CalculationMultiply;
import strategy.examples.computeNumbers.strategies.CalculationSum;
import strategy.examples.computeNumbers.strategies.ICalculation;

public class Demo {

    public static void main (String args[]) {
        System.out.println("Test strategy.examples.numbers:");
        Mathematics m = new Mathematics();

        Long n1 = 100L;
        Long n2 = 20L;
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        ICalculation strategySum = new CalculationSum();
        m.setCalculusStrategy(strategySum);
        System.out.print("Strategy one (sum): ");
        System.out.println(m.makeCalculation(n1,n2));

        ICalculation strategyMultiply = new CalculationMultiply();
        m.setCalculusStrategy(strategyMultiply);
        System.out.print("Strategy two (multiply): ");
        System.out.println(m.makeCalculation(n1,n2));
    }
}
