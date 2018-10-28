package behavioral.observer;

public class Client {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);
        AvgConditionsDisplay avgConditionsDisplay =
                new AvgConditionsDisplay(weatherData);

        weatherData.setMeasurements(30f, 40);
        weatherData.setMeasurements(40f, 40);
        weatherData.setMeasurements(50f, 40);

    }

}
