public class Gold implements PackageBuilder {
    Package goldPackage;
    AbstractFactory hdfactory;
    AbstractFactory wsfactory;

    public Gold(String internetType, String webType) {
        if(internetType.equalsIgnoreCase("ethernet")){
            System.out.println("Gold package supports Wifi and GSM internet connection");
            System.out.println("Gold package creation failed");
        }
        goldPackage = new Package();
        hdfactory = FactoryProducer.getFactory("hardwaredevicefactory");
        wsfactory = FactoryProducer.getFactory("webserverfactory");
        goldPackage.setProcessorController(hdfactory.getProCon("arduinomega"));
        goldPackage.setWeightMeasurement(hdfactory.getWeightMeasurement("weightmodule"));
        goldPackage.setInternetConnection(hdfactory.getInternetConnect(internetType));
        goldPackage.setWebServer(hdfactory.getWebServer(webType));
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
        goldPackage.getStorage().getStoreInfo();
    }

    @Override
    public void display() {
        goldPackage.getDisplay().displayInfo();
    }
}
