package ActivityTracker;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;
import ActivityTracker.Models.Clock;
import java.util.logging.Level;
import java.util.logging.Logger;
import ActivityTracker.Models.User;




public class ActivityTracker extends Application {

    public static Clock clock = new Clock();
    public static User user = new User();

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(ActivityTracker.class.getResource("Views/Stage.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setResizable(false);
            primaryStage.show();
        } catch (Exception ex) {
            Logger.getLogger(ActivityTracker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}