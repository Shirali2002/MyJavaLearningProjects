// This Main class will use the main.thread package

package main;

import main.thread.MyConsumer;
import main.thread.MyProducer;

public class Main {

    public static void main(String[] args) {
        Thread p1 = new Thread(new MyProducer());
        Thread p2 = new Thread(new MyProducer());
        Thread m1 = new Thread(new MyConsumer("one"));
        Thread m2 = new Thread(new MyConsumer("two"));
        Thread m3 = new Thread(new MyConsumer("three"));
        Thread m4 = new Thread(new MyConsumer("four"));
        Thread m5 = new Thread(new MyConsumer("five"));
        Thread m6 = new Thread(new MyConsumer("six"));

        p1.start();
        p2.start();
        m1.start();
        m2.start();
        m3.start();
        m4.start();
        m5.start();
        m6.start();
    }
}
