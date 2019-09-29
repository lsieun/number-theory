package lsieun.big;

import java.math.BigInteger;

public class D_03_IsProbablePrimeDemo {
    public static void main(String[] args) {
        BigInteger bint1 = new BigInteger("195");
        BigInteger bint2 = new BigInteger("197");
        BigInteger bint3 = new BigInteger("190");
        System.out.println("bint1.isProbablePrime(2):" + bint1.isProbablePrime(2));
        System.out.println("bint2.isProbablePrime(2):" + bint2.isProbablePrime(2));
        System.out.println("bint3.isProbablePrime(2):" + bint3.isProbablePrime(2));
        System.out.println("bint3.isProbablePrime(-2):" + bint3.isProbablePrime(-2));
    }
}
