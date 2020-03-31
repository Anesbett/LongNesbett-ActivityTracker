package ActivityTracker.Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import ActivityTracker.Extensions.Layout;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;

public class SettingsController implements Initializable {

    @FXML
    private Pane Settings;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Layout.setUpView(Settings);
        System.out.println("You have made it to the settings controller");

    }
}