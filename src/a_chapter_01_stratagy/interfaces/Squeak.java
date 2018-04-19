package a_chapter_01_stratagy.interfaces;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}
