package edu.epam.javacourse.basics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertEquals;

class LinearFunctionTest {
    LinearFunction function = new LinearFunction();

    @Test
    public void standardInputsTest() {
        assertEquals(3.56, function.linearFunction(2.1, 3.2, 5.0), 0.0001);
        assertEquals(0, function.linearFunction(0, 0, 0), 0.0001);
    }
}