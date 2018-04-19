package a_chapter_01_stratagy;


import a_chapter_01_stratagy.interfaces.Duck;
import a_chapter_01_stratagy.interfaces.FlyRocketPowered;

public class DuckDriveTest {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
