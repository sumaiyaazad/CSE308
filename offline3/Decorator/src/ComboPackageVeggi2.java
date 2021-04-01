public class ComboPackageVeggi2 extends PizzaDecorator{
    public ComboPackageVeggi2(Pizza newPizza) {
        super(newPizza);
    }
    public String preparePizza(){
        return super.preparePizza() +" with Onion Rings and Coffee ";
    }
    public double pizzaPrice()   {
        return super.pizzaPrice()+100.0+200.0;
    }
}
