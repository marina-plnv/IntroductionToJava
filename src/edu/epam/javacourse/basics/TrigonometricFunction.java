package edu.epam.javacourse.basics;

import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.tan;

public class TrigonometricFunction {
    public static void main(String[] args) {
        TrigonometricFunction function = new TrigonometricFunction();
        double x = 1;
        double y = 1.5;
        double result = function.trigonometricFunction(x, y);
        System.out.println(result);
    }

    double trigonometricFunction(double x, double y) {
        double denominator = cos(x) - sin(y);
        validateDenominator(denominator);
        double cosXY = cos(x * y);
        validateCosValue(cosXY);
        double result = Math.round((sin(x) + cos(y)) / denominator * tan(x * y) * 1000d) / 1000d;
        return result;
    }

    private void validateCosValue(double cosXY) {
        if (cosXY == 0) {
            throw new ArithmeticException("Incorrect input parameters: tangent does not exist.");
        }
    }

    private void validateDenominator(double denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero.");
        }
    }
}
