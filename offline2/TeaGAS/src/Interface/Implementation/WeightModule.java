package Interface.Implementation;

import Interface.WeightMeasurement;

public class WeightModule implements WeightMeasurement {
    public WeightModule() {
        System.out.println("Added WeightModule");
    }

    @Override
    public void measureWeight() {
        System.out.println("Measuring weight with WeightModule");
    }
}
