package singleton;

/**
 * 多线程下的 单例模式: <br>
 * 直接给 getInstance 方法 加 synchronized 关键字.<br>
 * 这样做 会影响效率, 每次获取实例时 都是同步, 事实上真正需要同步的就只有第一次实例化.<br>
 * 
 * @author cx
 * @time 2019年6月2日 下午7:49:32
 */
public class SingletonSYN1 {
    private static SingletonSYN1 uniqueInstance;

    private SingletonSYN1() {
    }

    public static synchronized SingletonSYN1 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonSYN1();
        }
        return uniqueInstance;
    }
}
