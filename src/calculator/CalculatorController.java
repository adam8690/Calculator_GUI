package calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import static calculator.CalculatorView.*;

public class CalculatorController {

    double firstNum;
    double secondNum;
    String numberToShow = "";
    String operator = "none";
    CalculatorView calculatorView;

//  as this class is specified in FXML file as the controller and the label showing the calculator display has an fxid of display, the variable display here
//  knows it refers to the calculator display.
    @FXML
    Label display;


    public void handleOneClick(){
        this.numberToShow += '1';
        display.setText(this.numberToShow);
    }

    public void handleTwoClick(){
        this.numberToShow += '2';
        display.setText(this.numberToShow);
    }

    public void handleThreeClick(){
        this.numberToShow += '3';
        display.setText(this.numberToShow);
    }

    public void handleFourClick(){
        this.numberToShow += '4';
        display.setText(this.numberToShow);
    }

    public void handleFiveClick(){
        this.numberToShow += '5';
        display.setText(this.numberToShow);
    }

    public void handleSixClick(){
        this.numberToShow += '6';
        display.setText(this.numberToShow);
    }

    public void handleSevenClick(){
        this.numberToShow += '7';
        display.setText(this.numberToShow);
    }

    public void handleEightClick(){
        this.numberToShow += '8';
        display.setText(this.numberToShow);
    }

    public void handleNineClick(){
        this.numberToShow += '9';
        display.setText(this.numberToShow);
    }

    public void handleZeroClick(){
        this.numberToShow += '0';
        display.setText(this.numberToShow);
    }

    public void handlePlusClick(){
        System.out.println("Plus clicked");
    }

    public void handleMinusClick(){
        System.out.println("minus clicked");
    }

    public void handleTimesClick(){
        System.out.println("times clicked");
    }

    public void handleDivideClick(){
        System.out.println("divide clicked");
    }

    public void handlePointClick(){
        this.numberToShow += '.';
        display.setText(this.numberToShow);
    }

    public void handleEqualsClick(){
        System.out.println("Equals clicked");
    }

    public void handleClearClick(){
        this.numberToShow = "";
        display.setText(this.numberToShow);
    }


}
