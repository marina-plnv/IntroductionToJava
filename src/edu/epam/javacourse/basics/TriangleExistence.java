package edu.epam.javacourse.basics;

public class TriangleExistence {
    public static void main(String[] args) {
        TriangleExistence triangle = new TriangleExistence();
        int alpha = 120;
        int beta = 70;
        String message = triangle.triangleExistence(alpha, beta);
        System.out.println(message);
    }

    String triangleExistence(int alpha, int beta) {
        String message;
        int sumOfAngles = alpha + beta;
        if (alpha <= 0 || beta <= 0 || sumOfAngles >= 180) {
            message = "Triangle does not exist.";
        } else if (sumOfAngles == 90) {
            message = "Triangle exists. It is a right triangle.";
        } else {
            message = "Triangle exists.";
        }
        return message;
    }
}
