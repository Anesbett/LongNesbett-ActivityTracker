package ActivityTracker;
<<<<<<< HEAD
import ActivityTracker.Models.User;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

//package ActivityTracker.Views;
import javafx.scene.Parent;


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
=======

import ActivityTracker.Models.User;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.util.logging.Level;
import java.util.logging.Logger;


public class ActivityTracker extends Application {
>>>>>>> my-temp-work

    public static void main(String[] args) {
        launch(args);
    }

    @Override
<<<<<<< HEAD
    public void start(Stage stage) throws IOException
    {
        /* Create the FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        // Path to the FXML File
        String fxmlDocPath = "../ActivityTracker.fxml/Home.ActivityTracker.fxml";
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
        */
        Parent root = FXMLLoader.load(getClass().getResource("Views/Home.fxml"));

        Scene scene = new Scene(root, 300, 275);

        stage.setTitle("FXML Welcome");
        stage.setScene(scene);
        stage.show();
    }



=======
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(ActivityTracker.class.getResource("Views/Stage.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setResizable(false);
            primaryStage.setTitle("Activity Tracker");
            primaryStage.show();
        } catch (Exception ex) {
            Logger.getLogger(ActivityTracker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
>>>>>>> my-temp-work

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