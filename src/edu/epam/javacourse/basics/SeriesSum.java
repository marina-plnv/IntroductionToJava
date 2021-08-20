package edu.epam.javacourse.basics;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class SeriesSum {
    public static void main(String[] args) {
        SeriesSum series = new SeriesSum();
        BigDecimal result = series.seriesSum(0.1);
        System.out.println(result);
    }

    BigDecimal seriesSum(double e) {
        BigDecimal sum = BigDecimal.valueOf(0);
        int n = 1;
        int comparison = seriesNumber(n).compareTo(BigDecimal.valueOf(e));
        while (comparison == 1 || comparison == 0) {
            sum = sum.add(seriesNumber(n));
            n += 1;
            comparison = seriesNumber(n).compareTo(BigDecimal.valueOf(e));
        }
        return sum.setScale(10, RoundingMode.HALF_UP);
    }

    BigDecimal seriesNumber(int n) {
        validateInputParameter(n);
        BigDecimal number = BigDecimal.valueOf(1 / (Math.pow(2, n)) + 1 / (Math.pow(3, n)));
        return number;
    }

    private void validateInputParameter(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("The input parameter should be a positive integer.");
        }
    }
}
