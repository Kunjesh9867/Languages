package com.kunjeshramani.observable;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private Label label;

    @FXML
    void initialize() {
        name();

    }

    public void name(){
        // List that can acts as observable
        ObservableList<String> list = FXCollections.observableArrayList("one", "two", "three");
    }
}