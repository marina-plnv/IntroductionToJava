package edu.epam.javacourse.basics;

public class MaxFunction {
    public static void main(String[] args) {
        MaxFunction maxValue = new MaxFunction();
        double result = maxValue.maxFunction(3, -1, 4, 2);
        System.out.println(result);
    }

    double maxFunction(double a, double b, double c, double d) {
        double result = Math.max(Math.min(a, b), Math.min(c, d));
        return result;
    }
}
