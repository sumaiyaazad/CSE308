public class JWSA extends Organization{

    public JWSA(Mediator mediator, String name, String type) {
        super(mediator);
        this.name=name;
        this.type=type;
    }
    public void serviceRequest(){
        System.out.println("JWSA : received request from JCC");
    }
    public void provideService(){
        System.out.println("JWSA : served 1st pending request");
    }
    public void receivedService(){
        System.out.println("JWSA : received service from JCC");
    }
}
