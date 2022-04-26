/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myGenerics;

/**
 *
 * @author Shireli
 */
public class Container<G> {  // Generic

    private G obj;

    public Container(G obj) {
        this.obj = obj;
    }

    public G doItAndReturn() {
        System.out.println("I did something");
        return this.obj;
    }

    public <T> T doItAndReturn2(T obje) {
        System.out.println("I did something");
        return obje;
    }
}
