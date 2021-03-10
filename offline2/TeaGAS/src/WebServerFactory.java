import Interface.*;
import Interface.Implementation.Django;
import Interface.Implementation.Laravel;
import Interface.Implementation.Spring;

public class WebServerFactory extends AbstractFactory {
    @Override
    Controller getController(String type) {
        return null;
    }

    @Override
    Display getDisplay(String type) {
        return null;
    }

    @Override
    Identification getIdentification(String type) {
        return null;
    }

    @Override
    InternetConnection getInternetConnect(String type) {
        return null;
    }

    @Override
    ProCon getProCon(String type) {
        return null;
    }

    @Override
    Storage getStorage(String type) {
        return null;
    }

    @Override
    WebServer getWebServer(String type) {
        if(type.equalsIgnoreCase("django")){
            return new Django();
        }
        else if(type.equalsIgnoreCase("laravel")){
            return new Laravel();
        }
        else if(type.equalsIgnoreCase("spring")){
            return new Spring();
        }
        else{
            return null;
        }
    }

    @Override
    WeightMeasurement getWeightMeasurement(String type) {
        return null;
    }
}
