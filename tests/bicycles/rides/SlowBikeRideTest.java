package bicycles.rides;

import bicycles.*;
import bicycles.interfaces.Bicycle;
import bicycles.interfaces.BikeRide;
import bicycles.spec.BicycleFromSpec;
import bicycles.spec.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SlowBikeRideTest {

   @Test
   public void shouldReturnCurrentSpeedForRoadBike() {
       BicycleSpecification roadBikeSpec = new BicycleSpecification(BicycleType.RoadBike);
       Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
       BikeRide bikeRide = new SlowBikeRide(bicycle);
       bikeRide.ride();

       assertEquals(roadBikeSpec.getAccelerationSpeed(), 11);
       assertEquals(roadBikeSpec.getBrakeSpeed(), -4);
       assertEquals(roadBikeSpec.getBicycleType(), BicycleType.RoadBike);

       assertEquals(bikeRide.currentSpeed(), 29);
   }

   @Test
   public void shouldReturnCurrentSpeedForMountainBike() {
       BicycleSpecification bicycleSpecification = new BicycleSpecification(BicycleType.MountainBike);
       Bicycle mountainBike = new BicycleFromSpec(bicycleSpecification);
       BikeRide bikeRide = new SlowBikeRide(mountainBike);

       bikeRide.ride();
       assertEquals(bikeRide.currentSpeed(), 12);



   }

   @Test
   public void shuldReturnCurrentSpeedForTandemBike() {
       BicycleSpecification bicycleSpecification = new BicycleSpecification(BicycleType.Tandem);
       Bicycle tandemBike = new BicycleFromSpec(bicycleSpecification);
       BikeRide bikeRide = new SlowBikeRide(tandemBike);

       bikeRide.ride();

       assertEquals(bikeRide.currentSpeed(), 29);
   }

   @Test
   public void shouldBeAbleToAccelerateAndBrake() {
       BicycleSpecification tandemBikeSpec = new BicycleSpecification(BicycleType.Tandem);

       assertEquals(tandemBikeSpec.getAccelerationSpeed(), 12);
       assertEquals(tandemBikeSpec.getBrakeSpeed(), -7);
       assertEquals(tandemBikeSpec.getBicycleType(), BicycleType.Tandem);
   }
}
