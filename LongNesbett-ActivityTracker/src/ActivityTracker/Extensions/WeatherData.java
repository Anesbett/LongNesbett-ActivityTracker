package ActivityTracker.Extensions;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class WeatherData {
    private static HttpURLConnection connection;

    public static String getWeatherData() {
        // Try to connect to the API

        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();

        try {
            URL url = new URL("https://api.openweathermap.org/data/2.5/weather?zip=29566,us&appid=0f965a23a25240372a5631d7432a7079");
            connection = (HttpURLConnection) url.openConnection();

            // Request Setup
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            int status = connection.getResponseCode();
            //System.out.println(status);

            // If the connection error has a problem
            if (status > 299) {
                reader = new BufferedReader((new InputStreamReader(connection.getErrorStream())));
                while((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            } else {
                // The connection was successful
                reader = new BufferedReader((new InputStreamReader(connection.getInputStream())));
                while((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            connection.disconnect();
        }

        String currentWeather = parse(responseContent.toString());
        return currentWeather;
    }

    public static String getWeatherIcon(String currentWeather) {
        String iconName;
        switch(currentWeather)
        {
            case "Thunderstorm":
                iconName = "thunderstorm";
                break;
            case "Drizzle":
                iconName = "drizzle";
                break;
            case "Rain":
                iconName = "rain";
                break;
            case "Snow":
                iconName = "snow";
                break;
            case "Clouds":
                iconName = "clouds";
                break;
            case "Fog":
                iconName = "fog";
                break;
            default:
                iconName = "clear";
        }
        return iconName;
    }


<<<<<<< HEAD
    public static String parse(String responseBody) {
        JSONObject forecasts = new JSONObject(responseBody);

        JSONArray forecastArray = forecasts.getJSONArray("weather");
        String pageName = forecastArray.getJSONObject(0).getString("main");

        return pageName;
        /*
        for (int i = 0; i < forecasts.length(); i++)
        {
            forecasts.
        }
        */

        /*
        JSONArray forecasts = new JSONArray(responseBody);
        System.out.print(forecasts.length());
        for (int i = 0; i < forecasts.length(); i++) {
            JSONObject forecast = forecasts.getJSONObject(i);
            int weatherType = forecast.getInt("weather");
            System.out.println(weatherType);
        }
        */
    }
>>>>>>> 6e43b208e5df781a700c6f394039d80eb01764ad

}
