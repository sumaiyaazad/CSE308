public class NormalPackageBeef extends PizzaDecorator{
    public NormalPackageBeef(Pizza newPizza) {
        super(newPizza);
    }
    public String preparePizza(){
        return super.preparePizza() +" With French Fry ";
    }
    public double pizzaPrice()   {
        return super.pizzaPrice()+100.0;
    }
}
