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

    @Before
    public void before(){
        calculatorModel = new CalculatorModel();
    }

    @Test
    public void testCanAddTwoNumbers(){
        float result = calculatorModel.add(1, 2);
        Assert.assertEquals(3, result);
    }



}
