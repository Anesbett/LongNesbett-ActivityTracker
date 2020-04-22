package ActivityTracker.Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import ActivityTracker.ActivityTracker;
import ActivityTracker.Extensions.Layout;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
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
    @FXML
    private Label sleepStatus;
    @FXML
    private Label heartRate;
    @FXML
    private ImageView sleepImage;

    Image sleepyImage = new Image("ActivityTracker/Views/img/sleepy.png");
    Image awakeImage = new Image("ActivityTracker/Views/img/awake.png");


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ActivityTracker.user.setHeartRate(ActivityTracker.heartRateMonitor.getHeartRate());
        updateNewHeartRate();
        Layout.setUpView(Profile);
        System.out.println("You have made it to the profile controller");
        String steps = ActivityTracker.user.getUsersStepCount().toString();
        stepLabel.setText(steps);
        calorieLabel.setText(ActivityTracker.user.getUsersCalorieCount(steps).toString());
        alseep();
    }

    @FXML
    public void updateNewHeartRate(){
        heartRate.setText("Heart Rate: " + ActivityTracker.user.getHeartRate().toString() + "bpm");
    }

    @FXML
    public void alseep(){
        if (ActivityTracker.clock.isBedTime()){
            sleepStatus.setText("Asleep");
            sleepImage.setImage(sleepyImage);
        }
        else {
            sleepStatus.setText("Awake");
            sleepImage.setImage(awakeImage);
        }
    }
}