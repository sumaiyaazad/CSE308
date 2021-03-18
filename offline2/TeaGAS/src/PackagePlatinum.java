public class PackagePlatinum implements PackageBuilder {
    private Package platinumPackage;
    private AbstractFactory hdfactory;
    private AbstractFactory wsfactory;

    public PackagePlatinum(String internetType, String webType) {
        platinumPackage = new Package();
        hdfactory = FactoryProducer.getFactory("hardwaredevicefactory");
        wsfactory = FactoryProducer.getFactory("webserverfactory");
        platinumPackage.setProcessorController(hdfactory.getProCon("raspberrypi"));
        platinumPackage.setWeightMeasurement(hdfactory.getWeightMeasurement("weightmodule"));
        platinumPackage.setInternetConnection(hdfactory.getInternetConnect(internetType));
        platinumPackage.setWebServer(wsfactory.getWebServer(webType));
        platinumPackage.setIdentification(hdfactory.getIdentification("nfc"));
        platinumPackage.setDisplay(hdfactory.getDisplay("touchscreen"));
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
        platinumPackage.getDisplay().displayInfo();
        System.out.println("Storage Info from raspberrypi storage...");
    }
}
