import java.io.File;
import java.io.FileNotFoundException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Server {

    private ServerSocket serverSocket;
    public static List<StockSubject> stocks = new ArrayList<StockSubject>();
    public static List<UserObserver> users = new ArrayList<UserObserver>();

    Server() {
        try {
            serverSocket = new ServerSocket(33333);
            new SWriteThread();
            while (true) {
                Socket clientSocket = serverSocket.accept();
                serve(clientSocket);
            }
        } catch (Exception e) {
            System.out.println("Server starts:" + e);
        }
    }

    public void serve(Socket clientSocket) {
        NetworkUtil nc = new NetworkUtil(clientSocket);
        UserObserver user=new UserObserver(nc);
        new SReadThread(user);
        for(StockSubject s:stocks){
            nc.write(new Information(s.toString()));
        }
        users.add(user);
    }

    public static void main(String args[]) throws FileNotFoundException {
        File file = new File("src/input.txt");
        Scanner fileReader = new Scanner(file);
        while (fileReader.hasNextLine()) {
            String[] data=fileReader.nextLine().split("\\s+");
            stocks.add(new StockSubject(data[0],Integer.parseInt(data[1]),Float.parseFloat(data[2])));
        }
        Server server = new Server();
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
