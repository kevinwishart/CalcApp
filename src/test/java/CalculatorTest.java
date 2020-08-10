import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void add() {
        Assert.assertEquals(calc.add(1, 2), 3);
    }

}