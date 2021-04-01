public class ComboPackageVeggi2 extends PizzaDecorator{
    public ComboPackageVeggi2(Pizza newPizza) {
        super(newPizza);
    }
    public String preparePizza(){
        return super.preparePizza() +" With French Fry and Coke ";
    }
    public double pizzaPrice()   {
        return super.pizzaPrice()+100.0+150.0;
    }
}
