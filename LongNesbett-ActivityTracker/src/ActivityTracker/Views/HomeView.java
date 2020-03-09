package ActivityTracker.Views;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class HomeView {

    // The view will be where we assign out users values to objects
    public void printUserDetailsss(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();

    }

    public void printUserDetails(String userName, Integer userAge, Integer userWeight, Integer userHeight, String userGoal){
        System.out.println("Name: " + userName);
        System.out.println("User Age: " + userAge);
        System.out.println("User Weight: " + userWeight);
        System.out.println("User Height: " + userHeight + " inches");
        System.out.println("User Goal: " + userGoal);
    }
}