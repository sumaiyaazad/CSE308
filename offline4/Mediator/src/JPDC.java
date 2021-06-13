public class JPDC extends Organization{
    public JPDC(Mediator mediator, String name, String type) {
        super(mediator);
        this.name=name;
        this.type=type;
    }
    public void serviceRequest(){
        System.out.println("JPDC : received request from JCC");
    }

    public void provideService(){
        System.out.println("JPDC : served 1st pending request");
    }

    public void receivedService() {
        System.out.println("JPDC : received service from JCC");
    }
}
