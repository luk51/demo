package com.example.demo;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());

    @FXML
    private Label welcomeText;
    @FXML
    private Label cell_00;
    @FXML
    private Label cell_01;
    @FXML
    private Label cell_02;
    @FXML
    private Label cell_03;
    @FXML
    private Label cell_04;
    @FXML
    private Label cell_05;
    @FXML
    private Label cell_06;
    @FXML
    private Label cell_07;
    @FXML
    private Label cell_08;
    @FXML
    private Label cell_09;
    @FXML
    private Label cell_10;
    @FXML
    private Label cell_11;
    @FXML
    private Label cell_12;
    @FXML
    private Label cell_13;
    @FXML
    private Label cell_14;
    @FXML
    private Label cell_15;
    @FXML
    private Label cell_16;
    @FXML
    private Label cell_17;
    @FXML
    private Label cell_18;
    @FXML
    private Label cell_19;
    @FXML
    private Label cell_20;
    @FXML
    private Label cell_21;
    @FXML
    private Label cell_22;
    @FXML
    private Label cell_23;
    @FXML
    private Label cell_24;
    @FXML
    private Label cell_25;
    @FXML
    private Label cell_26;
    @FXML
    private Label cell_27;
    @FXML
    private Label cell_28;
    @FXML
    private Label cell_29;

    int counter = 0;
    List<Label> cells = new ArrayList<Label>();

    @FXML
    protected void onRootVBoxPressed(KeyEvent key) {
        String keyText = key.getCode().getName();
        logger.info("das ist keytext: " + keyText);
        if (keyText.equals("Backspace")) {
            // do nothing
            logger.info("es wurde backspace gedrückt");
            if (counter > 0) {
                counter--;
                for (int i = 0; i < 30; i++) {
                    cells.get(i).setStyle("""
                                          -fx-font-size: 30;
                                                    -fx-alignment: center;
                                                    -fx-text-alignment: center;
                                                    -fx-pref-column-count: 3;
                                                    -fx-pref-row-count: 3;
                                                    -fx-border-color:black;
                                                    -fx-border-width: 1;
                                                    -fx-border-style: solid;
                                                    -fx-min-height: 48;
                                                    -fx-min-width: 48;
                            -fx-background-color: yellow;
                            """);
                }
                Label currentCell = cells.get(counter);
                currentCell.setText("");
                currentCell.setStyle(currentCell.getStyle() + " -fx-background-color: blue");
            }
        }
        else {
            if (counter < 30) {


                for (int i = 0; i < 30; i++) {
                    cells.get(i).setStyle("""
                                          -fx-font-size: 30;
                                                    -fx-alignment: center;
                                                    -fx-text-alignment: center;
                                                    -fx-pref-column-count: 3;
                                                    -fx-pref-row-count: 3;
                                                    -fx-border-color:black;
                                                    -fx-border-width: 1;
                                                    -fx-border-style: solid;
                                                    -fx-min-height: 48;
                                                    -fx-min-width: 48;
                            -fx-background-color: yellow;
                            """);
                }
                Label currentCell = cells.get(counter);
                currentCell.setText(key.getText());
                if (counter < 29) {
                    Label nextCell = cells.get(counter + 1);
                    nextCell.setStyle(currentCell.getStyle() + " -fx-background-color: blue");
                }
                counter++;
            }
        }
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        cells.add(cell_00);
        cells.add(cell_01);
        cells.add(cell_02);
        cells.add(cell_03);
        cells.add(cell_04);
        cells.add(cell_05);
        cells.add(cell_06);
        cells.add(cell_07);
        cells.add(cell_08);
        cells.add(cell_09);
        cells.add(cell_10);
        cells.add(cell_11);
        cells.add(cell_12);
        cells.add(cell_13);
        cells.add(cell_14);
        cells.add(cell_15);
        cells.add(cell_16);
        cells.add(cell_17);
        cells.add(cell_18);
        cells.add(cell_19);
        cells.add(cell_20);
        cells.add(cell_21);
        cells.add(cell_22);
        cells.add(cell_23);
        cells.add(cell_24);
        cells.add(cell_25);
        cells.add(cell_26);
        cells.add(cell_27);
        cells.add(cell_28);
        cells.add(cell_29);

        for (int i = 0; i < 30; i++) {
            Label currentCell = cells.get(i);
            currentCell.setStyle(currentCell.getStyle() + " -fx-background-color: yellow");
        }
        counter = 0;
        String cellStyle = cell_00.getStyle();
        cell_00.setStyle("""
                     -fx-font-size: 30;
                                                            -fx-alignment: center;
                                                            -fx-text-alignment: center;
                                                            -fx-pref-column-count: 3;
                                                            -fx-pref-row-count: 3;
                                                            -fx-border-color:black;
                                                            -fx-border-width: 1;
                                                            -fx-border-style: solid;
                                                            -fx-min-height: 48;
                                                            -fx-min-width: 48;
                                                            -fx-background-color: blue

                """);



    }
}