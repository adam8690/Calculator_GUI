/**
 * Created by Adam on 06/06/2017.
 */

import calculator.CalculatorModel;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorModelMultiplyTest {
    CalculatorModel calculatorModel;
    double accuracy;

    @Before
    public void before(){
        calculatorModel = new CalculatorModel();
        accuracy = calculatorModel.getAccuracy();
    }

    @Test
    public void testCanMultiplyTwoIntegers(){
        calculatorModel.multiply(1, 2);
        Assert.assertEquals(2, calculatorModel.getResult(), accuracy);
    }

    @Test
    public void testCanMultiplyTwoDecimals(){
        calculatorModel.multiply(1.23, 4.56);
        Assert.assertEquals(5.6088, calculatorModel.getResult(), accuracy);
    }

    @Test
    public void testCanMultiplyNegativeIntegers(){
        calculatorModel.multiply(-1, 2);
        Assert.assertEquals(-2, calculatorModel.getResult(), accuracy);
        calculatorModel.multiply(1, -2);
        Assert.assertEquals(-2, calculatorModel.getResult(), accuracy);
        calculatorModel.multiply(-3, -2);
        Assert.assertEquals(6, calculatorModel.getResult(), accuracy);
    }

    @Test
    public void testCanMultiplyNegativeDecimals(){
        calculatorModel.multiply(-1.444, 3.666);
        Assert.assertEquals(-5.293704, calculatorModel.getResult(), accuracy);
        calculatorModel.multiply(1.444, -3.666);
        Assert.assertEquals(-5.293704, calculatorModel.getResult(), accuracy);
        calculatorModel.multiply(-1.444, -3.666);
        Assert.assertEquals(5.293704, calculatorModel.getResult(), accuracy);
    }
}
