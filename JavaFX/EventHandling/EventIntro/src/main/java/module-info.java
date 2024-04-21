module com.kunjeshramani.eventintro {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.kunjeshramani.eventintro to javafx.fxml;
    exports com.kunjeshramani.eventintro;
}