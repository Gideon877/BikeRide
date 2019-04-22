package bicycles.spec;

import bicycles.BicycleType;
import bicycles.interfaces.Bicycle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BicycleSpecificationTest {

  @Test
  public void shouldGetBrakeSpeed() {
      BicycleSpecification roadBike = new BicycleSpecification(BicycleType.RoadBike);
      BicycleSpecification mountainBike = new BicycleSpecification(BicycleType.MountainBike);
      BicycleSpecification tandemBike = new BicycleSpecification(BicycleType.Tandem);

      assertEquals(roadBike.getBrakeSpeed(), -4);
      assertEquals(tandemBike.getBrakeSpeed(), -7);
      assertEquals(mountainBike.getBrakeSpeed(), -3);

  }

  @Test
  void shouldGetAccelerationSpeed() {
      BicycleSpecification roadBike = new BicycleSpecification(BicycleType.RoadBike);
      BicycleSpecification mountainBike = new BicycleSpecification(BicycleType.MountainBike);
      BicycleSpecification tandemBike = new BicycleSpecification(BicycleType.Tandem);

      assertEquals(5, mountainBike.getAccelerationSpeed());
      assertEquals(12, tandemBike.getAccelerationSpeed());
      assertEquals(11, roadBike.getAccelerationSpeed());

  }

  @Test
  void shouldGetBicycleType() {
      BicycleSpecification roadBike = new BicycleSpecification(BicycleType.RoadBike);
      BicycleSpecification mountainBike = new BicycleSpecification(BicycleType.MountainBike);
      BicycleSpecification tandemBike = new BicycleSpecification(BicycleType.Tandem);

      assertEquals(BicycleType.MountainBike, mountainBike.getBicycleType());
      assertEquals(BicycleType.Tandem, tandemBike.getBicycleType());
      assertEquals(BicycleType.RoadBike, roadBike.getBicycleType());

  }

  @Test
  void shouldGetColor() {
      BicycleSpecification roadBike = new BicycleSpecification(BicycleType.RoadBike);
      BicycleSpecification mountainBike = new BicycleSpecification(BicycleType.MountainBike);
      BicycleSpecification tandemBike = new BicycleSpecification(BicycleType.Tandem);

      assertEquals("Blue", mountainBike.getColor());
      assertEquals("Yellow", tandemBike.getColor());
      assertEquals("Red", roadBike.getColor());
  }
}