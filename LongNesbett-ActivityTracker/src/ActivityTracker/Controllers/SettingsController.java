package ActivityTracker.Controllers;
import java.net.URL;
import java.util.ResourceBundle;
import ActivityTracker.ActivityTracker;
import ActivityTracker.Extensions.Layout;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;


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

    /**
     * Method that updates goal text
     */
    @FXML
    private void updateGoal(){
        ActivityTracker.user.setUsersGoal(goalTextField.getText());
    }

    /**
     * Method that subtracts 1 minute to current time and updates text
     */
    @FXML
    private void clockLeft(){
        ActivityTracker.clock.minusOne();
        clockLabel.setText(ActivityTracker.clock.getTime());
    }

    /**
     * Method that adds 1 minute to current time and updates text
     */
    @FXML
    private void clockRight(){
        ActivityTracker.clock.addOne();
        clockLabel.setText(ActivityTracker.clock.getTime());
    }

    /**
     * Method that subtracts 1 to current user's age and updates text
     * Input validation requires input to be greater than 0
     */
    @FXML
    private void ageLeft(){
        if (ActivityTracker.user.getUsersAge() <= 0){
            ageLabel.setText("0");
        }
        else {
            ActivityTracker.user.setUsersAge(ActivityTracker.user.getUsersAge() - 1);
            ageLabel.setText(ActivityTracker.user.getUsersAge().toString());
        }
    }

    /**
     * Method that adds 1 to current user's age and updates text
     * Input validation requires input to be less than or equal to 116
     */
    @FXML
    private void ageRight(){
        if (ActivityTracker.user.getUsersAge() >= 116){
            ageLabel.setText("116");
        }
        else {
            ActivityTracker.user.setUsersAge(ActivityTracker.user.getUsersAge() + 1);
            ageLabel.setText(ActivityTracker.user.getUsersAge().toString());
        }
    }

    /**
     * Method that adds 1 to current user's weight and updates text
     */
    @FXML
    private void weightRight(){
        ActivityTracker.user.setUsersWeight(ActivityTracker.user.getUsersWeight() + 1);
        weightLabel.setText(ActivityTracker.user.getUsersWeight().toString());
    }

    /**
     * Method that subtracts 1 to current user's weight and updates text
     * Input validation requires input to be greater than -1 pounds
     */
    @FXML
    private void weightLeft(){
        if (ActivityTracker.user.getUsersWeight() <= 0){
            weightLabel.setText("0");
        }
        else {
            ActivityTracker.user.setUsersWeight(ActivityTracker.user.getUsersWeight() - 1);
            weightLabel.setText(ActivityTracker.user.getUsersWeight().toString());
        }
    }

    /**
     * Method that subtracts 1 to current user's height and updates text
     * input validation requires input to be greater than 0 inches tall
     */
    @FXML
    private void heightLeft(){
        if (ActivityTracker.user.getUsersHeight() <= 1){
            heightLabel.setText("1");
        }
        else {
            ActivityTracker.user.setUsersHeight(ActivityTracker.user.getUsersHeight() - 1);
            heightLabel.setText(ActivityTracker.user.getUsersHeight().toString());
        }
    }

    /**
     * Method that adds 1 to current user's height and updates text
     * Input validation requires input to be less than 108 inches tall
     */
    @FXML
    private void heightRight(){
        if (ActivityTracker.user.getUsersHeight() >= 108){
            heightLabel.setText("108");
        }
        else {
            ActivityTracker.user.setUsersHeight(ActivityTracker.user.getUsersHeight() + 1);
            heightLabel.setText(ActivityTracker.user.getUsersHeight().toString());
        }
    }
}