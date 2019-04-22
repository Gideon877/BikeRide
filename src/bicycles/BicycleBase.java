package bicycles;

import bicycles.interfaces.Bicycle;

public abstract class BicycleBase implements Bicycle {

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
        if(speed < 0) {
            speed = 0;
        }
    }

    public String getColor() {
        return getColor();
    }

    public BicycleType bicycleType(BicycleType bicycleType) {
        return bicycleType;
    }

}
