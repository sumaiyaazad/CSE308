package Interface.Implementation;

import Interface.Display;

public class TouchScreen implements Display {
    public TouchScreen() {
        System.out.println("Added TouchScreen");
    }

    @Override
    public void displayInfo() {
        System.out.println("Displaying Info in TouchScreen");
    }
}
