package hackerrank;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.*;

public class ClimbingTheLeaderboard {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int rankedCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ranked = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int playerCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> player = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = climbingLeaderboard(ranked, player);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {

        ArrayList<Integer> ansList = new ArrayList<>();
        int indexList = 0;
        for (int i: player) {
            if(myCounter(player, i)>1 && indexList>player.indexOf(i)){
                ansList.add(ansList.get(player.indexOf(i)));
            } else {
                HashSet<Integer> mySet = new HashSet<>();
                mySet.addAll(ranked);
                mySet.add(i);

                ArrayList<Integer> myList = new ArrayList<>();
                myList.addAll(mySet);
                Collections.sort(myList, Collections.reverseOrder());

                int index = myList.indexOf(i);
                ansList.add(index + 1);
            }
            indexList++;
        }

        return ansList;
    }

    public static int myCounter(List<Integer> myList, int i){
        int count = 0;
        for (int j: myList){
            if (i==j){
                count++;
            }
        }
        return count;
    }
}
