import java.util.ArrayList;
import java.util.List;

public class StockSubject {
    private List<UserObserver> observers = new ArrayList<UserObserver>();
    private int count;
    private float price;
    private String name;

    public StockSubject() {

    }

    public StockSubject(String name, int count, float price) {
        this.count = count;
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public float getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(int count) {
        this.count = count;
        System.out.println("Count changed : "+this.name+" "+this.count);
        notifyAllObservers("Count changed : "+this.name+" "+this.count);
    }

    public void increasePrice(float price) {
        this.price += price;
        System.out.println("Price increased : "+this.name+" "+this.price);
        notifyAllObservers("Price increased : "+this.name+" "+this.price);
    }

    public void decreasePrice(float price) {
        this.price -= price;
        System.out.println("Price decreased : "+this.name+" "+this.price);
        notifyAllObservers("Price decreased : "+this.name+" "+this.price);
    }

    public void subscribe(UserObserver observer){
        observers.add(observer);
        observer.update("User subscribed to stock: "+this.name);
    }

    public void unsubscribe(UserObserver observer){
        if(observers.indexOf(observer)!=-1){
            observer.update("User unsubscribed to stock: "+this.name);
            observers.remove(observers.indexOf(observer));
        }
        else{
            observer.update("Sorry! User is not subscribed to stock: "+this.name);
        }
    }

    public void notifyAllObservers(String message){
        for (UserObserver observer : observers) {
            observer.update(message);
        }
    }

    @Override
    public String toString() {
        return name + " "+ count +" "+ price + " ";
    }
}
