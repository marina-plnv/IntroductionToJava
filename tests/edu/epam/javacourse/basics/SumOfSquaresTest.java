package edu.epam.javacourse.basics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfSquaresTest {
    SumOfSquares sum = new SumOfSquares();

    @Test
    void inputParameter3() {
        assertEquals(14, sum.sumOfSquares(3));
    }

    @Test
    void inputParameter10() {
        assertEquals(385, sum.sumOfSquares(10));
    }
}