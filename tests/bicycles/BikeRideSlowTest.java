package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeRideSlowTest {

    @Test
    public void shouldReturnCurrentSpeedForRoadBike() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRide = new BikeRideSlow(bicycle);
        bikeRide.ride();


        assertEquals(bikeRide.currentSpeed(), 47);
    }

    @Test
    public void shouldReturnCurrentSpeedForMountainBike() {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(mountainBikeSpec);
        BikeRide bikeRide = new BikeRideSlow(bicycle);
        bikeRide.ride();


        assertEquals(bikeRide.currentSpeed(), 19);
    }

    @Test
    public void shouldReturnCurrentSpeedForTandemBike() {
        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, -7, BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(tandemBikeSpec);
        BikeRide bikeRide = new BikeRideSlow(bicycle);
        bikeRide.ride();


        assertEquals(bikeRide.currentSpeed(), 46);
    }

}