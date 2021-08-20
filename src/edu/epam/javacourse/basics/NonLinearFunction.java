package edu.epam.javacourse.basics;

public class NonLinearFunction {
    public static void main(String[] args) {
        NonLinearFunction nonLinearFunction = new NonLinearFunction();
        double a = 1;
        double b = 9;
        double c = 0;
        double result = nonLinearFunction.nonLinearFunction(a, b, c);
        System.out.println(result);
    }

    double nonLinearFunction(double a, double b, double c) {
        validateInputParameters(a, b, c);
        double rootExpression = Math.pow(b, 2) + 4 * a * c;
        validateRootExpressionResult(rootExpression);
        double result = (b + Math.sqrt(rootExpression)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        return result;
    }

    private void validateRootExpressionResult(double rootExpression) {
        if (rootExpression < 0) {
            throw new ArithmeticException("Incorrect input data: negative value under the square root.");
        }
    }

    private void validateInputParameters(double a, double b, double c) {
        if (a == 0 || b == 0) {
            throw new IllegalArgumentException("Incorrect input data: division by zero.");
        }
    }
}
