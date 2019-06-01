package strategy.duck;

import strategy.behavior.FlyBehavior;
import strategy.behavior.QuackBehavior;

public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    /**
     * 鸭子的样子
     */
    public abstract void display();

    /**
     * 鸭子飞
     */
    public void fly() {
        System.out.print("鸭子要 飞了: ");
        flyBehavior.fly();
    }

    /**
     * 鸭子叫
     */
    public void quack() {
        System.out.print("鸭子要 叫了: ");
        quackBehavior.quack();
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

}
