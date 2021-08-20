package edu.epam.javacourse.basics;

import edu.epam.javacourse.basics.FunctionValue;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class FunctionValueTest {
    FunctionValue function = new FunctionValue();

    @Test
    void functionValueCase1() {
        assertEquals(9, function.functionValue(0), 0.0001);
    }

    @Test
    void functionValueCase2() {
        assertEquals(0.0143, function.functionValue(4), 0.0001);
    }
}