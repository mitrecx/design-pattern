package singleton;

/**
 * 多线程下的 单例模式: <br>
 * 急切创建实例, 而不是 延迟实例化的做法.<br>
 * 利用这个做法, JVM 加载 这个类时, 就会立刻创建这个唯一的实例.<br>
 * 
 * @author cx
 * @time 2019年6月2日 下午7:55:14
 */
public class SingletonSYN2 {
    private static SingletonSYN2 uniqueInstance = new SingletonSYN2();

    private SingletonSYN2() {
    }

    public static SingletonSYN2 getInstance() {
        return uniqueInstance;
    }
}
