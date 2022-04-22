package main.threadSynchronized;

public class MyConsumer implements Runnable {
    
    @Override
    public void run() {
        System.out.println("i am started and waiting..");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException a) {
        }
        Base.incA();
        
    }
    
}
