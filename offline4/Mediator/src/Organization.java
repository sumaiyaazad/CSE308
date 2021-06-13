import java.util.ArrayList;
import java.util.List;

public abstract class Organization {
    protected Mediator mediator;
    protected String name;
    protected String type;
    protected List<Organization> organizations = new ArrayList<Organization>();
    public Organization(Mediator mediator){
        this.mediator=mediator;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
    public abstract void serviceRequest();
    public abstract void provideService();
    public abstract void receivedService();
}
