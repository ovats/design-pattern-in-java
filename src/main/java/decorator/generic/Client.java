package decorator.generic;

public class Client {

    public static void main(String[] args) {

        Component c = new ConcreteComponentA();
        c = new ConcreteDecoratorA(c);
        c = new ConcreteDecoratorB(c);

        c.operation();

    }
}
