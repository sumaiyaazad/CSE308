public class SReadThread implements Runnable {
    private Thread thr;
    private NetworkUtil nc;
    private UserObserver userObserver;

    public SReadThread(UserObserver userObserver) {
        this.nc = userObserver.getNc();
        this.userObserver=userObserver;
        this.thr = new Thread(this);
        thr.start();
    }

    public void run() {
        try {
            while (true) {
                Object o = nc.read();
                if (o != null) {
                    if (o instanceof Information) {
                        Information obj = (Information) o;
                        //System.out.println(obj.getElement());
                        String[] command=obj.getElement().split("\\s+");
                        if(command[0].equalsIgnoreCase("s")){
                            StockSubject ss=Server.getSubject(command[1]);
                            if(ss!=null){
                                this.userObserver.subscribe(ss);
                            }
                            else{
                                this.userObserver.update("There is no stock with this name");
                            }
                        }
                        else if(command[0].equalsIgnoreCase("u")){
                            StockSubject ss=Server.getSubject(command[1]);
                            if(ss!=null){
                                this.userObserver.unsubscribe(ss);
                            }
                            else{
                                this.userObserver.update("There is no stock with this name");
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            nc.closeConnection();
        }
    }

}



