package FxLearnDemo.HelloDemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/*
public class HelloApp2 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Button b=new Button("hello");
        b.setMaxSize(100,200);
        b.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("hello world");
            }
        });
        AnchorPane root=new AnchorPane();
        root.getChildren().add(b);
        Scene scene=new Scene(root,600,600);

        stage.setTitle("hello window");
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
*/


import javafx.scene.layout.StackPane;


public class HelloApp2 extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub
        Button btn1=new Button("Say, Hello World");
        btn1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                // TODO Auto-generated method stub
                System.out.println("hello world");
            }
        });
        btn1.setLayoutX(200);
        btn1.setLayoutY(200);

        StackPane root=new StackPane();
        root.getChildren().add(btn1);
        Scene scene=new Scene(root,600,400);
        primaryStage.setTitle("First JavaFX Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main (String[] args) {
        launch(args);
    }

}
