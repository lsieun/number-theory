package lsieun.utils;

public class NumberUtils {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        int stop = (int) Math.sqrt(n);

        for (int i = 2; i <= stop; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
