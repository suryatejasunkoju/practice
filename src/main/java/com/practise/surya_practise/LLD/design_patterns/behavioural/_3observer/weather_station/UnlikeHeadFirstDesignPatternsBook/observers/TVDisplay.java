package com.practise.surya_practise.LLD.design_patterns.behavioural._3observer.weather_station.UnlikeHeadFirstDesignPatternsBook.observers;

import com.practise.surya_practise.LLD.design_patterns.behavioural._3observer.weather_station.UnlikeHeadFirstDesignPatternsBook.observables.WeatherStation;
import lombok.ToString;

@ToString
public class TVDisplay implements DisplayObserver
{
    @Override
    public void update(WeatherStation observerable) {
        System.out.println("TV Display: Temperature updated to " + observerable.getTemperature());
    }
}
