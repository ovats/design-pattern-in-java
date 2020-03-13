package decorator.generic;

public abstract class Decorator extends Component{

    private Component component;

    public Decorator(Component c) {
        this.component = c;
    }

    @Override
    public void operation() {
//        System.out.println("Decorator.operation()");
        component.operation();
    }
}
