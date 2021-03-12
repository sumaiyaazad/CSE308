import Interface.*;
import Interface.Implementation.*;

public class HardwareDeviceFactory extends AbstractFactory{
    @Override
    Controller getController(String type) {
        if(type.equalsIgnoreCase("button")){
            return new Button();
        }
        else{
            return null;
        }
    }

    @Override
    Display getDisplay(String type) {
        if(type.equalsIgnoreCase("lcd")){
            return new LCD();
        }
        else if(type.equalsIgnoreCase("led")){
            return new LED();
        }
        else if(type.equalsIgnoreCase("touchscreen")){
            return new TouchScreen();
        }
        else{
            return null;
        }
    }

    @Override
    Identification getIdentification(String type) {
        if(type.equalsIgnoreCase("nfc")){
            return new NFC();
        }
        else if(type.equalsIgnoreCase("rfid")){
            return new RFID();
        }
        else{
            return null;
        }
    }

    @Override
    InternetConnection getInternetConnect(String type) {
        if(type.equalsIgnoreCase("ethernet")){
            return new Ethernet();
        }
        else if(type.equalsIgnoreCase("gsm")){
            return new GSM();
        }
        else if(type.equalsIgnoreCase("wifi")){
            return new Wifi();
        }
        else{
            return null;
        }
    }

    @Override
    ProCon getProCon(String type) {
        if(type.equalsIgnoreCase("arduinomega")){
            return new ArduinoMega();
        }
        else if(type.equalsIgnoreCase("atmega32")){
            return new ATMega32();
        }
        else if(type.equalsIgnoreCase("raspberrypi")){
            return new RaspberryPi();
        }
        else{
            return null;
        }
    }

    @Override
    Storage getStorage(String type) {
        if(type.equalsIgnoreCase("sd")){
            return new SD();
        }
        else{
            return null;
        }
    }

    @Override
    WebServer getWebServer(String type) {
        return null;
    }

    @Override
    WeightMeasurement getWeightMeasurement(String type) {
        if(type.equalsIgnoreCase("loadsensor")){
            return new LoadSensor();
        }
        else if(type.equalsIgnoreCase("weightmodule")){
            return new WeightModule();
        }
        else{
            return null;
        }
    }
}
