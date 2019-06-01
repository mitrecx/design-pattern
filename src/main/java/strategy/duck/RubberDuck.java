package strategy.duck;

import strategy.behavior.FlyBehavior;
import strategy.behavior.QuackBehavior;

/**
 * 黄色的橡皮鸭, 不会飞, 不会叫.
 * 
 * @author cx
 * @time 2019年5月27日 下午11:10:32
 */
public class RubberDuck extends Duck {
    public RubberDuck() {

    }

    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.setFlyBehavior(flyBehavior);
        this.setQuackBehavior(quackBehavior);
    }

    public void display() {
        System.out.println("黄色的橡皮鸭");
    }
}
