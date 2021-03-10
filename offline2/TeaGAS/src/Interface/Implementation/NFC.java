package Interface.Implementation;

import Interface.Identification;

public class NFC implements Identification {
    public NFC() {
        System.out.println("Added NFC");
    }

    @Override
    public void getIdentified() {
        System.out.println("Identifying with NFC");
    }
}
