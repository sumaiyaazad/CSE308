package Interface.Implementation;

import Interface.Display;

public class LED implements Display {
    public LED() {
        System.out.println("Added LED");
    }

    @Override
    public void displayInfo() {
        System.out.println("Displaying Info in LED");
    }
}
