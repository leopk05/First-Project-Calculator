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

    public void plusCalc(ActionEvent actionEvent) {
        actionEvent.isConsumed();
        if (isLowerEmpty() && upperDisplay.getText().lastIndexOf("-") > 0 || upperDisplay.getText().lastIndexOf("*") > 0 || upperDisplay.getText().lastIndexOf("/") > 0) {
            checkZero(getUpperNumber(), "+");
        } else {
            try {
                if (upperDisplay.getText().lastIndexOf("-") > 0) {
                    checkZero((calculator(getUpperNumber(), getLowerNumber(), "-")), " +");
                    lowerDisplay.clear();
                } else if (upperDisplay.getText().lastIndexOf("*") > 0) {
                    checkZero((calculator(getUpperNumber(), getLowerNumber(), "*")), " +");
                } else if (upperDisplay.getText().lastIndexOf("/") > 0) {
                    checkZero((calculator(getUpperNumber(), getLowerNumber(), "/")), " +");
                } else {
                    double result;
                    if (!isLowerEmpty()) {
                        if (isUpperEmpty()) {
                            checkZero(getLowerNumber(), " +");
                            lowerDisplay.clear();
                        } else {
                            result = calculator(getUpperNumber(), getLowerNumber(), "+");
                            checkZero(result, " +");
                            lowerDisplay.clear();
                        }
                    }
                }
            } catch (RuntimeException ignored) {

            }
        }
    }


    public void minusCal(ActionEvent actionEvent) {
        double result;
        if (!isLowerEmpty()){
            if (isUpperEmpty()){
                checkZero(getLowerNumber(), " -");
                lowerDisplay.clear();
            } else {
                result = calculator(getUpperNumber(), getLowerNumber(), "-");
                checkZero(result, " -");
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

    private double getLowerNumber(){
        String removed = symbolRemover(lowerDisplay.getText());
        int index = lowerDisplay.getText().indexOf("-");
        if (index == 0){
            return getLowerNegativeNumber();
        } else {

            return Double.parseDouble(removed);
        }

    }

    private double getUpperNumber(){
        String removed = symbolRemover(upperDisplay.getText());
        int index = upperDisplay.getText().indexOf("-");
        if (index == 0){
            return Double.parseDouble(removed) * -1;
        }
        return Double.parseDouble(removed);
    }

    private double getLowerNegativeNumber(){
        String removed = symbolRemover(lowerDisplay.getText());
        return Double.parseDouble(removed) * -1;
    }

    private void setUpperDisplay(double number, String operator){
        upperDisplay.setText(String.valueOf(number) + operator);
    }

    private boolean isLowerEmpty(){
        if (lowerDisplay.getLength() == 0){
            return true; // if empty return true
        } else return false;
    }

    private boolean isUpperEmpty(){
        if (upperDisplay.getLength() == 0){
            return true; // if empty return true
        } else return false;
    }

    private void checkZero(double result, String operator){
        if (String.valueOf(result).endsWith(".0")){
            upperDisplay.setText(Math.round(result) + operator);
        } else {
            upperDisplay.setText(result + operator);
        }
    }


    public double calculator(double a, double b, String operator){
        if (Objects.equals(operator, "-")){
            return a-b;
        }
        if (Objects.equals(operator, "+")){
            return a+b;
        }
        if (Objects.equals(operator, "*")){
            return a*b;
        }
            return a/b;

    }

}