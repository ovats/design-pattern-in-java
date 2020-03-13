package decorator.generic;

public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component c) {
        super(c);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("ConcreteDecoratorA.operation()");
    }
}
