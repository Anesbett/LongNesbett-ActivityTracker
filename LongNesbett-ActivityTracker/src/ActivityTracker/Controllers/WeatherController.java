package ActivityTracker.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import ActivityTracker.Custom.Layout;
import ActivityTracker.Custom.WeatherData;

import javafx.scene.layout.Pane;

public class WeatherController implements Initializable {


    @FXML
    private Pane Weather;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Layout.setUpView(Weather);
        WeatherData.getWeatherData();
        System.out.println("You have made it to the weather controller");

    }
}