package a_chapter_01_stratagy;


import a_chapter_01_stratagy.interfaces.Duck;
import a_chapter_01_stratagy.interfaces.FlyWithWings;
import a_chapter_01_stratagy.interfaces.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am MallardDuck");
    }
}
