package calculator;

/**
 * Created by Adam on 06/06/2017.
 */
public class CalculatorModel {

    private double result;
    private double accuracy = 0.000000001;

    public double getAccuracy() {
        return accuracy;
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

    public void subtract(double firstNum, double secondNum){
        this.result = firstNum - secondNum;
    }

    public void multiply(double firstNum, double secondNum){
        this.result = firstNum * secondNum;
    }



}
