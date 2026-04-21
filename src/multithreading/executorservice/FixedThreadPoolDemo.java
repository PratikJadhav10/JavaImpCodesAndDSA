package multithreading.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FixedThreadPoolDemo {
    public static void main(String[] args) throws InterruptedException {
    ExecutorService pool = Executors.newFixedThreadPool(3);

        for(int i = 0; i <= 10; i++ ){
            final  int taskId = i;
            pool.submit(() -> System.out.println("taskId = " + taskId +
                    " executed by " + Thread.currentThread().getName()));
        }
        pool.shutdown();
        pool.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("Done.");
    }
}
