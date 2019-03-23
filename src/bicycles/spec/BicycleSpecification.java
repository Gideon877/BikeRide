package bicycles.spec;

import bicycles.BicycleType;

public class BicycleSpecification {

    private final BicycleType bicycleType;
    private int accelerationSpeed;
    private int brakeSpeed;


    public BicycleSpecification(BicycleType bicycleType) {
        this.accelerationSpeed = bicycleType.getAcceleration();
        this.brakeSpeed = bicycleType.getBrake();
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