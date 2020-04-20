package ActivityTracker.Extensions;

import ActivityTracker.ActivityTracker;
import ActivityTracker.Controllers.HomeController;
import ActivityTracker.Controllers.ProfileController;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.net.URL;

public class Navigator {
    private Pane view;

    public Pane getScene(String fileName) {
        try {
            URL fileUrl = ActivityTracker.class.getResource("/ActivityTracker/Views/" + fileName + ".fxml");
            if (fileUrl == null) {
                throw new java.io.FileNotFoundException("FXML File cannot be found");
            }
            view = new FXMLLoader().load(fileUrl);

        } catch (Exception e) {
            System.out.print("No page " + fileName + " please check FXMLLoader");
        }
        return view;
    }
}