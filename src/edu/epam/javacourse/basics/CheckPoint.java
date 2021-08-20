package edu.epam.javacourse.basics;

public class CheckPoint {
    public static void main(String[] args) {
        CheckPoint checkPoint = new CheckPoint();
        boolean result = checkPoint.checkPoint(3, 4);
        System.out.println(result);
    }

    boolean checkPoint(int x, int y) {
        return (x >= -4 && x <= 4 && y >= -3 && y <= 0 || x >= -2 && x <= 2 && y >= 0 && y <= 4);
    }
}