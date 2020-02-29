package observer.examples.houseSensors;

import observer.examples.houseSensors.observer.IObserver;
import observer.examples.houseSensors.sensors.DoorSensor;
import observer.examples.houseSensors.sensors.TemperatureSensor;

public class Demo {

    public static void main (String args[]){

        IObserver controlPanel = new ControlPanel();
        DoorSensor doorSensor = new DoorSensor("door sensor");
        TemperatureSensor tempSensor = new TemperatureSensor("temperature sensor");
        doorSensor.attach(controlPanel);
        tempSensor.attach(controlPanel);

        doorSensor.doorOpened();
        tempSensor.temperatureHasDecreased();
        doorSensor.doorClosed();
        tempSensor.temperatureHasIncreased();

    }
}
