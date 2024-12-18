package tests;

import com.companyname.core.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        var calculator = new Calculator();
        Assertions.assertEquals(
                8,
                 calculator.sum(5,3),
                "Expected output and current result does not match."
        );
    }

    @Test
    public void testAdditionWithThreeNumbers() {
        var calculator = new Calculator();
        Assertions.assertEquals(
                10,
                calculator.sum(5,3, 2),
                "Expected output and current result does not match."
        );
    }

    @Test
    public void testMultiplication() {
        var calculator = new Calculator();
        Assertions.assertEquals(
                50,
                calculator.multiply(10, 5),
                "Expected output and current result does not match."
        );
    }

    @Test
    public void testMultiplicationWithThreeNumbers() {
        var calculator = new Calculator();
        Assertions.assertEquals(
                250,
                calculator.multiply(10, 5, 5),
                "Expected output and current result does not match."
        );
    }

    @Test
    public void testSubtraction() {
        var calculator = new Calculator();
        Assertions.assertEquals(
                5,
                calculator.subtract(10, 5),
                "Expected output and current result does not match."
        );
    }

    @Test
    public void testSubtractionWithThreeNumbers() {
        var calculator = new Calculator();
        Assertions.assertEquals(
                0,
                calculator.subtract(10, 5, 5),
                "Expected output and current result does not match."
        );
    }

}
