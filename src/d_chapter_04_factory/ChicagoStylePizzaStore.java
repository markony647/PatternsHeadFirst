package d_chapter_04_factory;


public class ChicagoStylePizzaStore extends PizzaStore {
    public ChicagoStylePizzaStore(SimplePizzaFactory factory) {
        super(factory);
    }

    @Override
    public Pizza createPizza(String type) {
        return null;
    }
}
