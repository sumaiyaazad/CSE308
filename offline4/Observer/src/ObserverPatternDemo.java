import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObserverPatternDemo {
    private static List<StockSubject> stocks = new ArrayList<StockSubject>();
    private static UserObserver U1=new UserObserver();
    public static void main(String[] args) throws IOException {

        createStocks();
        System.out.println("User U1 logged in");
        printStocks();
        Scanner s = new Scanner(System.in);
//        private static int  choice;
//        do{
//            System.out.print("========= Operation ============ \n");
//            System.out.print("            1. Stock List  \n");
//            System.out.print("            4. Increase Price \n");
//            System.out.print("            5. Decrease Price \n");
//            System.out.print("            6. Change Count \n");
//            System.out.print("            7. Exit                        \n");
//            System.out.print("Enter your choice: ");
//            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//            choice=Integer.parseInt(br.readLine());
//            switch (choice) {
//                case 1:{
//                    System.out.println("Stock List");
//                    P1.toString();
//                    P2.toString();
//                    P3.toString();
//                    P4.toString();
//                    P5.toString();
//                    P6.toString();
//                }
//                break;
//
//                case 2:{
//                    NormalPackageVeggi menu2=new NormalPackageVeggi(new VeggiPizza());
//                    System.out.println(menu2.preparePizza());
//                    System.out.println( menu2.pizzaPrice());
//                }
//                break;
//
//                case 3:{
//                    ComboPackageVeggi1 menu3=new ComboPackageVeggi1(new VeggiPizza());
//                    System.out.println(menu3.preparePizza());
//                    System.out.println( menu3.pizzaPrice());
//                }
//                break;
//
//                case 4:{
//                    ComboPackageVeggi2 menu4=new ComboPackageVeggi2(new VeggiPizza());
//                    System.out.println(menu4.preparePizza());
//                    System.out.println( menu4.pizzaPrice());
//                }
//                break;
//
//                case 5:{
//                    BeefPizza menu5=new BeefPizza();
//                    System.out.println(menu5.preparePizza());
//                    System.out.println( menu5.pizzaPrice());
//                }
//                break;
//
//                default:{
//                    System.out.println("Other than these no pizza available");
//                }
//                return;
//            }
//
//        }while(choice!=7);
        for(int i=0;;i++) {
            System.out.println("Waiting for operation: ");
            String commands = s.nextLine();
            String[] command=commands.split(" ");
            if(command[0].equalsIgnoreCase("s")){
                StockSubject ss=getSubject(command[1]);
                U1.subscribe(ss);
            }
            else if(command[0].equalsIgnoreCase("u")){
                StockSubject ss=getSubject(command[1]);
                U1.unsubscribe(ss);
            }
            else if(command[0].equalsIgnoreCase("i")){
                StockSubject ss=getSubject(command[1]);
                ss.increasePrice(Float.parseFloat(command[2]));
            }
            else if(command[0].equalsIgnoreCase("d")){
                StockSubject ss=getSubject(command[1]);
                ss.decreasePrice(Float.parseFloat(command[2]));
            }
            else if(command[0].equalsIgnoreCase("c")){
                StockSubject ss=getSubject(command[1]);
                ss.setCount(Integer.parseInt(command[2]));
            }
        }

    }
    public static void createStocks(){
        stocks.add(new StockSubject("P1",3, 40.0F));
        stocks.add(new StockSubject("P2",4, 30.0F));
        stocks.add(new StockSubject("P3",5,80.0F));
        stocks.add(new StockSubject("P4",6,25.0F));
        stocks.add(new StockSubject("P5",7,15.0F));
        stocks.add(new StockSubject("P6",9,50.0F));
//        StockSubject P1=new StockSubject("P1",3, 40.0F);
//        StockSubject P2=new StockSubject("P2",4, 30.0F);
//        StockSubject P3=new StockSubject("P3",5,80.0F);
//        StockSubject P4=new StockSubject("P4",6,25.0F);
//        StockSubject P5=new StockSubject("P5",7,15.0F);
//        StockSubject P6=new StockSubject("P6",9,50.0F);
    }
    public static void printStocks(){
//        P1.toString();
//        P2.toString();
//        P3.toString();
//        P4.toString();
//        P5.toString();
//        P6.toString();
        for (StockSubject subject : stocks) {
            System.out.println(subject.toString());
        }
    }
    public static StockSubject getSubject(String name){
        for (StockSubject subject : stocks) {
            if(subject.getName().equalsIgnoreCase(name)){
                return subject;
            }
        }
        return null;
    }

}
