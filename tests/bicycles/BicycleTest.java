package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {

    @Test
    public void shouldAccellerate() {

        BicycleSpecification tandemBike = new BicycleSpecification(12, -7, BicycleType.Tandem);
        BicycleSpecification roadBike = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        BicycleSpecification mountainBike = new BicycleSpecification(5, -3, BicycleType.MountainBike);

        assertEquals(tandemBike.getAccelerationSpeed(),12);
        assertEquals(mountainBike.getAccelerationSpeed(),5);
        assertEquals(roadBike.getAccelerationSpeed(),11);
    }

    @Test
    public void shouldBrake() {
        BicycleSpecification tandemBike = new BicycleSpecification(12, -7, BicycleType.Tandem);
        BicycleSpecification roadBike = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        BicycleSpecification mountainBike = new BicycleSpecification(5, -3, BicycleType.MountainBike);

        assertEquals(roadBike.getBrakeSpeed(),-4);
        assertEquals(mountainBike.getBrakeSpeed(),-3);
        assertEquals(tandemBike.getBrakeSpeed(),-7);
    }
}
