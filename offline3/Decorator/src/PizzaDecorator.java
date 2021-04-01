public class PizzaDecorator implements Pizza{
    private Pizza newPizza;
    public PizzaDecorator(Pizza newPizza)  {
        this.newPizza=newPizza;
    }
    @Override
    public String preparePizza(){
        return newPizza.preparePizza();
    }
    @Override
    public double pizzaPrice(){
        return newPizza.pizzaPrice();
    }
}
