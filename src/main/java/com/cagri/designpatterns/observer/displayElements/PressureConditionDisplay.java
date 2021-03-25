package com.cagri.designpatterns.observer.displayElements;

import com.cagri.designpatterns.observer.Observer;
import com.cagri.designpatterns.observer.WeatherData;

public class PressureConditionDisplay implements Observer, DisplayElement {
    private WeatherData weatherData;
    private float pressure;

    public PressureConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Pressure is " + pressure);
    }
}
