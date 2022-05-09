package myQueue;

import java.util.PriorityQueue;

public class MyPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.offer("Fariz");
        queue.offer("Rauf");
        queue.offer("Samir");

//        queue.peek();
        queue.poll();
        for (String s : queue) {
            System.out.println(s);
        }
    }
}
