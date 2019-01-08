public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /**
     * All the responsibility for instantiating Pizzas has been moved
     * into a method that acts as a factory.
     */
    protected abstract Pizza createPizza(String type);
}