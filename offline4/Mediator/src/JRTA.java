public class JRTA extends Organization{
    public JRTA(Mediator mediator, String name, String type) {
        super(mediator);
        this.name=name;
        this.type=type;
    }
    public void serviceRequest(){
        System.out.println("JRTA : received request from JCC");
    }

    public void provideService(){
        System.out.println("JRTA: served 1st pending request");
    }

    public void receivedService() {
        System.out.println("JRTA : received service from JCC");
    }
}
