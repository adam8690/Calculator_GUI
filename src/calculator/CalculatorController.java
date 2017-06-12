package calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CalculatorController {

    Double firstNum;
    Double secondNum;
    Double result;
    String numberToShow = "";
    String operator;
    Boolean decimal = false;
    Boolean inputIsPositive = true;
    CalculatorView calculatorView = new CalculatorView();
    CalculatorModel calculatorModel = new CalculatorModel();

//  as this class is specified in FXML file as the controller and the label showing the calculator display has an fxid of display, the variable display here
//  knows it refers to the calculator display.
    @FXML
    Label display;

    public void clearDisplay(){
        this.numberToShow = "";
        this.decimal = false;
        this.result = null;
        display.setText("0");
    }

    public void performOperation(){
        if(this.firstNum == null){
            this.firstNum = Double.parseDouble(display.getText());

            if (this.firstNum == 0.0){
                display.setText("No number entered");
            }
            else clearDisplay();
        }
        else {
            this.secondNum = Double.parseDouble(display.getText());
            clearDisplay();
            calculatorModel.performOperation(this.firstNum, this.secondNum, this.operator);

            this.result = calculatorModel.getResult();
            displayNumber(this.result);
            this.firstNum = this.result;
            this.secondNum = null;
        }
    }

    public void displayNumber(Double number){
        String numberString = number.toString();

//        remove trailing zeros from answer
        int i = numberString.length() - 1;
        char lastDigit = numberString.charAt(i);
        while(i >= 0 && lastDigit == '0'){
            i--;
            lastDigit = numberString.charAt(i);
        }
        if (lastDigit == '.'){
        i--;
        }
        this.numberToShow = numberString.substring(0, i + 1);
        display.setText(this.numberToShow);
    }

    public void handleOneClick(){
        if(this.result != null){
            clearDisplay();
        }
        this.numberToShow += "1";
        display.setText(this.numberToShow);
    }

    public void handleTwoClick(){
        if(this.result != null){
            clearDisplay();
        }
        this.numberToShow += "2";
        display.setText(this.numberToShow);
    }

    public void handleThreeClick(){
        if(this.result != null){
            clearDisplay();
        }
        this.numberToShow += "3";
        display.setText(this.numberToShow);
    }

    public void handleFourClick(){
        if(this.result != null){
            clearDisplay();
        }
        this.numberToShow += "4";
        display.setText(this.numberToShow);
    }

    public void handleFiveClick(){
        if(this.result != null){
            clearDisplay();
        }
        this.numberToShow += "5";
        display.setText(this.numberToShow);
    }

    public void handleSixClick(){
        if(this.result != null){
            clearDisplay();
        }
        this.numberToShow += "6";
        display.setText(this.numberToShow);
    }

    public void handleSevenClick(){
        if(this.result != null){
            clearDisplay();
        }
        this.numberToShow += "7";
        display.setText(this.numberToShow);
    }

    public void handleEightClick(){
        if(this.result != null){
            clearDisplay();
        }
        this.numberToShow += "8";
        display.setText(this.numberToShow);
    }

    public void handleNineClick(){
        if(this.result != null){
            clearDisplay();
        }
        this.numberToShow += "9";
        display.setText(this.numberToShow);
    }

    public void handleZeroClick(){
        if(this.result != null){
            clearDisplay();
        }
        if(!this.numberToShow.equals("")){
            this.numberToShow += "0";
            display.setText(this.numberToShow);
        }
    }

    public void handlePointClick(){
        if(this.result != null){
            display.setText("Cannot edit decimal");
        }
        else if(!this.decimal && this.numberToShow.equals("") ){
            this.numberToShow = "0.";
            display.setText(this.numberToShow);
            this.decimal = true;
        }
        else if(!this.decimal) {
            this.numberToShow += ".";
            display.setText(this.numberToShow);
            this.decimal = true;
        }

    }

    public void handleClearClick(){
        clearDisplay();
        this.firstNum = null;
        this.secondNum = null;
        this.result = null;
    }

    public void handlePlusClick(){
        this.operator = "plus";
        performOperation();
    }

    public void handleMinusClick(){
        this.operator = "minus";
        performOperation();
    }

    public void handleTimesClick(){
        this.operator = "times";
        performOperation();
    }

    public void handleDivideClick(){
        this.operator = "divide";
        performOperation();
    }

    public void handlePlusMinusClick(){
        if(this.numberToShow == ""){
            display.setText("Enter a number first");
        }
        else if(this.inputIsPositive) {
            this.inputIsPositive = false;
            this.numberToShow = "-" + this.numberToShow;
            display.setText(this.numberToShow);
        }
        else {
            this.numberToShow = display.getText().substring(1);
            display.setText(this.numberToShow);
            this.inputIsPositive = true;
        }
    }

    public void handleEqualsClick(){
        if(this.operator != null) {
            performOperation();
            this.firstNum = null;
            this.secondNum = null;
            this.operator = null;
            displayNumber(this.result);

            if(this.numberToShow.charAt(0) == '-'){
                this.inputIsPositive = false;
            }
            else this.inputIsPositive = true;

            if(this.numberToShow.contains(".")){
                this.decimal = true;
            }
            else this.decimal = false;
        }
    }
}
