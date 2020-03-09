package bicycles.rides;

import bicycles.interfaces.Bicycle;
import bicycles.spec.BicycleFromSpec;
import bicycles.spec.BicycleSpecification;
import static bicycles.BicycleType.*;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {
    @Test
    public void shouldAcceptOnlyLimitedAmountOfBicycles() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(RoadBike);
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(MountainBike);

        Bicycle bicycle1 = new BicycleFromSpec(roadBikeSpec);
        Bicycle bicycle2 = new BicycleFromSpec(mountainBikeSpec);
        Bicycle bicycle3 = new BicycleFromSpec(roadBikeSpec);
        Bicycle bicycle4 = new BicycleFromSpec(roadBikeSpec);
        Bicycle bicycle5 = new BicycleFromSpec(mountainBikeSpec);

        FunRide funRide = new FunRide(4);

        funRide.accept(bicycle1);
        funRide.accept(bicycle2);
        funRide.accept(bicycle3);
        funRide.accept(bicycle4);

        funRide.accept(bicycle5);

        assertEquals(funRide.getEnteredCount(), 4);
    }

    @Test
    public void shouldReturnEnteredBicyclesCount() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(RoadBike);
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(MountainBike);
        BicycleSpecification tandemBikeSpec = new BicycleSpecification(Tandem);

        Bicycle bicycle1 = new BicycleFromSpec(roadBikeSpec);
        Bicycle bicycle2 = new BicycleFromSpec(mountainBikeSpec);
        Bicycle bicycle3 = new BicycleFromSpec(roadBikeSpec);
        Bicycle bicycle4 = new BicycleFromSpec(tandemBikeSpec);

        FunRide funRide = new FunRide(7);

        funRide.accept(bicycle1);
        funRide.accept(bicycle2);
        funRide.accept(bicycle3);
        funRide.accept(bicycle4);

        assertEquals(funRide.getEnteredCount(), 4);
    }

    @Test
    public void shouldReturnBicycleCountByType() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(RoadBike);
        BicycleSpecification tandemBikeSpec = new BicycleSpecification(Tandem);

        Bicycle bicycle1 = new BicycleFromSpec(roadBikeSpec);
        Bicycle bicycle2 = new BicycleFromSpec(tandemBikeSpec);
        Bicycle bicycle3 = new BicycleFromSpec(roadBikeSpec);

        FunRide funRide = new FunRide(5);

        funRide.accept(bicycle1);
        funRide.accept(bicycle2);
        funRide.accept(bicycle3);

        assertEquals(funRide.getCountForType(RoadBike), 2);
    }
}
