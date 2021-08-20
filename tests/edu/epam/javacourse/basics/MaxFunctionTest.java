package edu.epam.javacourse.basics;

import edu.epam.javacourse.basics.MaxFunction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class MaxFunctionTest {
    MaxFunction function = new MaxFunction();

    @Test
    void equalParameters() {
        assertEquals(3.0, function.maxFunction(3, 3, 3, 3), 0.0001);
    }

    @Test
    void differentParameters() {
        assertEquals(6.0, function.maxFunction(1, 5, 6, 8), 0.0001);
    }
}