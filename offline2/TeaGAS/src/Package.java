import Interface.*;

public class Package {
//    private Controller controller;
    private Display display;
    private Identification identification;
    private InternetConnection internetConnection;
    private ProCon processorController;
//    private Storage storage;
    private WebServer webServer;
    private WeightMeasurement weightMeasurement;

    public Package() {
    }

//    public void setController(Controller controller) {
//        this.controller = controller;
//    }
//
    public void setDisplay(Display display) {
        this.display = display;
    }

    public void setIdentification(Identification identification) {
        this.identification = identification;
    }

    public void setInternetConnection(InternetConnection internetConnection) {
        this.internetConnection = internetConnection;
    }

    public void setProcessorController(ProCon processorController) {
        this.processorController = processorController;
    }

//    public void setStorage(Storage storage) {
//        this.storage = storage;
//    }

    public void setWebServer(WebServer webServer) {
        this.webServer = webServer;
    }

    public void setWeightMeasurement(WeightMeasurement weightMeasurement) {
        this.weightMeasurement = weightMeasurement;
    }

//    public Controller getController() {
//        return controller;
//    }
//
    public Display getDisplay() {
        return display;
    }

    public Identification getIdentification() {
        return identification;
    }

    public InternetConnection getInternetConnection() {
        return internetConnection;
    }

    public ProCon getProcessorController() {
        return processorController;
    }

//    public Storage getStorage() {
//        return storage;
//    }

    public WebServer getWebServer() {
        return webServer;
    }

    public WeightMeasurement getWeightMeasurement() {
        return weightMeasurement;
    }
}
