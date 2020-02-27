package builder.generic;

import builder.generic.builders.IBuilder;

/**
 * Methods "make" builds different products, also each concrete builder makes different representation of
 * the same object.
 */

public class Director {

    public void makeA(IBuilder builder){
        System.out.println("Director, making product A");
        builder.reset();
        builder.buildStepA();
        builder.buildStepZ();
    }

    public void makeB(IBuilder builder){
        System.out.println("Director, making product B");
        builder.reset();
        builder.buildStepB();
        builder.buildStepZ();
    }
}
