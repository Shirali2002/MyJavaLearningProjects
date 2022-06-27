package main;

import myPatterns.creationalPatterns.singletonPattern.SingletonClass;

public class Main {
//    public static void main(String[] args) {
//        new BuilderClass.Builder(1,5).demir(67).protein(9).build();
//    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            SingletonClass mySingleton = SingletonClass.getSingleton();
        }
    }

}