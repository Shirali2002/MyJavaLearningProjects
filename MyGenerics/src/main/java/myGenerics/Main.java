/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myGenerics;

/**
 *
 * @author Shireli
 */
public class Main {

    public static void main(String[] args) {
        Container<User> container = new Container<User>(new User()); // Raw Type, Type Erasure
        doSomething(container);
        // Compile time type safety.
    }

    public static void doSomething(Container<User> container) {
        User u = container.doItAndReturn();
        System.out.println("u= " + u);
    }
}
