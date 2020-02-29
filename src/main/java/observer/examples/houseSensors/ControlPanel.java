package observer.examples.houseSensors;

import observer.examples.houseSensors.observer.IObserver;

public class ControlPanel implements IObserver {

    public void update(String event) {
        System.out.println("Some sensor has trigger the update method, event: " + event);
    }
}
