package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/*
Termonology:
Stage - Entierty of the screen
Scene - Area within the stage where objects are placed
Layout - How you want everything arranged on your screen
 */

public class Main extends Application {

    Button button;

    // When applciation runs, launch will be called and set everything up
    // from Application. Start will then be called
    public static void main(String args[]) {
        launch(args);
    }


    // Main javaFX code
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("This is the title!");

        button = new Button();
        button.setText("Click Me!");

        // Creating a layout for out objects
        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        // The objects in the scene will be arranged b y the layout we choose
        Scene scene = new Scene(layout, 300, 300);
        primaryStage.setScene(scene);
    }

}
