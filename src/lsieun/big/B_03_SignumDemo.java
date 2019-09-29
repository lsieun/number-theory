package lsieun.big;

import java.math.BigInteger;

public class B_03_SignumDemo {
    public static void main(String[] args) {
        //-1 for values < 0
        System.out.println("signum for -15: "+ new BigInteger("-15").signum());
        //0 for value 0
        System.out.println("signum for   0: "+ new BigInteger("0").signum());
        //1 for values > 0
        System.out.println("signum for  25: "+ new BigInteger("25").signum());
    }
}
