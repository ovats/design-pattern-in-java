package decorator.generic;

public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component c) {
        super(c);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("ConcreteDecoratorB.operation()");
    }
}
