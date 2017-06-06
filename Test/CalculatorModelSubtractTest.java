/**
 * Created by Adam on 06/06/2017.
 */

import calculator.CalculatorModel;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorModelSubtractTest {

    CalculatorModel calculatorModel;
    double accuracy;

    @Before
    public void before(){
        calculatorModel = new CalculatorModel();
        accuracy = calculatorModel.getAccuracy();
    }

    @Test
    public void testCanSubtractTwoIntegers(){
        calculatorModel.subtract(2, 1);
        Assert.assertEquals(1, calculatorModel.getResult(), accuracy);
    }

    @Test
    public void testCanSubtractTwoDecimals(){
        calculatorModel.subtract(4.56, 1.23);
        Assert.assertEquals(3.33, calculatorModel.getResult(), accuracy);
    }

    @Test
    public void testCanSubtractNegativeIntegers(){
        calculatorModel.subtract(-1, 2);
        Assert.assertEquals(-3, calculatorModel.getResult(), accuracy);
        calculatorModel.subtract(1, -2);
        Assert.assertEquals(3, calculatorModel.getResult(), accuracy);
        calculatorModel.subtract(-3, -2);
        Assert.assertEquals(-1, calculatorModel.getResult(), accuracy);
    }

    @Test
    public void testCanSubtractNegativeDecimals(){
        calculatorModel.subtract(-1.444, 3.666);
        Assert.assertEquals(-5.11, calculatorModel.getResult(), accuracy);
        calculatorModel.subtract(1.444, -3.666);
        Assert.assertEquals(5.11, calculatorModel.getResult(), accuracy);
        calculatorModel.subtract(-1.444, -3.666);
        Assert.assertEquals(2.222, calculatorModel.getResult(), accuracy);
    }

}
