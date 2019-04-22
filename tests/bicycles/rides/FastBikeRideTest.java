package bicycles.rides;

import bicycles.*;
import bicycles.interfaces.Bicycle;
import bicycles.interfaces.BikeRide;
import bicycles.spec.BicycleFromSpec;
import bicycles.spec.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FastBikeRideTest {

    @Test
    public void shouldReturnCurrentSpeedForRoadBike() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRide = new FastBikeRide(bicycle);
        bikeRide.ride();

        assertEquals(roadBikeSpec.getAccelerationSpeed(), 11);
        assertEquals(roadBikeSpec.getBrakeSpeed(), -4);
        assertEquals(roadBikeSpec.getBicycleType(), BicycleType.RoadBike);

        assertEquals(bikeRide.currentSpeed(), 90);
    }

    @Test
    public void shouldReturnCurrentSpeedForMountainBike() {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(bicycleSpecification);
        BikeRide bikeRide = new FastBikeRide(mountainBike);

        bikeRide.ride();
        assertEquals(bikeRide.currentSpeed(), 35);
    }

    @Test
    public void shuldReturnCurrentSpeedForTandemBike() {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(BicycleType.Tandem);
        Bicycle tandemBike = new BicycleFromSpec(bicycleSpecification);
        BikeRide bikeRide = new FastBikeRide(tandemBike);

        bikeRide.ride();
        assertEquals(bikeRide.currentSpeed(), 85);
    }


    @Test
    public void shouldBeAbleToAccelerateAndBrake() {
        BicycleSpecification tandemBikeSpec = new BicycleSpecification( BicycleType.Tandem);

        assertEquals(tandemBikeSpec.getAccelerationSpeed(), 12);
        assertEquals(tandemBikeSpec.getBrakeSpeed(), -7);
        assertEquals(tandemBikeSpec.getBicycleType(), BicycleType.Tandem);
    }
}
