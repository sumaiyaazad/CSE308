public class PackageDiamond implements PackageBuilder {
    Package diamondPackage;
    AbstractFactory hdfactory;
    AbstractFactory wsfactory;

    public PackageDiamond(String internetType, String webType) {
        diamondPackage = new Package();
        hdfactory = FactoryProducer.getFactory("hardwaredevicefactory");
        wsfactory = FactoryProducer.getFactory("webserverfactory");
        diamondPackage.setProcessorController(hdfactory.getProCon("raspberrypi"));
        diamondPackage.setWeightMeasurement(hdfactory.getWeightMeasurement("loadsensor"));
        diamondPackage.setInternetConnection(hdfactory.getInternetConnect(internetType));
        diamondPackage.setWebServer(wsfactory.getWebServer(webType));
        diamondPackage.setIdentification(hdfactory.getIdentification("nfc"));
        diamondPackage.setDisplay(hdfactory.getDisplay("touchscreen"));
    }

    @Override
    public Package getPackage() {
        return diamondPackage;
    }

    @Override
    public void measureWeight() {
        diamondPackage.getWeightMeasurement().measureWeight();
    }

    @Override
    public void identify() {
        diamondPackage.getIdentification().getIdentified();
    }

    @Override
    public void showStore() {
        diamondPackage.getDisplay().displayInfo();
        System.out.println("Storage Info from raspberrypi storage...");
    }

}
