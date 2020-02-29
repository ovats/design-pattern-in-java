package observer.examples.houseSensors.sensors;

import observer.examples.houseSensors.sensors.Sensor;

public class DoorSensor extends Sensor {

    public DoorSensor (String sensorName) {
        super(sensorName);
    }

    public void doorOpened(){
        this.notifyObservers("door opened");
    }

    public void doorClosed(){
        this.notifyObservers("door closed");
    }
}
