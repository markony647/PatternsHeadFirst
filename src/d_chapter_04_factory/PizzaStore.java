package d_chapter_04_factory;


public abstract class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = factory.createPizza(type);
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
