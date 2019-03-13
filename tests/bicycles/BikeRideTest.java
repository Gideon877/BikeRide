package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideTest {

    @Test
    public void shouldReturnCurrentSpeedForRoadBike() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRide = new BikeRideFast(bicycle);
        bikeRide.ride();

        assertEquals(roadBikeSpec.getAccelerationSpeed(), 11);
        assertEquals(roadBikeSpec.getBrakeSpeed(), -4);
        assertEquals(roadBikeSpec.getBicycleType(), BicycleType.RoadBike);

        assertEquals(bikeRide.currentSpeed(), 113);
    }

    @Test
    public void shouldReturnCurrentSpeedForMountainBike() {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(bicycleSpecification);
        BikeRide bikeRide = new BikeRideFast(mountainBike);

        bikeRide.ride();
        assertEquals(bikeRide.currentSpeed(), 49);

        for (int i = 0; i < 10; i++) {
            mountainBike.brake();
        }
        assertEquals(bikeRide.currentSpeed(), 19);


    }

    @Test
    public void shuldReturnCurrentSpeedForTandemBike() {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(12, -7, BicycleType.Tandem);
        Bicycle tandemBike = new BicycleFromSpec(bicycleSpecification);
        BikeRide bikeRide = new BikeRideFast(tandemBike);

        bikeRide.ride();
        assertEquals(bikeRide.currentSpeed(), 118);
    }


    @Test
    public void shouldReturnCurrentSpeedForMountainBikeSpec() {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRide mBikeRide = new BikeRideFast(mountainBike);

        mBikeRide.ride();
        assertEquals(49, mBikeRide.currentSpeed());
    }

    @Test
    public void shouldBeAbleToAccelerateAndBrake() {
        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, -7, BicycleType.Tandem);

        assertEquals(tandemBikeSpec.getAccelerationSpeed(), 12);
        assertEquals(tandemBikeSpec.getBrakeSpeed(), -7);
        assertEquals(tandemBikeSpec.getBicycleType(), BicycleType.Tandem);
    }
}
