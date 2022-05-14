package hackerrank;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class CompareTheTriplets {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int countA = 0;
        int countB = 0;

        for (int i = 0; i < a.size(); i++){
            if (a.get(i) < b.get(i)){
                countB++;
            } else if (a.get(i) > b.get(i)) {
                countA++;
            }
        }

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(countA);
        myList.add(countB);
        return myList;
    }

}
