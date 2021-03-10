package Interface.Implementation;

import Interface.Display;

public class LCD implements Display {
    public LCD() {
        System.out.println("Added LCD");
    }

    @Override
    public void displayInfo() {
        System.out.println("Displaying Info in LCD");
    }
}
