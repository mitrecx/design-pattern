package strategy.behavior;

/**
 * 
 * @author cx
 * @time 2019年5月27日 下午10:41:51
 */
public class QuackMute implements QuackBehavior {
    public void quack() {
        System.out.println("抱歉, 不会叫~");
    }
}
