package bicycles;

class BicycleSpecification {

    private final BicycleType bicycleType;
    private int accelerationSpeed;
    private int brakeSpeed;

    public BicycleSpecification(int accelerationSpeed, int brakeSpeed, BicycleType bicycleType) {
        this.accelerationSpeed = accelerationSpeed;
        this.brakeSpeed = brakeSpeed;
        this.bicycleType = bicycleType;
    }

    public int getBrakeSpeed() {
        return brakeSpeed;
    }

    public int getAccelerationSpeed() {
        return accelerationSpeed;
    }

    public BicycleType getBicycleType(){
        return bicycleType;
    }

}