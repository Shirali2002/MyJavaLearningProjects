package hackerrank;

import java.io.*;
import java.util.*;

public class Test1 {
    public static void main(String[] args) throws IOException {
        run();
    }

    public static void run() throws IOException {
        Scanner in = new Scanner(System.in);
        BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = in.nextInt();
        int k = in.nextInt();

        int[] a = new int[n];
        int[] c = new int[k];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            a[i] = a[i] % k;
            c[a[i]]++;
        }

        int ans = 0;
        ans += (c[0] > 0) ? 1 : 0;//good if 1 exists, cannot be more
        for (int i = 1; i <= k - i; i++) {
            if (i < k - i) {
                ans += Math.max(c[i], c[k - i]);
            } else {//i==k-i
                ans += (c[i] > 0) ? 1 : 0;//not more possible
            }
        }
        log.write("" + ans + "\n");

        log.flush();
    }
}