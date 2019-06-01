package strategy.behavior;

/**
 * @author cx
 * @time 2019年5月27日 下午10:30:27
 */
public class FlyNoWay implements FlyBehavior {

    public void fly() {
        System.out.println("抱歉, 不会飞!");
    }

}
