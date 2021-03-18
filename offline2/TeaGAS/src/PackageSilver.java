import Interface.Controller;
import Interface.Implementation.Button;
import Interface.Storage;

public class PackageSilver implements PackageBuilder {
    private Package silverPackage;
    private Controller button;
    private Storage sd;

    private AbstractFactory hdfactory;
    private AbstractFactory wsfactory;

    public PackageSilver(String internetType, String webType) {
//        if(internetType.equalsIgnoreCase("ethernet")){
//            System.out.println("Silver package supports Wifi and GSM internet connection");
//            System.out.println("Silver package creation failed");
//            return;
//        }
        silverPackage = new Package();
        hdfactory = FactoryProducer.getFactory("hardwaredevicefactory");
        wsfactory = FactoryProducer.getFactory("webserverfactory");
        silverPackage.setProcessorController(hdfactory.getProCon("atmega32"));
        silverPackage.setWeightMeasurement(hdfactory.getWeightMeasurement("loadsensor"));
        silverPackage.setInternetConnection(hdfactory.getInternetConnect(internetType));
        silverPackage.setWebServer(wsfactory.getWebServer(webType));
        silverPackage.setIdentification(hdfactory.getIdentification("rfid"));
        silverPackage.setDisplay(hdfactory.getDisplay("lcd"));
        button= hdfactory.getController("button");
        sd= hdfactory.getStorage("sd");
    }

    @Override
    public Package getPackage() {
        return silverPackage;
    }

    @Override
    public void measureWeight() {
        silverPackage.getWeightMeasurement().measureWeight();
    }

    @Override
    public void identify() {
        silverPackage.getIdentification().getIdentified();
    }

    @Override
    public void showStore() {
        silverPackage.getDisplay().displayInfo();
        sd.getStoreInfo();
    }

}
