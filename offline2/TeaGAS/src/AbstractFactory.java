import Interface.*;
import Interface.Implementation.Django;

public abstract class AbstractFactory {
    abstract Controller getController(String type);

    abstract Display getDisplay(String type);

    abstract Identification getIdentification(String type);

    abstract InternetConnection getInternetConnect(String type);

    abstract ProCon getProCon(String type);

    abstract Storage getStorage(String type);

    abstract WebServer getWebServer(String type);

    abstract WeightMeasurement getWeightMeasurement(String type);
}
