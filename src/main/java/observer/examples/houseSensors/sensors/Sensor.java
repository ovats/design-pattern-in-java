package observer.examples.houseSensors.sensors;

import observer.examples.houseSensors.observer.Subject;

public abstract class Sensor extends Subject {

    private String sensorName = "";

    public Sensor(String sensorName) {
        setSensorName(sensorName);
    }

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }


}
