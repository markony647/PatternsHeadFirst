package c_chapter_03_decorator;


import c_chapter_03_decorator.components.Beverage;
import c_chapter_03_decorator.components.Espresso;
import c_chapter_03_decorator.components.HouseBlend;
import c_chapter_03_decorator.decorators.Mocha;
import c_chapter_03_decorator.decorators.Whip;

public class StarBuzzCoffeeTest {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);

        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
