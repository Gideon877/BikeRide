package bicycles.interfaces;

import bicycles.BicycleType;

public interface Bicycle {
    void accelerate();
    void brake();
    int currentSpeed();
    void stop();
    BicycleType getBicycleType();
    String getColor();
}
