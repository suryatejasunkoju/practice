package com.practise.surya_practise.LLD.design_patterns.behavioural._3observer.weather_station.LikeHeadFirstDesignPatternsBook;



import com.practise.surya_practise.LLD.design_patterns.behavioural._3observer.weather_station.LikeHeadFirstDesignPatternsBook.observables.WeatherObservable;
import com.practise.surya_practise.LLD.design_patterns.behavioural._3observer.weather_station.LikeHeadFirstDesignPatternsBook.observables.WeatherStation;
import com.practise.surya_practise.LLD.design_patterns.behavioural._3observer.weather_station.LikeHeadFirstDesignPatternsBook.observers.MobileDisplay;
import com.practise.surya_practise.LLD.design_patterns.behavioural._3observer.weather_station.LikeHeadFirstDesignPatternsBook.observers.TVDisplay;

public class ObserverLikeHeadFirstDesignPatterns
{
    public static void run()
    {
        WeatherObservable observable=new WeatherStation();
        observable.registerObserver(new MobileDisplay(observable));
        observable.registerObserver(new TVDisplay(observable));

        observable.setTemperature(12.23F);

    }
}
