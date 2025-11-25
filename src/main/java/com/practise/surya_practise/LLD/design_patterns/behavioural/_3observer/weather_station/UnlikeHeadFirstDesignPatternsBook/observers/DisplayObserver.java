package com.practise.surya_practise.LLD.design_patterns.behavioural._3observer.weather_station.UnlikeHeadFirstDesignPatternsBook.observers;

import com.practise.surya_practise.LLD.design_patterns.behavioural._3observer.weather_station.UnlikeHeadFirstDesignPatternsBook.observables.WeatherStation;

public interface DisplayObserver
{
    void update(WeatherStation observer);
}
