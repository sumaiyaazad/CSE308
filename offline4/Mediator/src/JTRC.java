public class JTRC extends Organization{
    public JTRC(Mediator mediator, String name, String type) {
        super(mediator);
        this.name=name;
        this.type=type;
    }
    public void serviceRequest(Organization org){
        System.out.println(org.getName()+" requests for "+this.type+" service");
        organizations.add(org);
    }
    public void provideService(){
        if(this.organizations.size()!=0){
            System.out.println(this.name+" serves the request of "+this.organizations.get(0).getName());
            this.organizations.remove(0);
        }
        else{
            System.out.println(this.name+" has no pending request to serve");
        }
    }
}
