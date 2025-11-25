package com.practise.surya_practise.LLD.design_patterns.behavioural._3observer.weather_station.UnlikeHeadFirstDesignPatternsBook;

import com.practise.surya_practise.LLD.design_patterns.behavioural._3observer.weather_station.UnlikeHeadFirstDesignPatternsBook.observables.WeatherObservable;
import com.practise.surya_practise.LLD.design_patterns.behavioural._3observer.weather_station.UnlikeHeadFirstDesignPatternsBook.observables.WeatherStation;
import com.practise.surya_practise.LLD.design_patterns.behavioural._3observer.weather_station.UnlikeHeadFirstDesignPatternsBook.observers.MobileDisplay;
import com.practise.surya_practise.LLD.design_patterns.behavioural._3observer.weather_station.UnlikeHeadFirstDesignPatternsBook.observers.TVDisplay;

public class ObserverUnlikeHeadFirstDesignPatterns
{
    public static void run()
    {
        WeatherObservable weatherStation = new WeatherStation();
        weatherStation.registerObserver(new TVDisplay());

        MobileDisplay mobileDisplay = new MobileDisplay();
        weatherStation.registerObserver(mobileDisplay);
//		weatherStation.removeObserver(mobileDisplay);

        weatherStation.setTemperature(9.5f);
        weatherStation.setTemperature(666.5f);
    }
}
