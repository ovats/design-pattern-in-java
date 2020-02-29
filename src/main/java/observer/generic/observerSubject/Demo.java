package observer.generic.observerSubject;

import observer.generic.observerSubject.observer.ConcreteObserver;
import observer.generic.observerSubject.observer.ConcreteSubject;
import observer.generic.observerSubject.observer.IObserver;

public class Demo {

    public static void main (String args[]){

        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer1 = new ConcreteObserver();
        IObserver observer2 = new ConcreteObserver();

        subject.attach(observer1);
        subject.attach(observer2);

        subject.someBusinessLogic();
        subject.someOtherBusinessLogic();

        subject.detach(observer2);

        subject.someBusinessLogic();
        subject.someOtherBusinessLogic();
    }
}
