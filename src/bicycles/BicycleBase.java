package bicycles;

public abstract class BicycleBase implements  Bicycle {

    protected int speed;

    @Override
    public int currentSpeed() {
        return speed;
    }

    @Override
    public void stop() {
        speed = 0;
    }

    protected void changeSpeed(int speedChange) {
        speed += speedChange;
    }

    public BicycleType bicycleType(BicycleType bicycleType) {
        return bicycleType;
    }

}
