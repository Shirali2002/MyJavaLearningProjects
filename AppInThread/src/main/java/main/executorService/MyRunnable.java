package main.executorService;

public class MyRunnable implements Runnable {

    private int index;

    public MyRunnable(int index) {
        this.index = index;
    }

    @Override
    public void run() {
        System.out.println(index + "The method started and will wait for 3 seconds..");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("The method is over..");
    }

}
