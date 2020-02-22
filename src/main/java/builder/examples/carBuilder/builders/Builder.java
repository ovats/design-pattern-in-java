package builder.examples.carBuilder.builders;

import builder.examples.carBuilder.Type;
import builder.examples.carBuilder.components.Engine;
import builder.examples.carBuilder.components.GPSNavigator;
import builder.examples.carBuilder.components.Transmission;

public interface Builder {
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
