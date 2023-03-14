package com.example.calculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
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

        // TODO: 10/03/2023
        //adicionar o metodo symbolremover (que retorna uma String) pra remover os simbolos no before antes de mandar pro formatador vai da certinho igual fiz no botão 1

    }

    public void plusCalc(ActionEvent actionEvent) {
        try{
            if (isLowerEmpty()){
                checkZeroAndSet(getUpperNumber(), "+");
            } else {
                boolean test = firstPut("+");
                previousCalc("+");
                if (!test){
                    checkZeroAndSet(calculator(getUpperNumber(), getLowerNumber(), "+"),"+");
                }
            }

        }catch (RuntimeException ignored){
        }
    }


    public void minusCal(ActionEvent actionEvent) {
        try{
            boolean test = firstPut("-");
            previousCalc("-");
            if (!test){
                checkZeroAndSet(calculator(getUpperNumber(), getLowerNumber(), "-"),"-");
            }
        }catch (RuntimeException ignored){
        }
    }

    public void times(ActionEvent actionEvent) {
        try{
            boolean test = firstPut("*");
            previousCalc("*");
            if (!test){
                checkZeroAndSet(calculator(getUpperNumber(), getLowerNumber(), "*"),"*");
            }
        }catch (RuntimeException ignored){
        }
    }

    public void equalButton(ActionEvent actionEvent) {
        ArrayList<String> last = new ArrayList<>(List.of(upperDisplay.getText().split("")));
        String operator = last.get(last.size() - 1);

        double result = calculator(getUpperNumber(), getLowerNumber(), operator);
        checkZeroAndSet(result);
    }

    public void percentage(ActionEvent actionEvent) {
        ArrayList<String> last = new ArrayList<>(List.of(upperDisplay.getText().split("")));
        String operator = last.get(last.size() - 1);

        if (!isLowerEmpty() && !isUpperEmpty()){
            double result = (getUpperNumber() * getLowerNumber()) / 100;

            checkZeroAndSet(calculator(getUpperNumber(), result, operator));
        }
    }


    public void inverter(ActionEvent actionEvent) {
        if (String.valueOf(getLowerNumber()).endsWith(".0")){
            lowerDisplay.setText(String.valueOf(Math.round(getLowerNumber() * -1)));

        } else {
            lowerDisplay.setText(String.valueOf(getLowerNumber() * -1));
        }
    }




    public void buttonOneAction(ActionEvent actionEvent) {
        String before = lowerDisplay.getText();
        if (before.length() < 9){
            before += "1";
            before = symbolRemover(before);
            before = NumberFormat.getInstance(Locale.GERMAN).format(Integer.parseInt(before));
            lowerDisplay.setText(before);
        } else {
            lowerDisplay.setText(before + "");
        }
    }

    public void buttonTwoAction(ActionEvent actionEvent) {
        String before = lowerDisplay.getText();
        if (before.length() < 9){
            before += "2";
            before = symbolRemover(before);
            before = NumberFormat.getInstance(Locale.GERMAN).format(Integer.parseInt(before));
            lowerDisplay.setText(before);
        } else {
            lowerDisplay.setText(before + "");
        }
    }

    public void buttonThreeAction(ActionEvent actionEvent) {
        String before = lowerDisplay.getText();
        if (before.length() < 9){
            before += "3";
            before = symbolRemover(before);
            before = NumberFormat.getInstance(Locale.GERMAN).format(Integer.parseInt(before));
            lowerDisplay.setText(before);
        } else {
            lowerDisplay.setText(before + "");
        }
    }

    public void buttonFourAction(ActionEvent actionEvent) {
        String before = lowerDisplay.getText();
        if (before.length() < 9){
            before += "4";
            before = symbolRemover(before);
            before = NumberFormat.getInstance(Locale.GERMAN).format(Integer.parseInt(before));
            lowerDisplay.setText(before);
        } else {
            lowerDisplay.setText(before + "");
        }
    }

    public void buttonFiveAction(ActionEvent actionEvent) {
        String before = lowerDisplay.getText();
        if (before.length() < 9){
            before += "5";
            before = symbolRemover(before);
            before = NumberFormat.getInstance(Locale.GERMAN).format(Integer.parseInt(before));
            lowerDisplay.setText(before);
        } else {
            lowerDisplay.setText(before + "");
        }
    }

    public void buttonSixAction(ActionEvent actionEvent) {
        String before = lowerDisplay.getText();
        if (before.length() < 9){
            before += "6";
            before = symbolRemover(before);
            before = NumberFormat.getInstance(Locale.GERMAN).format(Integer.parseInt(before));
            lowerDisplay.setText(before);
        } else {
            lowerDisplay.setText(before + "");
        }
    }

    public void buttonSevenAction(ActionEvent actionEvent) {
        String before = lowerDisplay.getText();
        if (before.length() < 9){
            before += "7";
            before = symbolRemover(before);
            before = NumberFormat.getInstance(Locale.GERMAN).format(Integer.parseInt(before));
            lowerDisplay.setText(before);
        } else {
            lowerDisplay.setText(before + "");
        }
    }

    public void buttonEightAction(ActionEvent actionEvent) {
        String before = lowerDisplay.getText();
        if (before.length() < 9){
            before += "8";
            before = symbolRemover(before);
            before = NumberFormat.getInstance(Locale.GERMAN).format(Integer.parseInt(before));
            lowerDisplay.setText(before);
        } else {
            lowerDisplay.setText(before + "");
        }
    }

    public void buttonNineAction(ActionEvent actionEvent) {
        String before = lowerDisplay.getText();
        if (before.length() < 9){
            before += "9";
            before = symbolRemover(before);
            before = NumberFormat.getInstance(Locale.GERMAN).format(Integer.parseInt(before));
            lowerDisplay.setText(before);
        } else {
            lowerDisplay.setText(before + "");
        }
    }

    public void buttonZeroAction(ActionEvent actionEvent){
        String before = lowerDisplay.getText();
        if (before.length() < 9){
            before += "0";
            before = symbolRemover(before);
            before = NumberFormat.getInstance(Locale.GERMAN).format(Integer.parseInt(before));
            lowerDisplay.setText(before);
        } else {
            lowerDisplay.setText(before + "");
        }
    }

    public void buttonComaAction(ActionEvent actionEvent){
        String before = lowerDisplay.getText();
        if (before.length() < 8){
            if (before.contains(",")){
                lowerDisplay.setText(before + "");
            } else {
                lowerDisplay.setText(before + ",");
            }

        } else {
            lowerDisplay.setText(before + "");
        }
    }

    public String symbolRemover (String text){
        List<String> array = new ArrayList<>(List.of(text.split("")));
        array.removeIf(a -> Objects.equals(a, "+") || Objects.equals(a, "-") || Objects.equals(a, "=")|| Objects.equals(a, " ") || Objects.equals(a, "/") || Objects.equals(a, "*") || Objects.equals(a, "%") || Objects.equals(a, "."));
        String result = String.join("", array);
        return result;
    }


    public void buttonEraseAction(ActionEvent actionEvent) {
        lowerDisplay.clear();
        upperDisplay.clear();
    }

    public void buttonEraseLower(ActionEvent actionEvent) {
        lowerDisplay.clear();

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

    private void checkZeroAndSet(double result, String operator){
        if (String.valueOf(result).endsWith(",0")){
            upperDisplay.setText(NumberFormat.getInstance(Locale.GERMAN).format(Math.round(result)) + operator);
            lowerDisplay.clear();
        } else {
            upperDisplay.setText(NumberFormat.getInstance(Locale.GERMAN).format(result) + operator);
            lowerDisplay.clear();
        }
    }

    private void checkZeroAndSet(double result){
        if (String.valueOf(result).endsWith(",0")){
            upperDisplay.setText(NumberFormat.getInstance(Locale.GERMAN).format(Math.round(result)));
            lowerDisplay.clear();
        } else {
            upperDisplay.setText(NumberFormat.getInstance(Locale.GERMAN).format(Math.round(result)));
            lowerDisplay.clear();
        }
    }


    public double calculator(double a, double b, String operator){
        if (Objects.equals(operator, "-")){
            return a-b;
        }else if (Objects.equals(operator, "+")){
            return a+b;
        }else if (Objects.equals(operator, "*")){
            return a*b;
        } else{
            return a/b;
        }

    }

    public boolean previousCalc(String operator) {

        if (upperDisplay.getText().lastIndexOf("-") > 0 && !Objects.equals(operator, "-")){
            checkZeroAndSet(calculator(getUpperNumber(), getLowerNumber(), "-"), operator);
            return true;
        } else if (upperDisplay.getText().lastIndexOf("+") > 0 && !Objects.equals(operator, "+")) {
            checkZeroAndSet(calculator(getUpperNumber(), getLowerNumber(), "+"), operator);
            return true;
        } else if (upperDisplay.getText().lastIndexOf("*") > 0 && !Objects.equals(operator, "*")) {
            checkZeroAndSet(calculator(getUpperNumber(), getLowerNumber(), "*"), operator);
            return true;
        } else if (upperDisplay.getText().lastIndexOf("/") > 0 && !Objects.equals(operator, "/")) {
            checkZeroAndSet(calculator(getUpperNumber(), getLowerNumber(), "/"), operator);
            return true;
        }
        return false;
    }

    public boolean firstPut(String operator){
        if (upperDisplay.getText().length() == 0){
            checkZeroAndSet(getLowerNumber(), operator);
            return true;
        }
        return false;

    }



}