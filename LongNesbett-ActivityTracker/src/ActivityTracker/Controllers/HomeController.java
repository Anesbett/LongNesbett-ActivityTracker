package ActivityTracker.Controllers;

import ActivityTracker.ActivityTracker;
import ActivityTracker.Extensions.Layout;
import java.net.URL;
import java.util.ResourceBundle;

import ActivityTracker.Extensions.WeatherData;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
import org.json.JSONArray;
import org.json.JSONObject;


public class HomeController implements Initializable {

    @FXML
    private Pane Home;
    @FXML
    private Label clockLabel;
    @FXML
    private Label weatherLabel;
    @FXML
    private Label goalLabel;
    @FXML
    private ImageView weatherIcon;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Layout.setUpView(Home);
        clockLabel.setText(ActivityTracker.clock.getTime());
        System.out.println("You have made it to the home controller");

        JSONObject forecast = WeatherData.getSingleForecast();

        JSONArray forecastArray = forecast.getJSONArray("weather");
        String currentWeather = forecastArray.getJSONObject(0).getString("main");

        weatherLabel.setText(currentWeather);
        goalLabel.setText(ActivityTracker.user.getUsersGoal());
        weatherIcon.setImage(WeatherData.getWeatherIcon(currentWeather));
    }
}
