package edu.epam.javacourse.basics;

import edu.epam.javacourse.basics.NonLinearFunction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class NonLinearFunctionTest {
    NonLinearFunction function = new NonLinearFunction();

    @Test
    public void standardInputsTest() {
        assertEquals(9.012345679, function.nonLinearFunction(1, 9, 0), 0.0001);
    }

    @Test
    void invalidInputsTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            function.nonLinearFunction(0, 0, 0);
        });
    }

    @Test
    void invalidRootExpression() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            function.nonLinearFunction(-2, 1, 3);
        });
    }
}