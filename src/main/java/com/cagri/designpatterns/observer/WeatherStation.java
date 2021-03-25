package com.cagri.designpatterns.observer;

import com.cagri.designpatterns.observer.displayElements.CurrentConditionsDisplay;
import com.cagri.designpatterns.observer.displayElements.PressureConditionDisplay;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay cureCurrentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        PressureConditionDisplay pressureConditionDisplay = new PressureConditionDisplay(weatherData);

        weatherData.setMeasurements(22.5f, 424.2f, 22.4f);
        weatherData.setMeasurements(50f, 400f, 45f);
        weatherData.setMeasurements(23f, 422f, 22f);
    }
}