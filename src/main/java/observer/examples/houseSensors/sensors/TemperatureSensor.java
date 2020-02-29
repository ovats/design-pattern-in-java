package observer.examples.houseSensors.sensors;

public class TemperatureSensor extends Sensor {

    public TemperatureSensor(String sensorName) {
        super(sensorName);
    }

    public void temperatureHasIncreased(){
        this.notifyObservers("temperature has been increased");
    }

    public void temperatureHasDecreased(){
        this.notifyObservers("temperature has been decreased");
    }
}
