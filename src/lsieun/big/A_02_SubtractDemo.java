package lsieun.big;

import java.math.BigInteger;

public class A_02_SubtractDemo {
    public static void main(String[] args) {
        BigInteger bint = new BigInteger("500");
        BigInteger bintRes = bint.subtract(new BigInteger("300"));
        System.out.println("Result: " + bintRes);
    }
}
