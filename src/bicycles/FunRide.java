package bicycles;

import java.util.ArrayList;
import java.util.List;

public class FunRide {

    private final int maxNumberOfBikes;
    List<Bicycle> bicycles = new ArrayList<>();

    public FunRide(int maxNumberOfBikes) {
        this.maxNumberOfBikes = maxNumberOfBikes;
    }

    public int getCountForType(BicycleType bikeType) {
        int count = 0;
        for(Bicycle bike: bicycles) {
            if(bike.getBicycleType() == bikeType) {
                count += 1;
            }
        }
        return count;
    }

    public void accept(Bicycle bicycle) {
        if(bicycles.size() < maxNumberOfBikes) {
            bicycles.add(bicycle);
        }
    }

    public int getEnteredCount() {
        return bicycles.size();
    }
}
