package lsieun.big;

import java.math.BigInteger;

public class A_03_MultiplyDemo {
    public static void main(String[] args) {
        BigInteger bint = new BigInteger("50");
        BigInteger bintRes = bint.multiply(new BigInteger("30"));
        System.out.println("Result: " + bintRes);
    }
}
