package ActivityTracker.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import ActivityTracker.ActivityTracker;
import ActivityTracker.Extensions.Layout;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javafx.scene.control.TextField;

public class SettingsController implements Initializable {

    @FXML
    private Pane Settings;
    @FXML
    private Label clockLabel;
    @FXML
    private Label weightLabel;
    @FXML
    private Label ageLabel;
    @FXML
    private Label heightLabel;
    @FXML
    private TextField goalTextField;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Layout.setUpView(Settings);
        clockLabel.setText(ActivityTracker.clock.getTime());
        weightLabel.setText(ActivityTracker.user.getUsersWeight().toString());
        ageLabel.setText(ActivityTracker.user.getUsersAge().toString());
        heightLabel.setText(ActivityTracker.user.getUsersHeight().toString());
        System.out.println("You have made it to the settings controller");
        goalTextField.setText(ActivityTracker.user.getUsersGoal());

    }

    @FXML
    private void updateGoal(){
        ActivityTracker.user.setUsersGoal(goalTextField.getText());
    }

    @FXML
    private void clockLeft(){
        ActivityTracker.clock.minusOne();
        clockLabel.setText(ActivityTracker.clock.getTime());
    }
    @FXML
    private void clockRight(){
        ActivityTracker.clock.addOne();
        clockLabel.setText(ActivityTracker.clock.getTime());
    }
    @FXML
    private void ageLeft(){
        ActivityTracker.user.setUsersAge(ActivityTracker.user.getUsersAge() - 1);
        ageLabel.setText(ActivityTracker.user.getUsersAge().toString());
    }
    @FXML
    private void ageRight(){
        ActivityTracker.user.setUsersAge(ActivityTracker.user.getUsersAge() + 1);
        ageLabel.setText(ActivityTracker.user.getUsersAge().toString());
    }
    @FXML
    private void weightRight(){
        ActivityTracker.user.setUsersWeight(ActivityTracker.user.getUsersWeight() + 1);
        weightLabel.setText(ActivityTracker.user.getUsersWeight().toString());
    }
    @FXML
    private void weightLeft(){
        ActivityTracker.user.setUsersWeight(ActivityTracker.user.getUsersWeight() - 1);
        weightLabel.setText(ActivityTracker.user.getUsersWeight().toString());
    }
    @FXML
    private void heightLeft(){
        ActivityTracker.user.setUsersHeight(ActivityTracker.user.getUsersHeight() - 1);
        heightLabel.setText(ActivityTracker.user.getUsersHeight().toString());
    }
    @FXML
    private void heightRight(){
        ActivityTracker.user.setUsersHeight(ActivityTracker.user.getUsersHeight() + 1);
        heightLabel.setText(ActivityTracker.user.getUsersHeight().toString());
    }
}