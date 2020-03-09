package bicycles;

import bicycles.interfaces.Bicycle;
import bicycles.spec.BicycleFromSpec;
import bicycles.spec.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {

    @Test
    public void shouldBeAbleToAccelerate() {

        BicycleSpecification roadBike = new BicycleSpecification(BicycleType.RoadBike);
        Bicycle rBicycle = new BicycleFromSpec(roadBike);
        rBicycle.accelerate();

        assertEquals(rBicycle.currentSpeed(),11);
    }

    @Test
    public void shouldBeAbleToStop() {
        BicycleSpecification mountainBike = new BicycleSpecification(BicycleType.MountainBike);
        Bicycle mBicycle = new BicycleFromSpec(mountainBike);

        mBicycle.accelerate();
        assertEquals(mBicycle.currentSpeed(),5);
        mBicycle.stop();
        assertEquals(mBicycle.currentSpeed(),0);
    }


    @Test
    public void shouldBeAbleToBrake() {
        BicycleSpecification tandemBike = new BicycleSpecification(BicycleType.Tandem);
        Bicycle tBicycle = new BicycleFromSpec(tandemBike);
        tBicycle.accelerate();
        assertEquals(12, tBicycle.currentSpeed());
        tBicycle.brake();
        assertEquals(5, tBicycle.currentSpeed());
    }
}
