public class Silver implements PackageBuilder {
    Package silverPackage;
    AbstractFactory hdfactory;
    AbstractFactory wsfactory;

    public Silver(String internetType,String webType) {
        if(internetType.equalsIgnoreCase("ethernet")){
            System.out.println("Silver package supports Wifi and GSM internet connection");
            System.out.println("Silver package creation failed");
        }
        silverPackage = new Package();
        hdfactory = FactoryProducer.getFactory("hardwaredevicefactory");
        wsfactory = FactoryProducer.getFactory("webserverfactory");
        silverPackage.setProcessorController(hdfactory.getProCon("atmega32"));
        silverPackage.setWeightMeasurement(hdfactory.getWeightMeasurement("loadsensor"));
        silverPackage.setInternetConnection(hdfactory.getInternetConnect(internetType));
        silverPackage.setWebServer(hdfactory.getWebServer(webType));
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
        silverPackage.getStorage().getStoreInfo();
    }

    @Override
    public void display() {
        silverPackage.getDisplay().displayInfo();
    }
}
