module FxLearnDemo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    //requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    //requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.sql;
    requires mysql.connector.java;

    exports FxLearnDemo;
    opens FxLearnDemo to javafx.fxml;

    exports FxLearnDemo.HelloDemo;
    opens FxLearnDemo.HelloDemo to javafx.fxml;

    exports FxLearnDemo.LoginDemo;
    opens FxLearnDemo.LoginDemo to javafx.fxml;

    exports FxLearnDemo.MenuMain;
    opens FxLearnDemo.MenuMain to javafx.fxml;

    exports FxLearnDemo.RegisterDemo;
    opens FxLearnDemo.RegisterDemo to javafx.fxml;

}
