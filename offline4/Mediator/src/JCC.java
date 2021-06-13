import java.util.ArrayList;
import java.util.List;

public class JCC extends Mediator {
    private JPDC jpdc;
    private JRTA jrta;
    private JTRC jtrc;
    private JWSA jwsa;
    protected List<Organization> jpdcOrganizations = new ArrayList<Organization>();
    protected List<Organization> jrtaOrganizations = new ArrayList<Organization>();
    protected List<Organization> jtrcOrganizations = new ArrayList<Organization>();
    protected List<Organization> jwsaOrganizations = new ArrayList<Organization>();

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
        System.out.println("JCC : received request for "+serviceType+" from "+org.getName());
        if(serviceType.equalsIgnoreCase("energy")){
            jpdcOrganizations.add(org);
            jpdc.serviceRequest();
        }
        else if(serviceType.equalsIgnoreCase("transport")){
            jrtaOrganizations.add(org);
            jrta.serviceRequest();
        }
        else if(serviceType.equalsIgnoreCase("telecom")){
            jtrcOrganizations.add(org);
            jtrc.serviceRequest();
        }
        else if(serviceType.equalsIgnoreCase("water")){
            jwsaOrganizations.add(org);
            jwsa.serviceRequest();
        }
        else{
            System.out.println("Sorry! JCC is not responsible for handling this service");
        }
    }

    @Override
    public void provideService(Organization org) {
        if(org.getName().equalsIgnoreCase("jpdc") && jpdcOrganizations.size()!=0){
            org.provideService();
            System.out.println("JCC : JPDC served the request of "+jpdcOrganizations.get(0).getName());
            jpdcOrganizations.get(0).receivedService();
            jpdcOrganizations.remove(0);
        }
        else if(org.getName().equalsIgnoreCase("jpdc") && jpdcOrganizations.size()==0){
            System.out.println("JCC : JPDC has no pending request to serve");
        }
        else if(org.getName().equalsIgnoreCase("jrta") && jrtaOrganizations.size()!=0){
            org.provideService();
            System.out.println("JCC : JRTA served the request of "+jrtaOrganizations.get(0).getName());
            jrtaOrganizations.get(0).receivedService();
            jrtaOrganizations.remove(0);
        }
        else if(org.getName().equalsIgnoreCase("jrta") && jrtaOrganizations.size()==0){
            System.out.println("JCC : JRTA has no pending request to serve");
        }
        else if(org.getName().equalsIgnoreCase("jtrc") && jtrcOrganizations.size()!=0){
            org.provideService();
            System.out.println("JCC : JTRC served the request of "+jtrcOrganizations.get(0).getName());
            jtrcOrganizations.get(0).receivedService();
            jtrcOrganizations.remove(0);
        }
        else if(org.getName().equalsIgnoreCase("jtrc") && jtrcOrganizations.size()==0){
            System.out.println("JCC : JTRC has no pending request to serve");
        }
        else if(org.getName().equalsIgnoreCase("jwsa") && jwsaOrganizations.size()!=0){
            org.provideService();
            System.out.println("JCC : JWSA served the request of "+jwsaOrganizations.get(0).getName());
            jwsaOrganizations.get(0).receivedService();
            jwsaOrganizations.remove(0);
        }
        else if(org.getName().equalsIgnoreCase("jwsa") && jwsaOrganizations.size()==0){
            System.out.println("JCC : JWSA has no pending request to serve");
        }
        else{
            System.out.println("JCC : Error in provide service");
        }

    }
}
