package ActivityTracker;
import ActivityTracker.Controllers.HomeController;
import ActivityTracker.Models.User;
import ActivityTracker.Views.HomeView;

import java.io.FileInputStream;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class ActivityTracker extends Application {
    public static void main(String[] args) {
        Application.launch(args);
        // Retrieve users stats based on values assigned
        // model  = retriveUserInformation();

        // Create a view to write user details on scene
        //HomeView view = new HomeView();

        //HomeController controller = new HomeController(model, view);

        // The controllers view must be updated in order to reflect the changes
        //controller.updateView();

        // Update the models data
        //controller.setUsersName("John");

        //controller.updateView();
    }

    @Override
    public void start(Stage stage) throws IOException
    {
        // Create the FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        // Path to the FXML File
        String fxmlDocPath = "../fxml/Home.fxml";
        FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);

        // Create the Pane and all Details
        VBox root = (VBox) loader.load(fxmlStream);

        // Create the Scene
        Scene scene = new Scene(root);
        // Set the Scene to the Stage
        stage.setScene(scene);
        // Set the Title to the Stage
        stage.setTitle("A simple FXML Example");
        // Display the Stage
        stage.show();
    }




    /**
     * This functon assigns values to the users in order to show the flow of our MVC Pattern
     * @return  User  the function returns an object User with the assigned values
     */
    private static User retriveUserInformation(){
        User user = new User();
        user.setUsersName("Robert");
        user.setUsersAge(27);
        user.setUsersWeight(225);
        user.setUsersHeight(78);
        user.setUsersGoal("I want to stop being fat.");
        return user;
    }
}