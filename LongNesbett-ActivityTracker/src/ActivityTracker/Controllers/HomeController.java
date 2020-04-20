package ActivityTracker.Controllers;

import ActivityTracker.ActivityTracker;
import ActivityTracker.Extensions.Layout;
import java.net.URL;
import java.util.ResourceBundle;

import ActivityTracker.Models.Clock;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;



public class HomeController implements Initializable {




    @FXML
    private Pane Home;
    @FXML
    private Label clockLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Layout.setUpView(Home);
        clockLabel.setText(ActivityTracker.clock.getTime());
        System.out.println("You have made it to the home controller");

    }
}