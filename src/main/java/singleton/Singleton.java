package singleton;

/**
 * 经典的 单例模式 实现
 * 
 * @author cx
 * @time 2019年6月2日 下午7:39:00
 */
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
