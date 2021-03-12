import Interface.Controller;
import Interface.Storage;

public class PackageGold implements PackageBuilder {
    Package goldPackage;
    Controller button;
    Storage sd;

    AbstractFactory hdfactory;
    AbstractFactory wsfactory;

    public PackageGold(String internetType, String webType) {
//        if(internetType.equalsIgnoreCase("ethernet")){
//            System.out.println("Gold package supports Wifi and GSM internet connection");
//            System.out.println("Gold package creation failed");
//            return;
//        }
        goldPackage = new Package();
        hdfactory = FactoryProducer.getFactory("hardwaredevicefactory");
        wsfactory = FactoryProducer.getFactory("webserverfactory");
        goldPackage.setProcessorController(hdfactory.getProCon("arduinomega"));
        goldPackage.setWeightMeasurement(hdfactory.getWeightMeasurement("weightmodule"));
        goldPackage.setInternetConnection(hdfactory.getInternetConnect(internetType));
        goldPackage.setWebServer(wsfactory.getWebServer(webType));
        goldPackage.setIdentification(hdfactory.getIdentification("rfid"));
        goldPackage.setDisplay(hdfactory.getDisplay("led"));
        button= hdfactory.getController("button");
        sd= hdfactory.getStorage("sd");
    }

    @Override
    public Package getPackage() {
        return goldPackage;
    }

    @Override
    public void measureWeight() {
        goldPackage.getWeightMeasurement().measureWeight();
    }

    @Override
    public void identify() {
        goldPackage.getIdentification().getIdentified();
    }

    @Override
    public void showStore() {
        goldPackage.getDisplay().displayInfo();
        sd.getStoreInfo();
    }
}
