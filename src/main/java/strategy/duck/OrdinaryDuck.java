package strategy.duck;

import strategy.behavior.FlyBehavior;
import strategy.behavior.QuackBehavior;

/**
 * 普通的鸭子, 体型较小, 能短飞, 嘎嘎叫
 * 
 * @author cx
 * @time 2019年5月27日 下午11:04:42
 */
public class OrdinaryDuck extends Duck {

    public OrdinaryDuck() {

    }

    public OrdinaryDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.setFlyBehavior(flyBehavior);
        this.setQuackBehavior(quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("普通的鸭子: 体型较小");
    }

}
