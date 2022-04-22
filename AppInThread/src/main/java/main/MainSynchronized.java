//This Main class will use the main.threadSynchronized package 

package main;

/**
 *
 * @author Shireli
 */
public class MainSynchronized {

    public static void main(String[] args) throws InterruptedException {
Thread.activeCount();
        for (int i = 0; i < 100; i++) {
            Thread t = new Thread(new main.threadSynchronized.MyConsumer());
            t.start();
        }
        Thread.sleep(5000);
        System.out.println(main.threadSynchronized.Base.getA());
    }
}
