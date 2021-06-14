public abstract class Observer {
    //protected StockSubject subject;
    protected NetworkUtil nc;
    public abstract void update(String message);
    public abstract void subscribe(StockSubject subject);
    public abstract void unsubscribe(StockSubject subject);
}
