package lsieun.big;

import java.math.BigInteger;

public class C_01_CompareToDemo {
    public static void main(String[] args) {
        System.out.println(new BigInteger("300").compareTo(new BigInteger("150")));
        System.out.println(new BigInteger("200").compareTo(new BigInteger("350")));
        System.out.println(new BigInteger("140").compareTo(new BigInteger("140")));
    }
}
