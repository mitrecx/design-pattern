package observer.subject;

import java.util.ArrayList;

import observer.observer.Observer;

/**
 * 
 * @author cx
 * @time 2019年6月1日 下午7:47:33
 */
public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private String temperature;
    private String humidity;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObeserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index > 0) {
            observers.remove(index);
        }
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity);
        }
    }

    public void setMeasurements(String temperature, String humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }
}
