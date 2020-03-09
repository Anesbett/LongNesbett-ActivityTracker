package ActivityTracker.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import ActivityTracker.ActivityTracker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;


public class HomeController implements Initializable {


    //@FXML // fx:id="usernameField"
    //private TextField usernameField; // Value injected by FXMLLoader

    @FXML
    private Label label; // Value injected by FXMLLoader

    @FXML
    private BorderPane mainStage; // Value injected by FXMLLoader

    @FXML
    private void displayHomeScene(ActionEvent event) {
        System.out.println("You clicked me");
        NavigationController object = new NavigationController();
        Pane view = object.getPage("Home");
        mainStage.setCenter(view);
    }

    @FXML
    private void displayProfileScene(ActionEvent event) {
        System.out.println("You clicked me");
        NavigationController object = new NavigationController();
        Pane view = object.getPage("Profile");
        mainStage.setCenter(view);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        /*
        assert loginButton != null : "fx:id=\"loginButton\" was not injected: check your FXML file 'LoginGUI.fxml'.";
        assert newUserButton != null : "fx:id=\"newUserButton\" was not injected: check your FXML file 'LoginGUI.fxml'.";
        assert passwordField != null : "fx:id=\"passwordField\" was not injected: check your FXML file 'LoginGUI.fxml'.";
        assert usernameField != null : "fx:id=\"usernameField\" was not injected: check your FXML file 'LoginGUI.fxml'.";


        //The button event for the login button
        loginButton.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent e)   {
                System.out.println("This button works");
            }
        });
        */
    }
}