package lsieun.big;

import java.math.BigInteger;
import java.util.Random;

public class D_02_NextProbablePrimeDemo {
    public static void main(String[] args) {
        BigInteger bint = BigInteger.probablePrime(8, new Random());
        System.out.println("Probable Prime Number: " + bint);
        System.out.println("Next Probable Prime Number: " + bint.nextProbablePrime());
    }
}
