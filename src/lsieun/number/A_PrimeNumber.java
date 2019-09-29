package lsieun.number;

import java.util.Scanner;

public class A_PrimeNumber {

    public static void main(String[] args) {
        //testInputValue();
        testRange(100, 200);

    }

    public static void testInputValue() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = s.nextInt();
        if (isPrime(n)) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }

    public static void testRange(int start, int stop) {
        for (int i=start; i<=stop; i++) {
            boolean flag = isPrime(i);
            if (flag) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
