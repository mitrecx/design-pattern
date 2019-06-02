package singleton;

import java.security.Signature;

/**
 * @author cx
 * @time 2019年6月2日 下午7:43:09
 */
public class Test {
    public static void main(String[] args) {
        Singleton uniqueInstance = Singleton.getInstance();
        Singleton uniqueInstance2 = Singleton.getInstance();
        System.out.println(uniqueInstance);
        System.out.println(uniqueInstance2);
    }

}
