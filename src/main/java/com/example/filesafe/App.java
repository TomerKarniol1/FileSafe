package com.example.filesafe;

import com.example.filesafe.view.BoardView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        // Create the chessboard view
        BoardView boardView = new BoardView();

        // Create large buttons with inline styles
        Button encryptButton = createStyledButton("Encrypt File");
        Button decryptButton = createStyledButton("Decrypt File");
        Button initializeButton = createStyledButton("Initialize Board");

        // Arrange buttons vertically with space between them
        VBox buttonBox = new VBox(30, encryptButton, decryptButton, initializeButton);  // 30px space between buttons
        buttonBox.setStyle("-fx-padding: 50px; -fx-alignment: center;");

        // Use BorderPane to place the board and buttons
        BorderPane root = new BorderPane();
        root.setLeft(boardView);  // Board on the left
        root.setRight(buttonBox);  // Buttons on the right

        // Create the Scene and set the window size
        Scene scene = new Scene(root, 1300, 1024);

        // Set up the Stage (window)
        stage.setTitle("FileSafe: Chess PGN Encryption");
        stage.setScene(scene);
        stage.show();
    }

    // Helper method to create a large styled button with hover and click effects
    private Button createStyledButton(String text) {
        Button button = new Button(text);

        // Set the default style for the button
        button.setStyle(
                "-fx-font-size: 24px;" +            // Large font size
                        "-fx-padding: 15px 30px;" +         // Padding for larger clickable area
                        "-fx-background-color: #4CAF50;" +  // Green background
                        "-fx-text-fill: white;" +           // White text color
                        "-fx-border-radius: 10px;" +        // Rounded corners
                        "-fx-background-radius: 10px;" +    // Same background radius
                        "-fx-cursor: hand;" +               // Hand cursor on hover
                        "-fx-effect: dropshadow(gaussian, rgba(0, 0, 0, 0.25), 5, 0.3, 2, 2);"  // Shadow effect
        );

        // Add hover effect using mouse events
        button.addEventHandler(MouseEvent.MOUSE_ENTERED, e -> button.setStyle(
                "-fx-font-size: 24px;" +
                        "-fx-padding: 15px 30px;" +
                        "-fx-background-color: #45a049;" +  // Darker green on hover
                        "-fx-text-fill: white;" +
                        "-fx-border-radius: 10px;" +
                        "-fx-background-radius: 10px;" +
                        "-fx-cursor: hand;" +
                        "-fx-effect: dropshadow(gaussian, rgba(0, 0, 0, 0.3), 5, 0.5, 2, 2);"
        ));

        // Add click effect using mouse pressed event
        button.addEventHandler(MouseEvent.MOUSE_PRESSED, e -> button.setStyle(
                "-fx-font-size: 24px;" +
                        "-fx-padding: 15px 30px;" +
                        "-fx-background-color: #388E3C;" +  // Even darker green on click
                        "-fx-text-fill: white;" +
                        "-fx-border-radius: 10px;" +
                        "-fx-background-radius: 10px;" +
                        "-fx-cursor: hand;" +
                        "-fx-effect: none;"  // Remove shadow on click
        ));

        // Reset style when the mouse exits or button is released
        button.addEventHandler(MouseEvent.MOUSE_EXITED, e -> button.setStyle(
                "-fx-font-size: 24px;" +
                        "-fx-padding: 15px 30px;" +
                        "-fx-background-color: #4CAF50;" +  // Original green color
                        "-fx-text-fill: white;" +
                        "-fx-border-radius: 10px;" +
                        "-fx-background-radius: 10px;" +
                        "-fx-cursor: hand;" +
                        "-fx-effect: dropshadow(gaussian, rgba(0, 0, 0, 0.25), 5, 0.3, 2, 2);"
        ));

        return button;
    }

    public static void main(String[] args) {
        launch(args);  // Launch the JavaFX application
    }
}
