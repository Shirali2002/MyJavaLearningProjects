package hackerrank;

import java.io.*;
import java.math.BigInteger;

public class ExtraLongFactorials {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

//        double ans = extraLongFactorials(n);

        BigInteger ans = fact(100);


        System.out.println(ans);

        bufferedReader.close();

    }

//    public static void asd(String... args) {
//        BigInteger fact = fact(100);
//        System.out.println("fact(100) = " + fact);
//        System.out.println("fact(100).longValue() = " + fact.longValue());
//        System.out.println("fact(100).intValue() = " + fact.intValue());
//        int powerOfTwoCount = 0;
//        BigInteger two = BigInteger.valueOf(2);
//        while (fact.compareTo(BigInteger.ZERO) > 0 && fact.mod(two).equals(BigInteger.ZERO)) {
//            powerOfTwoCount++;
//            fact = fact.divide(two);
//        }
//        System.out.println("fact(100) powers of two = " + powerOfTwoCount);
//    }

    public static BigInteger fact(int n) {
        BigInteger result = BigInteger.ONE;
        for (long i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }

//    public static double extraLongFactorials(int n) {
//        double ans = 1;
//        while (n>1){
//            ans*=n;
//            n--;
//        }
//        return ans;
//    }

}
