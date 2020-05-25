module hu.unideb.inf {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.persistence;
    requires lombok;

    opens hu.unideb.inf to javafx.fxml;
    exports hu.unideb.inf;
}