public class BeefPizza implements Pizza{
    @Override
    public String preparePizza() {
        return "Beef Pizza";
    }

    @Override
    public double pizzaPrice() {
        return 500.00;
    }
}
