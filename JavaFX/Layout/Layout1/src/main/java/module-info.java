module com.kunjeshramani.layout1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kunjeshramani.layout1 to javafx.fxml;
    exports com.kunjeshramani.layout1;
}