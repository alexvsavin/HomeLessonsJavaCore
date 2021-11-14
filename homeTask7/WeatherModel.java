package homeTask7;

import homeTask7.entity.Weather;

import java.io.IOException;
import java.util.List;

public interface WeatherModel {
    void getWeather(String selectedCity, Period period) throws IOException;

    List<Weather> getSavedToDBWeather();

    // public List<Weather> getSavedToDBWeather();
    void getExit(Period period);


}