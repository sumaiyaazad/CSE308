public class NormalPackageVeggi extends PizzaDecorator{
    public NormalPackageVeggi(Pizza newPizza) {
        super(newPizza);
    }
    public String preparePizza(){
        return super.preparePizza() +" with Onion Rings ";
    }
    public double pizzaPrice()   {
        return super.pizzaPrice()+100.0;
    }
}
