package Interface.Implementation;

import Interface.WeightMeasurement;

public class LoadSensor implements WeightMeasurement {
    public LoadSensor() {
        System.out.println("Added LoadSensor");
    }

    @Override
    public void measureWeight() {
        System.out.println("Measuring weight with LoadSensor");
    }
}
