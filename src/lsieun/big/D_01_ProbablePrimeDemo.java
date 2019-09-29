package lsieun.big;

import java.math.BigInteger;
import java.util.Random;

public class D_01_ProbablePrimeDemo {
    public static void main(String[] args) {
        BigInteger bint = BigInteger.probablePrime(8, new Random());
        System.out.println("Probable Prime Number: " + bint);
    }
}
