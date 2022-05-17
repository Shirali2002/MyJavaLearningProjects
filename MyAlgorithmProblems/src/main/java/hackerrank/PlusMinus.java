package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        plusMinus(arr);

        bufferedReader.close();
    }

    public static void plusMinus(List<Integer> arr) {
        int positive = 0;
        int negative = 0;
        int zeroes = 0;
        int len = arr.size();

        for (int i: arr) {
            if (i>0){
                positive++;
            } else if (i<0){
                negative++;
            } else {
                zeroes++;
            }
        }

        float positiveAns = (float) positive / len;
        float negativeAns = (float) negative / len;
        float zeroesAns = (float) zeroes / len;



        System.out.println(String.format("%6f", positiveAns));
        System.out.println(String.format("%6f", negativeAns));
        System.out.println(String.format("%6f", zeroesAns));

    }


}
