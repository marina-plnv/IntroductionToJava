package Basics;

public class LinearFunction {
    public static void main(String[] args) {
        double a = 2.1;
        double b = 3.2;
        double c = 5.0;
        double z = linearFunction(a, b, c);
        System.out.println("result = " + z);
    }

    static double linearFunction(double a, double b, double c) {
        double z = ((a - 3) * b / 2) + c;
        return z;
    }
}
