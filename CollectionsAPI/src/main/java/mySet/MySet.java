package mySet;

import java.util.HashSet;

public class MySet {
    public static void main(String[] args) {
        HashSet<String> mySet = new HashSet<>();
        mySet.add("Ramin");
        mySet.add("Ramin");
        mySet.add("Ramin");
        mySet.add("Rauf");
        mySet.add("Cosqun");
        mySet.add("Cosqun");
        mySet.add("Cosqun");

        for (String s: mySet) {
            System.out.println(s);
        }

    }
}
