import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObserverPatternDemo {
//    private static List<StockSubject> stocks = new ArrayList<StockSubject>();
//    private static UserObserver U1=new UserObserver();
//    public static void main(String[] args) throws IOException {
//
//        createStocks();
//        System.out.println("User U1 logged in");
//        printStocks();
//        Scanner s = new Scanner(System.in);
//        for(int i=0;;i++) {
//            System.out.println("Waiting for operation: ");
//            String commands = s.nextLine();
//            String[] command=commands.split(" ");
//            if(command[0].equalsIgnoreCase("s")){
//                StockSubject ss=getSubject(command[1]);
//                U1.subscribe(ss);
//            }
//            else if(command[0].equalsIgnoreCase("u")){
//                StockSubject ss=getSubject(command[1]);
//                U1.unsubscribe(ss);
//            }
//            else if(command[0].equalsIgnoreCase("i")){
//                StockSubject ss=getSubject(command[1]);
//                ss.increasePrice(Float.parseFloat(command[2]));
//            }
//            else if(command[0].equalsIgnoreCase("d")){
//                StockSubject ss=getSubject(command[1]);
//                ss.decreasePrice(Float.parseFloat(command[2]));
//            }
//            else if(command[0].equalsIgnoreCase("c")){
//                StockSubject ss=getSubject(command[1]);
//                ss.setCount(Integer.parseInt(command[2]));
//            }
//        }

//    }
    public static void createStocks(){
//        stocks.add(new StockSubject("P1",3, 40.0F));
//        stocks.add(new StockSubject("P2",4, 30.0F));
//        stocks.add(new StockSubject("P3",5,80.0F));
//        stocks.add(new StockSubject("P4",6,25.0F));
//        stocks.add(new StockSubject("P5",7,15.0F));
//        stocks.add(new StockSubject("P6",9,50.0F));

    }
    public static void printStocks(){

//        for (StockSubject subject : stocks) {
//            System.out.println(subject.toString());
//        }
    }
    public static StockSubject getSubject(String name){
//        for (StockSubject subject : stocks) {
//            if(subject.getName().equalsIgnoreCase(name)){
//                return subject;
//            }
//        }
       return null;
    }

}
