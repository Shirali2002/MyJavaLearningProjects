package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    // Builder pattern
    /*
    public static void main(String[] args) {
        new BuilderClass.Builder(1,5).demir(67).protein(9).build();
    }
    */

    // Singleton pattern
    /*
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            SingletonClass mySingleton = SingletonClass.getSingleton();
        }
    }
    */

    // Factory method pattern
    /*
    public static void main(String[] args) {
        Phone s8 = PhoneFactory.getPhone("s8", "3000", 3, 6);
        System.out.println(s8);
    }
    */


    // Abstract Factory pattern
    /*
    public static void main(String[] args) {
        PhoneAbstractFactory noteFactory = FactoryProducer.getFactory("note");
        SamsungPhone note10 = noteFactory.getPhone("note10", "2000", 4, 10);
        System.out.println(note10);
    }
    */


}