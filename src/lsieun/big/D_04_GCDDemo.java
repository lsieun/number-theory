package lsieun.big;

import java.math.BigInteger;

public class D_04_GCDDemo {
    public static void main(String[] args) {
        BigInteger bint1 = new BigInteger("24");
        BigInteger bint2 = new BigInteger("40");
        BigInteger bintRes = bint1.gcd(bint2);
        System.out.println("GCD:" + bintRes);
    }
}
