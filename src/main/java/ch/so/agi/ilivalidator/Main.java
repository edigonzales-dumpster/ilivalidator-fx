package ch.so.agi.ilivalidator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        initUI(primaryStage);
        
    }
    
    private void initUI(Stage stage) {
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 300, 250);
        Label lbl = new Label("Simple JavaFX application.");
        lbl.setFont(Font.font("Sans", FontWeight.NORMAL, 20));
        root.getChildren().add(lbl);

        stage.setTitle("Simple application");
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
