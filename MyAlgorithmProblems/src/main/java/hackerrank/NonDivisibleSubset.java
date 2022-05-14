package hackerrank;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;


public class NonDivisibleSubset {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList());

        int result = nonDivisibleSubset(k, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    public static int nonDivisibleSubset(int k, List<Integer> s) {
        List<List<Integer>> firstFilteredlist = firstFilter(s, k);
        List<Integer> filteredShortList = elementRemover(firstFilteredlist.get(0), firstFilteredlist.get(1), s);

        List<List<Integer>> elementLists = firstThreeElementsFinder(filteredShortList, k);
        List<List<Integer>> resultLists = new ArrayList<>();


        for (List<Integer> elementList: elementLists) {
            List<Integer> myFilteredShortList = new ArrayList<>();
            myFilteredShortList.addAll(filteredShortList);

            for (int elementI: elementList) {
                myFilteredShortList.remove(myFilteredShortList.indexOf(elementI));
            }

            for (int i=0; i<myFilteredShortList.size(); i++){
                boolean checker = isSuitableForList(elementList, myFilteredShortList.get(i), k);
                if (checker){
                    elementList.add(myFilteredShortList.get(i));
                }
            }
            resultLists.add(elementList);


        }


        return maxSizeFinder(resultLists);
    }


    public static int maxSizeFinder(List<List<Integer>> myList){
        Integer maxSize = 0;
        for (List<Integer> list: myList) {
            if (maxSize==0 || list.size()>maxSize){
                maxSize = list.size();
            }
        }

        if (maxSize==0){
            maxSize++;
        }
        return maxSize;
    }

    public static boolean isSuitableForList(List<Integer> elementList, int e, int k){
        for (int element: elementList) {
            if ((element+e) % k == 0){
                return false;
            }
        }
        return true;

    }

    public static List<List<Integer>> firstThreeElementsFinder(List<Integer> list, int k) {
        List<List<Integer>> result = new ArrayList<>();
        for (int c = 0; c < list.size() - 2; c++) {
            for (int v = c + 1; v < list.size() - 1; v++) {
                for (int b = v + 1; b < list.size(); b++) {
                    if (    list.get(c) + list.get(v) % k != 0 &&
                            list.get(c) + list.get(b) % k != 0 &&
                            list.get(v) + list.get(b) % k != 0  ){
                        List<Integer> myList = new ArrayList<>();
                        myList.add(list.get(c));
                        myList.add(list.get(v));
                        myList.add(list.get(b));
                        result.add(myList);
                    }
                }
            }
        }
        return result;
    }


    public static List<List<Integer>> firstFilter(List<Integer> s, int k) {
        List<Integer> listI = new ArrayList<>();
        List<Integer> listJ = new ArrayList<>();

        for (int i = 0; i < s.size() - 1; i++) {
            for (int j = i + 1; j < s.size(); j++) {
                if ((s.get(i) + s.get(j)) % k != 0) {
                    listI.add(i);
                    listJ.add(j);
                }
            }
        }

        List<List<Integer>> myList = new ArrayList<>();
        myList.add(listI);
        myList.add(listJ);

        return myList;
    }


    public static List<Integer> elementRemover(List<Integer> listI, List<Integer> listJ, List<Integer> s) {
        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < s.size(); i++) {
            if (elementCounter(listI, i) + elementCounter(listJ, i) >= 2) {
                myList.add(s.get(i));
            }
        }
        return myList;
    }


    public static int elementCounter(List<Integer> myList, int e) {
        int myCount = 0;
        for (int i : myList) {
            if (i == e) {
                myCount++;
            }
        }
        return myCount;
    }


    public static void printerLists(List<Integer> listI, List<Integer> listJ) {
        for (int i = 0; i < listI.size(); i++) {
            System.out.println(listI.get(i) + " " + listJ.get(i));
        }
    }


}
