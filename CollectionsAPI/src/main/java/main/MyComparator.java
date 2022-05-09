package main;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyComparator {

    public static void main(String[] args) {
        Comparator<User> compar = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                User u1 = (User) o1;
                User u2 = (User) o2;
                int result = -999;
                if (u1.age == u2.age) {
                    result = 0;
                } else if (u1.age > u2.age) {
                    result = 1;
                } else if (u1.age < u2.age) {
                    result = -1;
                }
                return result;
            }
        };

        List<User> list = Arrays.asList(new User(3), new User(1), new User(2), new User(5));

        for (User u : list) {
            System.out.println(u.age);
        }

        System.out.println("-----------");

        Collections.sort(list, compar);

        for (User u : list) {
            System.out.println(u.age);
        }

    }
}
