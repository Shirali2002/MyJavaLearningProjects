/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Shireli
 */

public class User implements Comparable<User> {

    public int age;

    public User(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(User o) {
        int result = 0;
        if (o.age == this.age) {
            result = 0;
        } else if (o.age > this.age) {
            result = 1;
        } else if (o.age < this.age) {
            result = -1;
        }
        return result;
    }
}
