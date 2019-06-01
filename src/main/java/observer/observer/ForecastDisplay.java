package observer.observer;

import java.util.Random;

import observer.comm.Display;
import observer.subject.Subject;

/**
 * 根据 当前温湿度 预报天气
 * 
 * @author cx
 * @time 2019年5月29日 下午10:04:32
 */
public class ForecastDisplay implements Observer, Display {
    private Subject weatherData;
    private String temperature;
    private String humidity;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("气温: " + temperature + ", 湿度: " + humidity);
        Random r = new Random();
        System.out.println("下雨概率: " + r.nextInt(100) / 100.0);
    }

    public void update(String temperature, String humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

}
