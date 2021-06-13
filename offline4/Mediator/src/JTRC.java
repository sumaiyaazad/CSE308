public class JTRC extends Organization{
    public JTRC(Mediator mediator, String name, String type) {
        super(mediator);
        this.name=name;
        this.type=type;
    }
    public void serviceRequest(){
        System.out.println("JTRC : received request from JCC");
    }
    public void provideService(){
        System.out.println("JTRC : served 1st pending request");
    }

    public void receivedService() {
        System.out.println("JTRC : received service from JCC");
    }
}
