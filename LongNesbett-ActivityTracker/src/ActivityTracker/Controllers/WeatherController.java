package ActivityTracker.Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Label;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import ActivityTracker.Extensions.Layout;
import ActivityTracker.Extensions.WeatherData;

import javafx.scene.layout.Pane;
import org.json.JSONArray;
import org.json.JSONObject;

public class WeatherController implements Initializable {

    @FXML
    private Pane Weather;
    @FXML
    private Label weatherLabel;
    @FXML
    private Label tempLabel;
    @FXML
    private Label humidityLabel;
    @FXML
    private Label locationLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Layout.setUpView(Weather);
        System.out.println("You have made it to the weather controller");
        JSONObject forecast = WeatherData.getSingleForecast();

        JSONArray forecastArray = forecast.getJSONArray("weather");
        String currentWeather = forecastArray.getJSONObject(0).getString("main");
        String usersLocation = forecast.getString("name");

        JSONObject temperatureObj = forecast.getJSONObject("main");
        Double temperature = temperatureObj.getDouble("temp");
        Double humidity = temperatureObj.getDouble("humidity");

        String convertedTemp = convertTemperature(temperature);

        weatherLabel.setText(currentWeather);
        tempLabel.setText(convertedTemp);
        locationLabel.setText(usersLocation);
        humidityLabel.setText("Humidity: "+String.format("%.0f", humidity) + "%");
    }


    public String convertTemperature(Double kelvinTemp) {
        Double fer = ((kelvinTemp * 9)/5) - 459.67;
        return String.format("%.0f", fer);
    }
}