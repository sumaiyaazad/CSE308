package Interface.Implementation;

import Interface.Identification;

public class RFID implements Identification {
    public RFID() {
        System.out.println("Added RFID");
    }

    @Override
    public void getIdentified() {
        System.out.println("Identifying with RFID");
    }
}
