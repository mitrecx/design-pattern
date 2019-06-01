package strategy.behavior;

/**
 * 长距离飞行 类
 * 
 * @author cx
 * @time 2019年5月27日 下午10:28:48
 */
public class FlyLongDistance implements FlyBehavior {
    public void fly() {
        System.out.println("一次最远 能飞50米>>>");
    }

}
