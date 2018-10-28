package behavioral.observer;

public class CurrentConditionsDisplay implements Observer, Display {

    private float temperature;

    private int pressure;

    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Текущая температура: " +
                temperature + " Текущее давление: " + pressure);
    }
}