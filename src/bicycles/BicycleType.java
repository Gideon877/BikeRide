package bicycles;

public enum BicycleType {
    RoadBike(11, -4),
    MountainBike(5, -3),
    Tandem(12, -7);

    private final int acceleration;
    private final int brake;

    BicycleType(int acceleration, int brake) {
        this.acceleration = acceleration;
        this.brake = brake;
    }

    public int getAcceleration() {
        return this.acceleration;
    }

    public int getBrake() {
        return this.brake;
    }
}
