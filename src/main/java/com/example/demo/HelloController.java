package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    java.util.logging.Logger logger = java.util.logging.Logger.getLogger(this.getClass().getName());

    static final String styleCell = """
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
            """;

    private final static String styleYellow = styleCell + "-fx-background-color: yellow";
    private static final String styleBlue = styleCell + "-fx-background-color: blue";
    private static final String styleLightBlue = styleCell + "-fx-background-color: aqua";

    private static final String getStyleCellGrey = styleCell + "-fx-background-color: grey";
    private static final String getStyleCellGreen = styleCell + "-fx-background-color: green";
    private static final String getStyleCellRed = styleCell + "-fx-background-color: red";


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
    boolean freeze;
    String word = "hello";

    @FXML
    protected void onRootVBoxKeyPressed(KeyEvent key) {

        String keyText = key.getCode().getName();
        logger.info("keytext: " + keyText);
        if (keyText.equals("Enter") && freeze) {
                freeze = false;
                for (int i = counter - 5; i < counter; i++) {
                    cells.get(i).setStyle(getStyleCellGrey);
                }
        }
        else if (keyText.equals("Backspace")) {
            if (counter > 0 && counter % 5 != 0 || counter > 0 && freeze) {
                counter--;
                renderColors();
                freeze = false;
            }

            Label currentCell = cells.get(counter);
            if (currentCell != null) {
                currentCell.setText("");
            }

        } else if (counter < 30 && !freeze) {
            Label currentCell = cells.get(counter);
            currentCell.setText(key.getText());
            counter++;
            renderColors();
            if (counter > 0 && counter % 5 == 0) {
                freeze = true;
            }
        }


    }

    private void renderColors() {
        logger.info("rendering at cellnum " + counter);
        // yellow
        cells.forEach(cell -> {
            cell.setStyle(styleYellow);
        });
        // light blue
        if (counter >= 0 && counter <= 4) {
            for (int i = 0; i < 5; i++) {
                cells.get(0 + i).setStyle(styleLightBlue);
            }
        } else if (counter >= 5 && counter <= 9) {
            for (int i = 0; i < 5; i++) {
                cells.get(5 + i).setStyle(styleLightBlue);
            }
        } else if (counter >= 10 && counter <= 14) {
            for (int i = 0; i < 5; i++) {
                cells.get(10 + i).setStyle(styleLightBlue);
            }
        } else if (counter >= 15 && counter <= 19) {
            for (int i = 0; i < 5; i++) {
                cells.get(15 + i).setStyle(styleLightBlue);
            }
        } else if (counter >= 20 && counter <= 24) {
            for (int i = 0; i < 5; i++) {
                cells.get(20 + i).setStyle(styleLightBlue);
            }
        } else if (counter >= 25 && counter <= 29) {
            for (int i = 0; i < 5; i++) {
                cells.get(25 + i).setStyle(styleLightBlue);
            }
        }
        // blue
        try {
            cells.get(counter).setStyle(styleBlue);
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            logger.info("there is no label with that number " + counter);
            logger.info("exception: " + indexOutOfBoundsException.toString());
        }
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

        counter = 0;
        renderColors();
    }
}