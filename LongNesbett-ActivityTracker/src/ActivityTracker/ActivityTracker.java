package ActivityTracker;
import ActivityTracker.Controllers.HomeController;
import ActivityTracker.Models.User;

import java.io.FileInputStream;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class ActivityTracker extends Application {

    @Override
    public void start(Stage stage) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("Views/Stage.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


    public static void main(String[] args) {
        launch(args);
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