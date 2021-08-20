package edu.epam.javacourse.basics;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;

class SeriesSumTest {
    SeriesSum seriesSum = new SeriesSum();

    @Test
    void seriesSumCase1() {
        double e = 0.1;
        assertEquals(BigDecimal.valueOf(1.3564814815), seriesSum.seriesSum(e).setScale(10, RoundingMode.HALF_UP));
    }

    @Test
    void seriesSumCase2() {
        double e = 0.001;
        assertEquals(BigDecimal.valueOf(1.4980214724), seriesSum.seriesSum(e).setScale(10, RoundingMode.HALF_UP));
    }

    @Test
    void seriesNumber1() {
        assertEquals(BigDecimal.valueOf(0.8333333333), seriesSum.seriesNumber(1).setScale(10, RoundingMode.HALF_UP));
    }

    @Test
    void seriesNumber5() {
        assertEquals(BigDecimal.valueOf(0.0353652263), seriesSum.seriesNumber(5).setScale(10, RoundingMode.HALF_UP));
    }
}