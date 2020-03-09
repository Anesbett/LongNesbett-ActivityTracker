package ActivityTracker.Controllers;


import ActivityTracker.ActivityTracker;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.net.URL;

public class NavigationController {
    private Pane view;

    public Pane getPage(String fileName) {
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