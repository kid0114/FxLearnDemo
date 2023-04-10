package FxLearnDemo.LoginDemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;


import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class LoginController implements Initializable{
    @FXML
    private Button lo_login;
    @FXML
    private Button lo_register;
    @FXML
    private Button lo_forget;
    @FXML
    private Button lo_exit;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //double height=anchorPane0.getHeight()/anchorPane0.getPrefHeight();
        //double wid=anchorPane0.getWidth()/anchorPane0.getPrefWidth();
    }
    public void BindHeightWidth(Objects h, Parent pane){

    }


    public void initialize(ActionEvent actionEvent) {
    }
}
