package d_chapter_04_factory;


public class NYStylePizzaStore extends PizzaStore {
    public NYStylePizzaStore(SimplePizzaFactory factory) {
        super(factory);
    }

    @Override
    public Pizza createPizza(String type) {
        return null;
    }
}
