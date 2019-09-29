package lsieun.big;

import java.math.BigInteger;

public class B_04_ModDemo {
    public static void main(String[] args) {
        System.out.println("32 mod 7= " + new BigInteger("32").mod(new BigInteger("7")));
        System.out.println("32 % 7= " + new BigInteger("32").remainder(new BigInteger("7")));

        System.out.println("-32 mod 7= " + new BigInteger("-32").mod(new BigInteger("7")));
        System.out.println("-32 % 7= " + new BigInteger("-32").remainder(new BigInteger("7")));
    }
}
