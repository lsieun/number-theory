package lsieun.big;

import java.math.BigInteger;

public class A_06_DivideAndRemainderDemo {
    public static void main(String[] args) {
        int a = 597;
        int b = 20;
        BigInteger bint = new BigInteger(String.valueOf(a));
        BigInteger[] bintRes = bint.divideAndRemainder(new BigInteger(String.valueOf(b)));
        System.out.println("a/b: " + bintRes[0]);
        System.out.println("a % b: " + bintRes[1]);
    }
}
