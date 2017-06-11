import calculator.CalculatorModel;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Adam on 11/06/2017.
 */
public class CalculatorOperationTest {

    CalculatorModel calculatorModel;
    double accuracy;

    @Before
    public void before(){
        calculatorModel = new CalculatorModel();
        accuracy = calculatorModel.getAccuracy();
    }

    @Test
    public void testCanAdd(){
        calculatorModel.performOperation(1, 2, "plus");
        Assert.assertEquals(3, calculatorModel.getResult(), accuracy);
    }

    @Test
    public void testCanSubtract(){
        calculatorModel.performOperation(1, 2, "minus");
        Assert.assertEquals(-1, calculatorModel.getResult(), accuracy);
    }

    @Test
    public void testCanMultiply(){
        calculatorModel.performOperation(1, 2, "times");
        Assert.assertEquals(2, calculatorModel.getResult(), accuracy);
    }

    @Test
    public void testCanDivide(){
        calculatorModel.performOperation(1, 2, "divide");
        Assert.assertEquals(0.5, calculatorModel.getResult(), accuracy);
    }

}
