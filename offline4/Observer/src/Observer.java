public abstract class Observer {
    //protected StockSubject subject;
    public abstract void update(String message);
    public abstract void subscribe(StockSubject subject);
    public abstract void unsubscribe(StockSubject subject);
}
