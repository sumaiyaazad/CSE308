import java.util.Scanner;

public class WriteThread implements Runnable {

    private Thread thr;
    private NetworkUtil nc;

    public WriteThread(NetworkUtil nc) {
        this.nc = nc;

        this.thr = new Thread(this);
        thr.start();
    }

    public void run() {
        try {
            Scanner input = new Scanner(System.in);
            while (true) {
                String s = input.nextLine();
                Information d = new Information( s);
                nc.write(d);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            nc.closeConnection();
        }
    }
}



