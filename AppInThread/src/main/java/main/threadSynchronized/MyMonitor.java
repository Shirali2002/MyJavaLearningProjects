package main.threadSynchronized;

public class MyMonitor {

    private final Object monitor1 = new Object();
    private final Object monitor2 = new Object();

    public void doIt1() {
        System.out.println("doIt1 started..");
        synchronized (this) {
            System.out.println("doIt1");
        }
        System.out.println("doIt1 ended..");
    }

    public void doIt2() {
        System.out.println("doIt2 started..");
        synchronized (monitor1) {
            System.out.println("doIt2");
        }
        System.out.println("doIt2 ended..");
    }

    public void doIt3() {
        System.out.println("doIt3 started..");
        synchronized (monitor1) {
            System.out.println("doIt3");
        }
        System.out.println("doIt3 ended..");
    }

    public void doIt4() {
        System.out.println("doIt4 started..");
        synchronized (monitor2) {
            System.out.println("doIt4");
        }
        System.out.println("doIt4 ended..");
    }
}
