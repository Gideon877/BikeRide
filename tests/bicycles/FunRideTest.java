package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {
    @Test
    public void shouldReturnEnteredBicyclesCount() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);

        Bicycle bicycle1 = new BicycleFromSpec(roadBikeSpec);
        Bicycle bicycle2 = new BicycleFromSpec(mountainBikeSpec);

        FunRide funRide = new FunRide(10);

        funRide.accept(bicycle1);
        funRide.accept(bicycle2);

        assertEquals(funRide.getEnteredCount(), 2);
    }

    @Test
    public void shouldAcceptOnlyLimitedAmountOfBicycles() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, -7, BicycleType.Tandem);


        Bicycle bicycle1 = new BicycleFromSpec(roadBikeSpec);
        Bicycle bicycle2 = new BicycleFromSpec(mountainBikeSpec);
        Bicycle bicycle3 = new BicycleFromSpec(roadBikeSpec);
        Bicycle bicycle4 = new BicycleFromSpec(tandemBikeSpec);

        FunRide funRide = new FunRide(3);

        funRide.accept(bicycle1);
        funRide.accept(bicycle2);
        funRide.accept(bicycle3);
        funRide.accept(bicycle4);

        assertEquals(funRide.getEnteredCount(), 3);
    }

    @Test
    public void shouldReturnBicycleCountByType() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, -7, BicycleType.Tandem);

        Bicycle bicycle1 = new BicycleFromSpec(roadBikeSpec);
        Bicycle bicycle2 = new BicycleFromSpec(tandemBikeSpec);
        Bicycle bicycle3 = new BicycleFromSpec(roadBikeSpec);

        FunRide funRide = new FunRide(5);

        funRide.accept(bicycle1);
        funRide.accept(bicycle2);
        funRide.accept(bicycle3);

        assertEquals(funRide.getCountForType(BicycleType.RoadBike), 2);
    }
}
