package ActivityTracker.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;

public class WeatherController implements Initializable {


    @FXML
    private Pane Weather;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setUpView();
        System.out.println("You have made it to the weather controller");

    }

    public void setUpView() {

        // Apply the gradient to the background
        Stop[] stops = { new Stop(0, Color.rgb(45,45,45)), new Stop(1, Color.rgb(8,8,8))};
        LinearGradient lg = new LinearGradient(0, 1, 0, 0, true, CycleMethod.NO_CYCLE, stops);

        BackgroundFill bgFill = new BackgroundFill(lg, CornerRadii.EMPTY, Insets.EMPTY);
        Weather.setBackground(new Background(bgFill));


    }
}