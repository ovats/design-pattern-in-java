package observer.generic.observerSubject.observer;

public class ConcreteObserver implements IObserver {

    public void update() {
        System.out.println("Class ConcreteObserver has been notified of updates: " + this);
    }
}
