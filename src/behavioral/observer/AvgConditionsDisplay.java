package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class AvgConditionsDisplay implements Observer, Display {

    private float temperature;

    private WeatherData weatherData;

    private List<Float> avgTemperatures;

    public AvgConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        avgTemperatures = new ArrayList<>();
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, int pressure) {
        this.temperature = temperature;
        display();
    }

    @Override
    public void display() {
        avgTemperatures.add(temperature);
        Float sum = 0f;

        for (Float temp: avgTemperatures) {
            sum+=temp;
        }

        float avgTemp = sum / avgTemperatures.size();
        System.out.println("Средняя температура: " + avgTemp);
    }
}
