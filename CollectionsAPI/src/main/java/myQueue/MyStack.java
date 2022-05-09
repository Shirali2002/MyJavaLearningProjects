package myQueue;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<String> queue = new Stack<>();
        queue.add("Fariz");
        queue.add("Rauf");
        queue.add("Samir");

//        queue.peek();
        queue.pop();
        for (String s : queue) {
            System.out.println(s);
        }
    }
}
