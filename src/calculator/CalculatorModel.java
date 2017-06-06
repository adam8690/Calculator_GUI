package calculator;

/**
 * Created by Adam on 06/06/2017.
 */
public class CalculatorModel {

    double firstNum;
    double secondNum;
    private double result;

    public double getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(double firstNum) {
        this.firstNum = firstNum;
    }

    public double getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(double secondNum) {
        this.secondNum = secondNum;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void add(double firstNum, double secondNum){
        this.result = firstNum + secondNum;
    }

}
