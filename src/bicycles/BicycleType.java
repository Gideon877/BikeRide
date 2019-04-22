package bicycles;

public enum BicycleType {
    RoadBike(11, -4, "Red"),
    MountainBike(5, -3, "Blue"),
    Tandem(12, -7, "Yellow");

    private final int acceleration;
    private final int brake;
    private final String color;

    BicycleType(int acceleration, int brake, String color) {
        this.acceleration = acceleration;
        this.brake = brake;
        this.color = color;
    }

    public int getAcceleration() {
        return this.acceleration;
    }

    public int getBrake() {
        return this.brake;
    }

    public String getColor() {
        return this.color;
    }
}
