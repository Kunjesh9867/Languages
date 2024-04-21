module com.kunjeshramani.observable {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kunjeshramani.observable to javafx.fxml;
    exports com.kunjeshramani.observable;
}