package lsieun.big;

import java.math.BigInteger;

public class C_03_MinMaxDemo {
    public static void main(String[] args) {
        System.out.println("Min: " + new BigInteger("300").min(new BigInteger("150")));
        System.out.println("Max: " + new BigInteger("300").max(new BigInteger("150")));
    }
}
