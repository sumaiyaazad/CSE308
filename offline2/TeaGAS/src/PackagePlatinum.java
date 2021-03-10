public class PackagePlatinum implements PackageBuilder {
    Package platinumPackage;
    AbstractFactory hdfactory;
    AbstractFactory wsfactory;

    public PackagePlatinum(String internetType, String webType) {
        platinumPackage = new Package();
        hdfactory = FactoryProducer.getFactory("hardwaredevicefactory");
        wsfactory = FactoryProducer.getFactory("webserverfactory");
        platinumPackage.setProcessorController(hdfactory.getProCon("raspberrypi"));
        platinumPackage.setWeightMeasurement(hdfactory.getWeightMeasurement("weightmodule"));
        platinumPackage.setInternetConnection(hdfactory.getInternetConnect(internetType));
        platinumPackage.setWebServer(hdfactory.getWebServer(webType));
    }

    @Override
    public Package getPackage() {
        return platinumPackage;
    }

    @Override
    public void measureWeight() {
        platinumPackage.getWeightMeasurement().measureWeight();
    }

    @Override
    public void identify() {
        platinumPackage.getIdentification().getIdentified();
    }

    @Override
    public void showStore() {
        platinumPackage.getStorage().getStoreInfo();
    }

    @Override
    public void display() {
        platinumPackage.getDisplay().displayInfo();
    }
}
