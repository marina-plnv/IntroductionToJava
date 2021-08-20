package edu.epam.javacourse.basics;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class CheckPointTest {
    CheckPoint point = new CheckPoint();

    @Test
    void belongsLowerArea() {
        assertEquals(true, point.checkPoint(-3, -2));
    }

    @Test
    void belongsUpperArea() {
        assertEquals(true, point.checkPoint(1, 3));
    }

    @Test
    void belongsEdge() {
        assertEquals(true, point.checkPoint(-2, 4));
    }

    @Test
    void outOfArea() {
        assertEquals(false, point.checkPoint(4, 3));
    }
}