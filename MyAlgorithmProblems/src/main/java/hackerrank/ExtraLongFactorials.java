package hackerrank;

import java.io.*;
import java.math.BigInteger;

public class ExtraLongFactorials {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        BigInteger ans = fact(n);
        System.out.println(ans);

        bufferedReader.close();

    }

    public static BigInteger fact(int n) {
        BigInteger result = BigInteger.ONE;
        for (long i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }

}
