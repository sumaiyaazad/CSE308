public class VeggiPizza implements Pizza{
    @Override
    public String preparePizza() {
        return "Veggi pizza";
    }

    @Override
    public double pizzaPrice() {
        return 400.00;
    }
}
