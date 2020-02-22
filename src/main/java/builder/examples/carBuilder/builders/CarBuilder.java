package builder.examples.carBuilder.builders;

import builder.examples.carBuilder.Car;
import builder.examples.carBuilder.Type;
import builder.examples.carBuilder.components.Engine;
import builder.examples.carBuilder.components.GPSNavigator;
import builder.examples.carBuilder.components.Transmission;


public class CarBuilder implements Builder {

    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private GPSNavigator gpsNavigator;

    public void setType(Type type) {
        this.type = type;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, gpsNavigator);
    }
}
