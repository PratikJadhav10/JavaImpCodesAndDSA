package multithreading.callable;

import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> {
            Thread.sleep(1000);
            return 10 + 20;
        };

        Future<Integer> future = executor.submit(task);

        System.out.println("Doing other work...");
        Integer result = future.get(); // blocks here

        System.out.println("Result: " + result);
        executor.shutdown();
    }
}
