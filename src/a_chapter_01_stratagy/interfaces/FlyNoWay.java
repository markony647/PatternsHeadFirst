package a_chapter_01_stratagy.interfaces;


public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
