package edu.epam.javacourse.basics;

import java.util.Scanner;

public class SumOfRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        SumOfRange sumOfRange = new SumOfRange();
        int result = sumOfRange.sumOfRange(n);
        System.out.println(result);
    }

    int sumOfRange(int n) {
        validateInputParameter(n);
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    private void validateInputParameter(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Parameter should be a positive integer.");
        }
    }
}
