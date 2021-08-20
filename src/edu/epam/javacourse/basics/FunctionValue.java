package edu.epam.javacourse.basics;

public class FunctionValue {
    public static void main(String[] args) {
        FunctionValue value = new FunctionValue();
        double result = value.functionValue(0);
        System.out.println(result);
    }

    double functionValue(double x) {
        double result;
        if (x <= 3) {
            result = Math.round((x * x - 3 * x + 9) * 10000d) / 10000d;
        } else {
            result = Math.round((1 / (Math.pow(x, 3) + 6)) * 10000d) / 10000d;
        }
        return result;
    }
}
