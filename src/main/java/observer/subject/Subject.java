package observer.subject;

import observer.observer.Observer;

/**
 * @author cx
 * @time 2019年5月29日 下午9:21:55
 */
public interface Subject {
    /**
     * 把 观察者observer 注册 到主题中
     */
    void registerObserver(Observer observer);

    /**
     * 把 观察者observer 从主题中 移除
     */
    void removeObeserver(Observer observer);

    /**
     * 向 观察者observer 推(通知) 消息
     */
    void notifyObservers();
}
