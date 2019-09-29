package lsieun.big;

import java.math.BigInteger;

public class B_06_ModPowDemo {
    public static void main(String[] args) {
        BigInteger b = new BigInteger("-2");
        BigInteger e = new BigInteger("3");
        BigInteger m = new BigInteger("5");
        BigInteger res = b.modPow(e, m);
        System.out.println("b.modPow(e, m): " + res);
        //The result is equivalent to below code
        System.out.println("b.pow(e.intValue()).mod(m): " + b.pow(e.intValue()).mod(m));
    }
}
