package edu.epam.javacourse.basics;

import edu.epam.javacourse.basics.ChangeNumberParts;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class ChangeNumberPartsTest {
    ChangeNumberParts changeNumberParts = new ChangeNumberParts();

    @Test
    void fractionPartBeginsWithZero() {
        assertEquals(45.123, changeNumberParts.changeNumberParts(123.045), 0.0001);
    }

    @Test
    void arbitraryDouble() {
        assertEquals(321.123, changeNumberParts.changeNumberParts(123.321), 0.0001);
    }
}