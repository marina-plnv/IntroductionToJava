package edu.epam.javacourse.basics;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfSquaresTest {
    ProductOfSquares product = new ProductOfSquares();

    @Test
    void inputParameter3() {
        assertEquals(BigInteger.valueOf(36), product.productOfSquares(3));
    }

    @Test
    void inputParameter7() {
        assertEquals(BigInteger.valueOf(25401600), product.productOfSquares(7));
    }

}