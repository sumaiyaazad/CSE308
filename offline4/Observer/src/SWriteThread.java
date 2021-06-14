import java.util.Scanner;

public class SWriteThread implements Runnable{
    private Thread thr;

    public SWriteThread() {
        this.thr = new Thread(this);
        thr.start();
    }

    public void run() {
        try {
            Scanner input = new Scanner(System.in);
            while (true) {
                String s = input.nextLine();
                Information d = new Information(s);
                String[] command=d.getElement().split("\\s+");
                if(command[0].equalsIgnoreCase("i")){
                    StockSubject ss=Server.getSubject(command[1]);
                    if(ss!=null){
                        ss.increasePrice(Float.parseFloat(command[2]));
                    }

                }
                else if(command[0].equalsIgnoreCase("d")){
                    StockSubject ss=Server.getSubject(command[1]);
                    if(ss!=null){
                        ss.decreasePrice(Float.parseFloat(command[2]));
                    }

                }
                else if(command[0].equalsIgnoreCase("c")){
                    StockSubject ss=Server.getSubject(command[1]);
                    if(ss!=null){
                        ss.setCount(Integer.parseInt(command[2]));
                    }


                }
                //nc.write(d);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            //nc.closeConnection();
        }
    }
}
