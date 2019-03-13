package bicycles;

public class BikeRideFast implements BikeRide {


    private final Bicycle bicycle;

    public BikeRideFast(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public void ride() {
        for (int i = 0; i < 10; i++) {
            this.bicycle.accelerate();
        }

        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }

    public int currentSpeed() {
        return this.bicycle.currentSpeed();
    }
}
