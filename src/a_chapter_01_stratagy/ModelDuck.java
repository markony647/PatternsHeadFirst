package a_chapter_01_stratagy;


import a_chapter_01_stratagy.interfaces.Duck;
import a_chapter_01_stratagy.interfaces.FlyNoWay;
import a_chapter_01_stratagy.interfaces.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck!");
    }
}
