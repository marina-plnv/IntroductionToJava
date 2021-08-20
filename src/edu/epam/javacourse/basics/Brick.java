package edu.epam.javacourse.basics;

import java.util.Arrays;

public class Brick {

    public static void main(String[] args) {
        Brick brick = new Brick();
        float x = 6;
        float y = 4;
        float z = 10;
        float a = 6;
        float b = 2;
        brick.checkBrick(x, y, z, a, b);
    }

    void checkBrick(float x, float y, float z, float a, float b) {
        float[] dimensions = {x, y, z};
        Arrays.sort(dimensions);
        if (dimensions[0] <= Math.min(a, b) && dimensions[1] <= Math.max(a, b)) {
            System.out.println("The brick could be inserted into the gap.");
        } else {
            System.out.println("The brick is too big for this gap.");
        }
    }
}
