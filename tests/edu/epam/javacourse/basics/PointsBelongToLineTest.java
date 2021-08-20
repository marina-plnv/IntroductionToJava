package edu.epam.javacourse.basics;

import edu.epam.javacourse.basics.PointsBelongToLine;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class PointsBelongToLineTest {
    PointsBelongToLine point = new PointsBelongToLine();

    @Test
    void allPointsBelongToLineCase1() {
        assertEquals(true, point.pointsBelongToLine(0, 3, 4, 3, 6, 3));
    }

    @Test
    void allPointsBelongToLineCase2() {
        assertEquals(true, point.pointsBelongToLine(1, -3, 1, 2, 1, 4));
    }

    @Test
    void allPointsBelongToLineCase3() {
        assertEquals(true, point.pointsBelongToLine(-1, -1, 1, 1, 4, 4));
    }

    @Test
    void PointsDoesNotBelongToLine() {
        assertEquals(false, point.pointsBelongToLine(-1, -1, 1, 1, 3, 8));
    }
}