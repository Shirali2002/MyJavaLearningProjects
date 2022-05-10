package hackerrank;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int aCopy = a;
        int k = 0;//counter
        while (aCopy > 0) {
            int b = aCopy % 10;
            aCopy /= 10;
            k++;
        }
        Integer[] arr = new Integer[k];
        k = 0;
        while (a > 0) {
            int b = a % 10;
            arr[k] = b;
            a /= 10;
            k++;
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arr[i] + " ");
            } else {
                System.out.print(arr[i]);
            }

        }

    }
}
