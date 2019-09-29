package lsieun.big;

import java.math.BigInteger;

public class B_07_ModInverseDemo {
    public static void main(String[] args) {
        BigInteger b1 = new BigInteger("-13");
        BigInteger b2 = new BigInteger("4");
        System.out.println("b1.modInverse(b2): " + b1.modInverse(b2));
    }
}
