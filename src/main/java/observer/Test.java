package observer;

import observer.observer.CurrentConditionDisplay;
import observer.observer.ForecastDisplay;
import observer.observer.Observer;
import observer.subject.Subject;
import observer.subject.WeatherData;

/**
 * @author cx
 * @time 2019年5月29日 下午9:20:49
 */
public class Test {
    public static void main(String[] args) {
        // 主题 subject ----- weatherData
        WeatherData weatherData = new WeatherData();
        // 观察者 observer -----currentConditionDisplay
        Observer currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        // 观察者 observer -----forecastDisplay
        Observer forecastDisplay = new ForecastDisplay(weatherData);

        // 主题主动推送数据
        weatherData.setMeasurements("18°", "64");

        System.out.println("==========");

        // 主题主动推送数据
        weatherData.setMeasurements("39°", "99");
    }
}
