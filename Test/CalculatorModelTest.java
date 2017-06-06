/**
 * Created by Adam on 06/06/2017.
 */

import calculator.CalculatorModel;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class CalculatorModelTest {

    CalculatorModel calculatorModel;
    float accuracy;

    @Before
    public void before(){
        calculatorModel = new CalculatorModel();
        accuracy = 0.000000001f;
    }

    @Test
    public void testCanAddTwoIntegers(){
        calculatorModel.add(1, 2);
        Assert.assertEquals(3, calculatorModel.getResult(), accuracy);
    }

    @Test
    public void testCanAddTwoDecimals(){
        calculatorModel.add(1.23f, 4.56f);
        Assert.assertEquals(5.79f, calculatorModel.getResult(), accuracy);
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

}
