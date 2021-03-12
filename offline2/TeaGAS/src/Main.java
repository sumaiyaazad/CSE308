import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PackageBuilder clientPackage;
        Scanner s = new Scanner(System.in);
        System.out.println("Select a package ( Silver, Gold, Diamond, Platinum ) : ");
        String packageName=s.nextLine();
        if(packageName.equals("")){
            System.out.println("Client ---> default package( silver )");
            packageName="Silver";
        }
        if(packageName.equalsIgnoreCase("platinum") || packageName.equalsIgnoreCase("diamond")){
            System.out.println("Select internet connection ( Wifi, GSM, Ethernet ) : ");
        }
        else{
            System.out.println("Select internet connection ( Wifi, GSM ) : ");
        }
        String internetType=s.nextLine();
        if(internetType.equals("")){
            System.out.println("Client ---> default internet connection( Wifi )");
            internetType="Wifi";
        }
        System.out.println("Select web server ( Django, Spring, Laravel ) : ");
        String webServer=s.nextLine();
        if(webServer.equals("")){
            System.out.println("Client ---> default web server( Laravel )");
            webServer="Laravel";
        }
        if(packageName.equalsIgnoreCase("silver")){
            clientPackage=new PackageSilver(internetType,webServer);
        }
        else if(packageName.equalsIgnoreCase("gold")){
            clientPackage=new PackageGold(internetType,webServer);
        }
        else if(packageName.equalsIgnoreCase("diamond")){
            clientPackage=new PackageDiamond(internetType,webServer);
        }
        else if(packageName.equalsIgnoreCase("platinum")){
            clientPackage=new PackageDiamond(internetType,webServer);
        }
        else{
            clientPackage=new PackageSilver(internetType,webServer);
        }
        for(int i=0;;i++){
            System.out.println("Select an operation ( Identify Leaf Collector(I), Measure Load Weight(M), Get Store Info(S)) ");
            String operation=s.nextLine();
            if(operation.equalsIgnoreCase("i")){
                clientPackage.identify();
            }
            else if(operation.equalsIgnoreCase("m")){
                clientPackage.measureWeight();
            }
            else if(operation.equalsIgnoreCase("s")){
                clientPackage.showStore();
            }
        }
    }
}
