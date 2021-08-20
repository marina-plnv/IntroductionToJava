package edu.epam.javacourse.basics;

import java.math.BigInteger;

public class ProductOfSquares {
    public static void main(String[] args) {
        ProductOfSquares product = new ProductOfSquares();
        BigInteger result = product.productOfSquares(200);
        System.out.println(result);
    }

    BigInteger productOfSquares(int N) {
        validateInputParameter(N);
        BigInteger product = BigInteger.valueOf(1);
        for (int i = 1; i <= N; i++) {
            product = product.multiply(BigInteger.valueOf(i * i));
        }
        return product;
    }

    private void validateInputParameter(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("The input parameter should be a positive integer.");
        }
    }
}
