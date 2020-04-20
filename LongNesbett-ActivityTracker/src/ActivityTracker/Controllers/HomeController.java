package ActivityTracker.Controllers;

import ActivityTracker.Extensions.Layout;
import java.net.URL;
import java.util.ResourceBundle;

import ActivityTracker.Extensions.WeatherData;
import ActivityTracker.Models.Clock;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;

import javax.swing.text.html.ImageView;


public class HomeController implements Initializable {


    //clock variables to get current local time
    private Clock currentClock = new Clock();
    private String time = currentClock.getTime();


    @FXML
    private Pane Home;
    @FXML
    private Label clockLabel;
    @FXML
    private Label weatherLabel;
    @FXML
    private ImageView weatherIcon;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Layout.setUpView(Home);
        clockLabel.setText(time);
        System.out.println("You have made it to the home controller");


        String currentForecast = WeatherData.getWeatherData();
        String weatherIconText = WeatherData.getWeatherIcon(currentForecast);
        weatherLabel.setText(currentForecast);
        System.out.println(weatherIconText);



    }
}
