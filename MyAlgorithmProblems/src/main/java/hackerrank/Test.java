package hackerrank;


import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.*;
import java.lang.Math;

import static java.util.stream.Collectors.toList;


public class Test {

    public static void main(String[] args) {
        myMain();
    }

    public static void myMain() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] strArr = sc.next().split(" ");
            ArrayList<Integer> listArr = new ArrayList<>();


            for (String s : strArr) {
//                System.out.println(s);
                int myi = Integer.parseInt(s);
                listArr.add(myi);
            }
            System.out.println(listArr);

            arr.add(listArr);
        }

//        System.out.println(arr);
        int result = diagonalDifference(arr);

        System.out.println(result);

    }

    public static void bufferedMain() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }


    public static int diagonalDifference(List<List<Integer>> arr) {
        int sum1 = 0;
        int sum2 = 0;
        int n = arr.size();
        for (int i = 0, j = n - 1; i < n; i++, j--) {
            sum1 += arr.get(i).get(i);
            sum2 += arr.get(i).get(j);
        }

        return Math.abs(sum1 - sum2);
    }
}
