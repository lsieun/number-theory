package lsieun.big;

import java.math.BigInteger;

public class A_05_RemainderDemo {
    public static void main(String[] args) {
        int a = 500;
        int b = 28;
        BigInteger bint = new BigInteger(String.valueOf(a));
        BigInteger bintRes = bint.remainder(new BigInteger(String.valueOf(b)));
        System.out.println("a % b: " + bintRes);
    }
}
