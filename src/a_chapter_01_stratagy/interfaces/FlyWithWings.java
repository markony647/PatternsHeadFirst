package a_chapter_01_stratagy.interfaces;


public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying!!!!");
    }
}
