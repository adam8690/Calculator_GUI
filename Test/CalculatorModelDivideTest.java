/**
 * Created by Adam on 06/06/2017.
 */

import calculator.CalculatorModel;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorModelDivideTest {

    CalculatorModel calculatorModel;
    double accuracy;

    @Before
    public void before(){
        calculatorModel = new CalculatorModel();
        accuracy = calculatorModel.getAccuracy();
    }

    @Test
    public void testCanDivideTwoIntegers(){
        calculatorModel.divide(1, 2);
        Assert.assertEquals(0.5, calculatorModel.getResult(), accuracy);
    }

    @Test
    public void testCanDivideTwoDecimals(){
        calculatorModel.divide(1.23, 4.56);
        Assert.assertEquals(0.2697368421, calculatorModel.getResult(), accuracy);
    }

    @Test
    public void testCanDivideNegativeIntegers(){
        calculatorModel.divide(-1, 2);
        Assert.assertEquals(-0.5, calculatorModel.getResult(), accuracy);
        calculatorModel.divide(1, -2);
        Assert.assertEquals(-0.5, calculatorModel.getResult(), accuracy);
        calculatorModel.divide(-3, -2);
        Assert.assertEquals(1.5, calculatorModel.getResult(), accuracy);
    }

    @Test
    public void testCanDivideNegativeDecimals(){
        calculatorModel.divide(-1.444, 3.666);
        Assert.assertEquals(-0.3938897981, calculatorModel.getResult(), accuracy);
        calculatorModel.divide(1.444, -3.666);
        Assert.assertEquals(-0.3938897981, calculatorModel.getResult(), accuracy);
        calculatorModel.divide(-1.444, -3.666);
        Assert.assertEquals(0.3938897981, calculatorModel.getResult(), accuracy);
    }
    
}
