package ActivityTracker.Extensions;

import javafx.scene.image.Image;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class WeatherData {
    private static HttpURLConnection connection;

    public static JSONObject getSingleForecast() throws JSONException {
        // Try to connect to the API
        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();

        try {
            URL url = new URL("https://api.openweathermap.org/data/2.5/weather?zip=29401,us&appid=0f965a23a25240372a5631d7432a7079");
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


        JSONObject forecast = new JSONObject(responseContent.toString());

        return forecast;

    }

    public static Image getWeatherIcon(String currentWeather) {
        Image iconName;
        switch(currentWeather)
        {
            case "Thunderstorm":
                iconName = new Image("ActivityTracker/Views/img/thunderstorm.png");
                break;
            case "Drizzle":
                iconName = new Image("ActivityTracker/Views/img/drizzle.png");
                break;
            case "Rain":
                iconName = new Image("ActivityTracker/Views/img/rain.png");
                break;
            case "Snow":
                iconName = new Image("ActivityTracker/Views/img/snow.png");
                break;
            case "Partly":
                iconName = new Image("ActivityTracker/Views/img/partly.png");
                break;
            case "Clouds":
                iconName = new Image("ActivityTracker/Views/img/clouds.png");
                break;
            case "Fog":
                iconName = new Image("ActivityTracker/Views/img/fog.png");
                break;
            default:
                iconName = new Image("ActivityTracker/Views/img/clear.png");
        }
        return iconName;
    }
}


