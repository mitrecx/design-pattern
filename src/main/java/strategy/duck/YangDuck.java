package strategy.duck;

import strategy.behavior.FlyBehavior;
import strategy.behavior.QuackBehavior;

/**
 * 洋鸭, 体型庞大, 性格凶猛, 飞得远, 嘎嘎叫
 * 
 * @author cx
 * @time 2019年5月27日 下午10:54:02
 */
public class YangDuck extends Duck {

    public YangDuck() {

    }

    public YangDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.setFlyBehavior(flyBehavior);
        this.setQuackBehavior(quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("洋鸭: 体型庞大.");
    }

}
