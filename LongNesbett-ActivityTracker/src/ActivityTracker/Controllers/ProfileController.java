package ActivityTracker.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import ActivityTracker.ActivityTracker;
import ActivityTracker.Extensions.Layout;

import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;

public class ProfileController implements Initializable {

    @FXML
    private Pane Profile;
    @FXML
    private Label stepLabel;
    @FXML
    private Label calorieLabel;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ActivityTracker.user.setHeartRate(ActivityTracker.heartRateMonitor.getHeartRate());
        System.out.println(ActivityTracker.user.getHeartRate());
        Layout.setUpView(Profile);
        System.out.println("You have made it to the profile controller");
        String steps = ActivityTracker.user.getUsersStepCount().toString();
        stepLabel.setText(steps);
        calorieLabel.setText(ActivityTracker.user.getUsersCalorieCount(steps).toString());



    }
}