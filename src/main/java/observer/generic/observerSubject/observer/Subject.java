package observer.generic.observerSubject.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private List<IObserver> observers = new ArrayList<IObserver>();

    public void attach (IObserver observer) {
        System.out.println("Adding observer "+observer);
        observers.add(observer);
    }

    public void detach (IObserver observer) {
        System.out.println("Removing observer "+observer);
        observers.remove(observer);
    }

    public void notifyObservers() {
        System.out.println("About to notify all observers");
        for(IObserver observer: observers){
            observer.update();
        }
    }

}
