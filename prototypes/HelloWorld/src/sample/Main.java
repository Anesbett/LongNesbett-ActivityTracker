package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/*
TERMS:

Stage - The entire portion of the screen
Scene - The area within the stage that holds you objects
Layout - The arrangement of the objects in the scene


 */


// The Main class for a JavaFX application extends the javafx.application.Application class.

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    // The start() method is the main entry point for all JavaFX applications.
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            // Add an event handler to the button
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

        // Stackpane is the layout you choose, not too important for a simple scene of such
        StackPane root = new StackPane();
        // Add your objects to the layout
        root.getChildren().add(btn);
        // Set the scene with the layout you've created and the stage dimentions
        primaryStage.setScene(new Scene(root, 300, 250));
        // Show the stage
        primaryStage.show();

    }
}