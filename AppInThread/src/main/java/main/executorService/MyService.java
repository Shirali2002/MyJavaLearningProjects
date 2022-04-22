package main.executorService;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyService {

    public static void main(String[] args) {

    }

    private static void scheduledThreatPool() {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(2);
        service.schedule(new MyRunnable(1), 2, TimeUnit.SECONDS);
        service.shutdown();

    }

    private static void cachedThreadPool() {
        ExecutorService service1 = new ThreadPoolExecutor(10, 15, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(20));// if we have to define the parameters, we use this one
        ExecutorService service2 = Executors.newCachedThreadPool(); // but if we want to use default parameters, we use this one.

    }

    private static void fixedThreadPool() {
        ExecutorService service = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            service.submit(new MyRunnable(i));//1 thread
        }
        service.shutdown();
    }

    private static void singleThreadExecutor() {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Future f = service.submit(new MyRunnable(1));

        service.submit(new MyRunnable(2));//one more thread
        service.submit(new MyRunnable(3));//one more thread
        service.submit(new MyRunnable(4));//one more thread
        service.submit(new MyRunnable(5));//one more thread

        service.shutdown();

    }

}
