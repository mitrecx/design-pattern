package strategy;

import strategy.behavior.FlyBehavior;
import strategy.behavior.FlyLongDistance;
import strategy.behavior.FlyNoWay;
import strategy.behavior.FlyShortDistance;
import strategy.behavior.QuackBehavior;
import strategy.behavior.QuackGaGa;
import strategy.behavior.QuackMute;
import strategy.duck.Duck;
import strategy.duck.OrdinaryDuck;
import strategy.duck.RubberDuck;
import strategy.duck.YangDuck;

/**
 * @author cx
 * @time 2019年5月27日 下午11:13:35
 */
public class Test {
    public static void main(String[] args) {
        FlyBehavior flyLong = new FlyLongDistance();
        FlyBehavior flyShort = new FlyShortDistance();
        FlyBehavior flyNoWay = new FlyNoWay();
        QuackBehavior quackGaGa = new QuackGaGa();
        QuackBehavior quackMute = new QuackMute();

        Duck yangDuck = new YangDuck(flyLong, quackGaGa);
        Duck ordinaryDuck = new OrdinaryDuck(flyShort, quackGaGa);
        Duck rubberDuck = new RubberDuck(flyNoWay, quackMute);

        System.out.println("++++++++++");
        yangDuck.display();
        yangDuck.fly();
        yangDuck.quack();
        System.out.println("++++++++++");

        ordinaryDuck.display();
        ordinaryDuck.fly();
        ordinaryDuck.quack();
        System.out.println("++++++++++");
        rubberDuck.display();
        rubberDuck.fly();
        rubberDuck.quack();
        System.out.println("给 橡皮鸭装一个喇叭:");
        rubberDuck.setQuackBehavior(quackGaGa);
        rubberDuck.quack();
        System.out.println("++++++++++");
    }

}
