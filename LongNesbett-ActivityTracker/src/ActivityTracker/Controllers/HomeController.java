package ActivityTracker.Controllers;

import ActivityTracker.Extensions.Layout;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;



public class HomeController implements Initializable {



    @FXML
    private Pane Home;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Layout.setUpView(Home);
        System.out.println("You have made it to the home controller");

    }
}