package edu.epam.javacourse.basics;

public class PointsBelongToLine {
    public static void main(String[] args) {
        PointsBelongToLine points = new PointsBelongToLine();
        boolean result = points.pointsBelongToLine(0, 3, 4, 3, 6, 3);
        System.out.println(result);
    }

    boolean pointsBelongToLine(int x1, int y1, int x2, int y2, int x3, int y3) {
        boolean result = (y3 - y1) * (x2 - x1) - (y2 - y1) * (x3 - x1) == 0;
        return result;
    }
}
