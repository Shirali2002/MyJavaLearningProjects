package main;

import bean.Student;
import bean.Teacher;

import java.util.HashMap;

/**
 * @author Shireli
 */

public class Main {
    public static void main(String[] args) {
        HashMap<Teacher, Student> hashMap1 = new HashMap<>();

        Teacher t1 = new Teacher(30, "Valeh", "Aliyev", "Math");
        Student s1 = new Student(12, "Ramin", "Arifli", "7a");

        Teacher t2 = new Teacher(33, "Rafiq", "Veliyev", "Physics");
        Student s2 = new Student(13, "Raul", "Quliyev", "7a");

        hashMap1.put(t1, s1);
        hashMap1.put(t2, s2);

        System.out.println("Map: " + hashMap1);

        System.out.println("keys: " + hashMap1.keySet());

        System.out.println("values: " + hashMap1.values());

        Student s3 = hashMap1.get(t1);
        System.out.println(s3);

    }
}
