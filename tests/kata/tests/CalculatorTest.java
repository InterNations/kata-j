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
        assertEquals(new Float(3.0), calculator.add(1, 2));
    }

    @Test public void addLongs() {
        assertEquals(new Float(3.0), calculator.add(new Long(1), new Long(2)));
    }
}