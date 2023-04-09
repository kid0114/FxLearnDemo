package FxLearnDemo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Welcome extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Welcome.class.getResource("Welcome.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 400);
        stage.setResizable(false);
        stage.setTitle("Welcome to XXX!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}