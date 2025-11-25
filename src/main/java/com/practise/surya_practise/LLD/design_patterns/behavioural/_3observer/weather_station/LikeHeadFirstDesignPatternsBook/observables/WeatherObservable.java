package com.practise.surya_practise.LLD.design_patterns.behavioural._3observer.weather_station.LikeHeadFirstDesignPatternsBook.observables;

import com.practise.surya_practise.LLD.design_patterns.behavioural._3observer.weather_station.LikeHeadFirstDesignPatternsBook.observers.DisplayObserver;

public interface WeatherObservable
{
    void registerObserver(DisplayObserver observer);

    void removeObserver(DisplayObserver observer);

    void notifyObservers();

    void setTemperature(float temperature);

    float getTemperature();
}
