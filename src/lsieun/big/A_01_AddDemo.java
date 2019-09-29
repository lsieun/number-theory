package lsieun.big;

import java.math.BigInteger;

public class A_01_AddDemo {
    public static void main(String[] args) {
        BigInteger bint = new BigInteger("234");
        BigInteger bintRes = bint.add(new BigInteger("450"));
        System.out.println("Result:" + bintRes);
    }
}
