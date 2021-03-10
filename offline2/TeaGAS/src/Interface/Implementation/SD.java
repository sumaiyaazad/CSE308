package Interface.Implementation;

import Interface.Storage;

public class SD implements Storage {
    public SD() {
        System.out.println("Added SD");
    }

    @Override
    public void getStoreInfo() {
        System.out.println("Storage Info.....");
    }
}
