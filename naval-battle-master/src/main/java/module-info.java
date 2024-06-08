module org.example.navalbatlle {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens org.example.navalbattle to javafx.fxml;
    opens org.example.navalbattle.controller to javafx.fxml;
    exports org.example.navalbattle;
    exports org.example.navalbattle.controller;
    exports org.example.navalbattle.model;
    opens org.example.navalbattle.model to javafx.fxml;
    exports org.example.navalbattle.view;
    opens org.example.navalbattle.view to javafx.fxml;
}