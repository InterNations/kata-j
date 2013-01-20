package kata.tests;

import kata.Calculator;
import org.junit.Test;
import org.junit.Before;
import static junit.framework.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before public void createCalculator() {
        calculator = new Calculator();
    }

    @Test public void addIntegers() {
        assertSame(3, calculator.add(1, 2));
    }
}