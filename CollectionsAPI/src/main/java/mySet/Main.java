package mySet;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Rauf");
        list.add("Rauf");
        list.add("Rauf");
        list.add("Samir");
        list.add("Samir");
        list.add("Samir");
        list.add("Samir");
        list.add("Cosqun");
        list.add("Cosqun");
        Set<String> mySet = new HashSet<>(list);
        for (String s : mySet) {
            System.out.println(s);
        }
    }
}
