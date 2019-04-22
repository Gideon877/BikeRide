package bicycles.spec;

import bicycles.BicycleBase;
import bicycles.BicycleType;

public class BicycleFromSpec extends BicycleBase {
    private BicycleSpecification bicycleSpecification;

    public BicycleFromSpec(BicycleSpecification bicycleSpecification) {
        this.bicycleSpecification = bicycleSpecification;
    }

    @Override
    public void accelerate() {
        this.changeSpeed(this.bicycleSpecification.getAccelerationSpeed());
    }

    @Override
    public void brake() {
        this.changeSpeed(this.bicycleSpecification.getBrakeSpeed());
    }

    @Override
    public BicycleType getBicycleType() {
        return this.bicycleType(this.bicycleSpecification.getBicycleType());
    }

    public String getColor() {
        return this.bicycleSpecification.getColor();
    }
}
