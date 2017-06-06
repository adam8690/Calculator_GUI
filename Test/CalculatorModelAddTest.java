/**
 * Created by Adam on 06/06/2017.
 */

import calculator.CalculatorModel;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CalculatorModelAddTest {

    CalculatorModel calculatorModel;
    double accuracy;

    @Before
    public void before(){
        calculatorModel = new CalculatorModel();
        accuracy = calculatorModel.getAccuracy();
    }

    @Test
    public void testCanAddTwoIntegers(){
        calculatorModel.add(1, 2);
        Assert.assertEquals(3, calculatorModel.getResult(), accuracy);
    }

    @Test
    public void testCanAddTwoDecimals(){
        calculatorModel.add(1.23, 4.56);
        Assert.assertEquals(5.79, calculatorModel.getResult(), accuracy);
    }

    @Test
    public void testCanAddNegativeIntegers(){
        calculatorModel.add(-1, 2);
        Assert.assertEquals(1, calculatorModel.getResult(), accuracy);
        calculatorModel.add(1, -2);
        Assert.assertEquals(-1, calculatorModel.getResult(), accuracy);
        calculatorModel.add(-3, -2);
        Assert.assertEquals(-5, calculatorModel.getResult(), accuracy);
    }

    @Test
    public void testCanAddNegativeDecimals(){
        calculatorModel.add(-1.444, 3.666);
        Assert.assertEquals(2.222, calculatorModel.getResult(), accuracy);
        calculatorModel.add(1.444, -3.666);
        Assert.assertEquals(-2.222, calculatorModel.getResult(), accuracy);
        calculatorModel.add(-1.444, -3.666);
        Assert.assertEquals(-5.11, calculatorModel.getResult(), accuracy);
    }

}
