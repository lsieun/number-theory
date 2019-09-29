package lsieun.big;

import java.math.BigInteger;

public class B_01_AbsDemo {
    public static void main(String[] args) {
        BigInteger bint1 = new BigInteger("-234");
        System.out.println(bint1.abs());
        BigInteger bint2 = new BigInteger("100");
        System.out.println(bint2.abs());
    }
}
