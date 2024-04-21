package com.kunjeshramani.eventintro;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.awt.*;
import java.io.IOException;
import java.net.URI;

public class HelloController extends HelloApplication {
    @FXML
    private Label welcomeText;


    @FXML
    private Button button;



    @FXML
    private Label mouse;




    @FXML
    void initialize(){
        button.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> {
            welcomeText.setText("Kunjesh Ramani");
        });



        // button.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> mouseEvent.consume());
        // It suggest the runtime that the event is over and dont do anything (Dont again check for event)
    }
}