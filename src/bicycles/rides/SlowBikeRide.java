package bicycles.rides;

import bicycles.interfaces.Bicycle;
import bicycles.interfaces.BikeRide;

public class SlowBikeRide implements BikeRide {


    private final Bicycle bicycle;

    public SlowBikeRide(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public void ride() {
        for (int i = 0; i < 3; i++) {
            this.bicycle.accelerate();
            if(i >= 2) {
                this.bicycle.brake();
            }
        }
    }

    public int currentSpeed() {
        return this.bicycle.currentSpeed();
    }
}
