module com.kunjeshramani.bindingproperty {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kunjeshramani.bindingproperty to javafx.fxml;
    exports com.kunjeshramani.bindingproperty;
}