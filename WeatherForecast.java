package homeTask6;
import okhttp3.*;


import java.io.IOException;

public class WeatherForecast {

    private static final String APIKEY = "uRfjsi0ZwqOxdLRDUGaXn0z9wuAeIe3c";
    private static final String q = "St.Petersburg";


    public static void main(String[] args) throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient();


        Request request = new Request.Builder()
                .url("http://dataservice.accuweather.com/forecasts/v1/daily/5day/295212?apikey=uRfjsi0ZwqOxdLRDUGaXn0z9wuAeIe3c")
                .get()
                .addHeader("accept", "application/json")
                .addHeader("X-Accuweather-API-Key", APIKEY)
                .addHeader("City", q)
                .build();

        Response response = okHttpClient.newCall(request).execute();

        String body = response.body().string();
        System.out.println(response.code());
        System.out.println(response.headers());
        System.out.println(body);

    }
}