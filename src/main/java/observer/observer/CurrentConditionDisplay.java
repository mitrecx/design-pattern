package observer.observer;

import observer.comm.Display;
import observer.subject.Subject;

/**
 * 当前 温湿度 显示
 * 
 * @author cx
 * @time 2019年5月29日 下午9:43:15
 */
public class CurrentConditionDisplay implements Observer, Display {
    private Subject weatherData;
    private String temperature;
    private String humidity;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(String temperature, String humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("temperature: " + temperature+", humidity: " + humidity);
    }

}
