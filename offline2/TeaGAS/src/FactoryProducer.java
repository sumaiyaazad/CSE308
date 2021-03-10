public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("hardwaredevicefactory")){
            return new HardwareDeviceFactory();
        }
        else if(choice.equalsIgnoreCase("webserverfactory")){
            return new WebServerFactory();
        }
        else{
            return null;
        }
    }
}
