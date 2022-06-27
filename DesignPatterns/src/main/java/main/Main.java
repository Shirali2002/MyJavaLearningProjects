package main;

import myPatterns.creationalPatterns.abstractFactoryPattern.FactoryProducer;
import myPatterns.creationalPatterns.abstractFactoryPattern.Note10;
import myPatterns.creationalPatterns.abstractFactoryPattern.PhoneAbstractFactory;
import myPatterns.creationalPatterns.abstractFactoryPattern.SamsungPhone;
import myPatterns.creationalPatterns.builderPattern.BuilderClass;
import myPatterns.creationalPatterns.factoryMethodPattern.Phone;
import myPatterns.creationalPatterns.factoryMethodPattern.PhoneFactory;
import myPatterns.creationalPatterns.singletonPattern.SingletonClass;

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