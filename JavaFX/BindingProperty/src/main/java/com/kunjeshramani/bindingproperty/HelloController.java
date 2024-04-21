package com.kunjeshramani.bindingproperty;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField Textarea;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private TextField bidirectional1;

    @FXML
    private TextField bidirectional2;



    @FXML
    void initialize() {
        uniDirectional();
        biDirectional();

        // Once you bound, you cannot set the value


    }


    public void uniDirectional(){
        welcomeText.textProperty().bind(Textarea.textProperty());
    }

    public void biDirectional(){
        bidirectional1.textProperty().bindBidirectional(bidirectional2.textProperty());
    }

}