package observer.generic.observerSubject.observer;

import observer.generic.observerSubject.observer.Subject;

public class ConcreteSubject extends Subject {

    public void someBusinessLogic() {
        System.out.println("Method someBusinessLogic in ConcreteSubject");
        this.notifyObservers();
    }

    public void someOtherBusinessLogic() {
        System.out.println("Method someOtherBusinessLogic in ConcreteSubject");
        this.notifyObservers();
    }

}
