public class ComboPackageVeggi1 extends PizzaDecorator{
    public ComboPackageVeggi1(Pizza newPizza) {
        super(newPizza);
    }
    public String preparePizza(){
        return super.preparePizza() +" with French Fry and Coke ";
    }
    public double pizzaPrice()   {
        return super.pizzaPrice()+100.0+150.0;
    }
}
