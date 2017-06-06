package calculator;

/**
 * Created by Adam on 06/06/2017.
 */
public class CalculatorModel {

    float firstNum;
    float secondNum;
    private float result;

    public float getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(float firstNum) {
        this.firstNum = firstNum;
    }

    public float getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(float secondNum) {
        this.secondNum = secondNum;
    }

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }

    public void add(float firstNum, float secondNum){
        this.result = firstNum + secondNum;
    }

}
