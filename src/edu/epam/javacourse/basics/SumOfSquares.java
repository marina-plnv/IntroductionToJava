package edu.epam.javacourse.basics;

public class SumOfSquares {
    public static void main(String[] args) {
        SumOfSquares sumOfSquares = new SumOfSquares();
        long result = sumOfSquares.sumOfSquares(100);
        System.out.println(result);
    }

    long sumOfSquares(int n) {
        validateInputParameter(n);
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    private void validateInputParameter(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("The input parameter should be a positive integer.");
        }
    }
}
