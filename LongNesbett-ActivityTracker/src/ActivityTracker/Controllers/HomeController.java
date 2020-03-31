package ActivityTracker.Controllers;

import ActivityTracker.Extensions.Layout;
import java.net.URL;
import java.util.ResourceBundle;

import ActivityTracker.Models.Clock;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;



public class HomeController implements Initializable {


    //clock variables to get current local time
    private Clock currentClock = new Clock();
    private String time = currentClock.getTime();


    @FXML
    private Pane Home;
    @FXML
    private Label clockLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Layout.setUpView(Home);
        clockLabel.setText(time);
        System.out.println("You have made it to the home controller");

    }
}