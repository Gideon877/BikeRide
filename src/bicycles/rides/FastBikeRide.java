package bicycles.rides;

import bicycles.interfaces.Bicycle;
import bicycles.interfaces.BikeRide;

public class FastBikeRide implements BikeRide {


    private final Bicycle bicycle;

    public FastBikeRide(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public void ride() {
        for (int i = 0; i < 10; i++) {
            this.bicycle.accelerate();
            if(i >= 8) {
                this.bicycle.brake();
            }
            if(i == 5) {
                this.bicycle.accelerate();
            }
        }
    }

    public int currentSpeed() {
        return this.bicycle.currentSpeed();
    }
}
