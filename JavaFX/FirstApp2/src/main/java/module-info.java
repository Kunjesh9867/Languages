module com.kunjeshramani.firstapp2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kunjeshramani.firstapp2 to javafx.fxml;
    exports com.kunjeshramani.firstapp2;
}