package edu.epam.javacourse.basics;

import java.util.regex.Pattern;

public class ChangeNumberParts {
    public static void main(String[] args) {
        ChangeNumberParts changeParts = new ChangeNumberParts();
        double result = changeParts.changeNumberParts(123.021);
        System.out.println(result);
    }

    double changeNumberParts(double n) {
        String input = String.valueOf(n);
        validateinputParameter(input);
        String[] numberParts = input.split("\\.", 2);
        String output = Integer.valueOf(numberParts[1]) + "." + Integer.valueOf(numberParts[0]);
        return Double.valueOf(output);
    }

    private void validateinputParameter(String input) {
        if (!Pattern.matches("\\d{3}.\\d{3}", input)) {
            throw new IllegalArgumentException("Incorrect input: the number should be in the form xxx.xxx.");
        }
    }
}
