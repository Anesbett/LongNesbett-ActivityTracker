package ActivityTracker;

import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;



public class SceneNavigatorControl implements Initializable {

    @FXML
    public ImageView homeImageView;
    public ImageView profileImageView;
    public ImageView weatherImageView;
    public ImageView settingsImageView;

    @FXML
    private BorderPane mainStage;

    Image homeButtonSelected = new Image("ActivityTracker/Views/img/home_selected.png");
    Image homeButtonNotSelected = new Image("ActivityTracker/Views/img/home_notSelected.png");

    Image profileButtonSelected = new Image("ActivityTracker/Views/img/profile_selected.png");
    Image profileButtonNotSelected = new Image("ActivityTracker/Views/img/profile_notSelected.png");

    Image weatherButtonSelected = new Image("ActivityTracker/Views/img/weather_selected.png");
    Image weatherButtonNotSelected = new Image("ActivityTracker/Views/img/weather_notSelected.png");

    Image settingsButtonSelected = new Image("ActivityTracker/Views/img/settings_selected.png");
    Image settingsButtonNotSelected = new Image("ActivityTracker/Views/img/settings_notSelected.png");



    @FXML
    private void displayHomeScene() {
        Navigator object = new Navigator();
        Pane view = object.getScene("Home");
        handleButtonChange("Home");
        mainStage.setCenter(view);
    }

    @FXML
    private void displayProfileScene() {
        Navigator object = new Navigator();
        Pane view = object.getScene("Profile");
        handleButtonChange("Profile");
        mainStage.setCenter(view);
    }

    @FXML
    private void displayWeatherScene() {
        Navigator object = new Navigator();
        Pane view = object.getScene("Weather");
        handleButtonChange("Weather");
        mainStage.setCenter(view);
    }

    @FXML
    private void displaySettingsScene() {
        Navigator object = new Navigator();
        Pane view = object.getScene("Settings");
        handleButtonChange("Settings");
        mainStage.setCenter(view);
    }


    @FXML
    private void handleButtonChange(String option) {
        switch(option)
        {
            case "Profile":
                profileImageView.setImage(profileButtonSelected);
                homeImageView.setImage(homeButtonNotSelected);
                weatherImageView.setImage(weatherButtonNotSelected);
                settingsImageView.setImage(settingsButtonNotSelected);
                break;
            case "Weather":
                weatherImageView.setImage(weatherButtonSelected);
                profileImageView.setImage(profileButtonNotSelected);
                homeImageView.setImage(homeButtonNotSelected);
                settingsImageView.setImage(settingsButtonNotSelected);
                break;
            case "Settings":
                settingsImageView.setImage(settingsButtonSelected);
                weatherImageView.setImage(weatherButtonNotSelected);
                profileImageView.setImage(profileButtonNotSelected);
                homeImageView.setImage(homeButtonNotSelected);
                break;
            default:
                homeImageView.setImage(homeButtonSelected);
                profileImageView.setImage(profileButtonNotSelected);
                weatherImageView.setImage(weatherButtonNotSelected);
                settingsImageView.setImage(settingsButtonNotSelected);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        displayHomeScene();
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