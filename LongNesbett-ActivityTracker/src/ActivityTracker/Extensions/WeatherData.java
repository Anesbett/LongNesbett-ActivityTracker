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

    public static void getWeatherData() {
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
            System.out.println(responseContent.toString());
            //parse(responseContent.toString());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            connection.disconnect();
        }
    }


//    public static String parse(String responseBody) {
//        JSONArray forecasts = new JSONArray(responseBody);
//        for (int i = 0; i < forecasts.length(); i++) {
//            JSONObject forecast = forecasts.getJSONObject(i);
//            int weatherType = forecast.getInt("weather");
//            System.out.println(weatherType);
//        }
//        return null;
//    }

}
