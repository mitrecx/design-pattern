package strategy.behavior;

/**
 * 短距离飞行 类
 * 
 * @author cx
 * @time 2019年5月27日 下午10:25:51
 */
public class FlyShortDistance implements FlyBehavior {
    public void fly() {
        System.out.println("一次最多飞 3米>>>");
    }
}
