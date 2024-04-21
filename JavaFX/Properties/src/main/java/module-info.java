module com.kunjeshramani.properties {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kunjeshramani.properties to javafx.fxml;
    exports com.kunjeshramani.properties;
}