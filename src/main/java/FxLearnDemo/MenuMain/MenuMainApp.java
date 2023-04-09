package FxLearnDemo.MenuMain;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuMainApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader=new FXMLLoader(MenuMainApp.class.getResource("Menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 900, 600);
        stage.setTitle("Menu");
        stage.setResizable(false);//自适应比较麻烦 暂时先这样
        stage.setScene(scene);
        stage.show();


    }
}
