
public class JCC extends Mediator {
    private JPDC jpdc;
    private JRTA jrta;
    private JTRC jtrc;
    private JWSA jwsa;

    public void setJpdc(JPDC jpdc) {
        this.jpdc = jpdc;
    }

    public void setJrta(JRTA jrta) {
        this.jrta = jrta;
    }

    public void setJtrc(JTRC jtrc) {
        this.jtrc = jtrc;
    }

    public void setJwsa(JWSA jwsa) {
        this.jwsa = jwsa;
    }

    @Override
    public void requestService(Organization org, String serviceType) {
        if(serviceType.equalsIgnoreCase("energy")){
            jpdc.serviceRequest(org);
        }
        else if(serviceType.equalsIgnoreCase("transport")){
            jrta.serviceRequest(org);
        }
        else if(serviceType.equalsIgnoreCase("telecom")){
            jtrc.serviceRequest(org);
        }
        else if(serviceType.equalsIgnoreCase("water")){
            jwsa.serviceRequest(org);
        }
        else{
            System.out.println("Sorry! JCC is not responsible for handling this service");
        }
    }

    @Override
    public void provideService(Organization org) {
        org.provideService();
    }
}
