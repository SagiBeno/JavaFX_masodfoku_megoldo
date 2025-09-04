package com.example.masodfoku;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MasodfokController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}