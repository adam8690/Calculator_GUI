package calculator;

import javafx.event.ActionEvent;

public class CalculatorController {

    double firstNum;
    double secondNum;
    String operator;

    public void handleClearClick(ActionEvent event){
        System.out.println("clear clicked");
    }

    public void handleOneClicked(){
        this.firstNum = 1;
        System.out.println("firstNum" + firstNum);
    }

}
