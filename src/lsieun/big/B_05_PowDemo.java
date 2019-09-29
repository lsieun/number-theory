package lsieun.big;

import java.math.BigInteger;

public class B_05_PowDemo {
    public static void main(String[] args) {
        int exponent = 5;
        BigInteger bint = new BigInteger("2");
        BigInteger bintRes = bint.pow(exponent);
        System.out.println("Result: " + bintRes);
    }
}
