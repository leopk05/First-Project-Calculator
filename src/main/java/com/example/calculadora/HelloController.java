package com.example.calculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.lang.Integer.parseInt;


public class HelloController {

    @FXML
    public Button buttonFive;
    @FXML
    public Button buttonFour;
    @FXML
    public Button buttonSix;
    @FXML
    public Button buttonNine;
    @FXML
    public Button buttonEight;
    @FXML
    public Button buttonSeven;
    @FXML
    public Button buttonZero;
    @FXML
    public Button buttonComa;
    @FXML
    public Button ButtonErase;
    @FXML
    public Button buttonBack;
    @FXML
    public Button buttonSplit;
    @FXML
    public Button buttonClear;
    @FXML
    public Button buttonTwo;
    @FXML
    public Button buttonCancel;
    @FXML
    public Button buttonPlus;
    @FXML
    public Button buttonMinus;
    @FXML
    public Button buttonTime;
    @FXML
    public Button buttonEqual;
    @FXML
    public TextField lowerDisplay;
    @FXML
    public TextField upperDisplay;
    @FXML
    private Button perButton;
    @FXML
    private Button buttonOne;
    @FXML
    private Button buttonThree;


    private void initialize(){


    }

    public void plusCalc(ActionEvent actionEvent){
        double result = 0;
        if (lowerDisplay.getLength() != 0){
            if (upperDisplay.getLength() == 0){
                upperDisplay.setText(lowerDisplay.getText() + " +");
                lowerDisplay.clear();
            } else {
                double upperIntNumber = Double.parseDouble(symbolRemover(upperDisplay.getText()));
                double lowerIntNumber = Double.parseDouble(lowerDisplay.getText());
                result += upperIntNumber;
                result += lowerIntNumber;
                if (String.valueOf(result).endsWith(".0")){
                    upperDisplay.setText(Math.round(result) + " +");
                } else {
                    upperDisplay.setText(result + " +");
                }
                lowerDisplay.clear();
            }
        }
    }


    public void minusCal(ActionEvent actionEvent){
        double result = 0;
        if (lowerDisplay.getLength() != 0){
            if (upperDisplay.getLength() == 0){
                upperDisplay.setText(lowerDisplay.getText() + " -");
                lowerDisplay.clear();
            } else {
                double upperIntNumber = Double.parseDouble(symbolRemover(upperDisplay.getText()));
                double lowerIntNumber = Double.parseDouble(lowerDisplay.getText());
                result += upperIntNumber;
                result -= lowerIntNumber;
                if (String.valueOf(result).endsWith(".0")){
                    upperDisplay.setText(Math.round(result) + " -");
                } else {
                    upperDisplay.setText(result + " -");
                }
                lowerDisplay.clear();
            }
        }
    }




    public void buttonOneAction(ActionEvent actionEvent) {
        String before = lowerDisplay.getText();
        if (before.length() < 9){
            lowerDisplay.setText(before + 1);
        } else {
            lowerDisplay.setText(before + "");
        }
    }

    public void buttonTwoAction(ActionEvent actionEvent) {
        String before = lowerDisplay.getText();
        if (before.length() < 9){
            lowerDisplay.setText(before + 2);
        } else {
            lowerDisplay.setText(before + "");
        }
    }

    public void buttonThreeAction(ActionEvent actionEvent) {
        String before = lowerDisplay.getText();
        if (before.length() < 9){
            lowerDisplay.setText(before + 3);
        } else {
            lowerDisplay.setText(before + "");
        }
    }

    public void buttonFourAction(ActionEvent actionEvent) {
        String before = lowerDisplay.getText();
        if (before.length() < 9){
            lowerDisplay.setText(before + 4);
        } else {
            lowerDisplay.setText(before + "");
        }
    }

    public void buttonFiveAction(ActionEvent actionEvent) {
        String before = lowerDisplay.getText();
        if (before.length() < 9){
            lowerDisplay.setText(before + 5);
        } else {
            lowerDisplay.setText(before + "");
        }
    }

    public void buttonSixAction(ActionEvent actionEvent) {
        String before = lowerDisplay.getText();
        if (before.length() < 9){
            lowerDisplay.setText(before + 6);
        } else {
            lowerDisplay.setText(before + "");
        }
    }

    public void buttonSevenAction(ActionEvent actionEvent) {
        String before = lowerDisplay.getText();
        if (before.length() < 9){
            lowerDisplay.setText(before + 7);
        } else {
            lowerDisplay.setText(before + "");
        }
    }

    public void buttonEightAction(ActionEvent actionEvent) {
        String before = lowerDisplay.getText();
        if (before.length() < 9){
            lowerDisplay.setText(before + 8);
        } else {
            lowerDisplay.setText(before + "");
        }
    }

    public void buttonNineAction(ActionEvent actionEvent) {
        String before = lowerDisplay.getText();
        if (before.length() < 9){
            lowerDisplay.setText(before + 9);
        } else {
            lowerDisplay.setText(before + "");
        }
    }

    public void buttonZeroAction(ActionEvent actionEvent){
        String before = lowerDisplay.getText();
        if (before.length() < 9){
            lowerDisplay.setText(before + 0);
        } else {
            lowerDisplay.setText(before + "");

        }
    }

    public void buttonComaAction(ActionEvent actionEvent){
        String before = lowerDisplay.getText();
        if (before.length() < 8){
            if (before.contains(".")){
                lowerDisplay.setText(before + "");
            } else {
                lowerDisplay.setText(before + ".");
            }

        } else {
            lowerDisplay.setText(before + "");
        }
    }

    public String symbolRemover (String text){
        List<String> array = new ArrayList<>(List.of(text.split("")));
        array.removeIf(a -> Objects.equals(a, "+") || Objects.equals(a, "-") || Objects.equals(a, "=")|| Objects.equals(a, " ") || Objects.equals(a, "/") || Objects.equals(a, "*") || Objects.equals(a, "%"));
        String result = String.join("", array);
        return result;
    }


    public void buttonEraseAction(ActionEvent actionEvent) {
        lowerDisplay.clear();
        upperDisplay.clear();
    }
}