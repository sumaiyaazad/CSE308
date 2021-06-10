import java.util.Scanner;

public class MediatorPatternDemo {
    static JCC jcc=new JCC();
    static JPDC jpdc=new JPDC(jcc,"JPDC","Energy");
    static JRTA jrta=new JRTA(jcc,"JRTA","Transport");
    static JTRC jtrc=new JTRC(jcc,"JTRC","Telecom");
    static JWSA jwsa=new JWSA(jcc,"JWSA","Water");
    public static void main(String[] args) {
        jcc.setJpdc(jpdc);
        jcc.setJrta(jrta);
        jcc.setJtrc(jtrc);
        jcc.setJwsa(jwsa);
        Scanner s = new Scanner(System.in);
        for(int i=0;;i++) {
            System.out.println("Waiting for operation: ");
            String commands = s.nextLine();
            String[] command=commands.split(" ");
            if(command[1].equalsIgnoreCase("serve")){
                jcc.provideService(getOrg(command[0]));
            }
            else if(command[1].equalsIgnoreCase("energy") || command[1].equalsIgnoreCase("transport") || command[1].equalsIgnoreCase("telecom") || command[1].equalsIgnoreCase("water")){
                jcc.requestService(getOrg(command[0]),command[1]);
            }
        }
    }
    public  static Organization getOrg(String orgName){
        if(orgName.equalsIgnoreCase("jpdc")){
            return jpdc;
        }
        else if(orgName.equalsIgnoreCase("jrta")){
            return jrta;
        }
        else if(orgName.equalsIgnoreCase("jtrc")){
            return jtrc;
        }
        else if(orgName.equalsIgnoreCase("jwsa")){
            return jwsa;
        }
        else{
            return null;
        }
    }
}
