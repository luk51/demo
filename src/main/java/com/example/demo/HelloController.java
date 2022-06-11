package com.example.demo;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Label welcomeText;
    @FXML
    private Label cell_00;
    @FXML
    public void setCell_00(String letter) {
        cell_00.setText(letter);
    }
    @FXML
    protected void onRootVBoxPressed(KeyEvent key) {
        cell_00.setText(key.getText());
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cell_00.setText("S");



    }
}