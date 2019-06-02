package singleton;

/**
 * 多线程下的 单例模式: <br>
 * 双重检查加锁, 解决 异步调用的问题.<br>
 * 两次 判断 实例是否为空, 一个 synchronized 同步 块锁.<br>
 * 
 * @author cx
 * @time 2019年6月2日 下午7:59:16
 */
public class SingletonSYN3 {
    private static volatile SingletonSYN3 uniqueInstance;

    private SingletonSYN3() {
    }

    public static SingletonSYN3 getInstance() {
        if (uniqueInstance == null) {
            synchronized (SingletonSYN3.class) {
                // 进入区块后, 再检查一次, 如果是 null, 才创建实例
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonSYN3();
                }
            }
        }
        return uniqueInstance;
    }
}
