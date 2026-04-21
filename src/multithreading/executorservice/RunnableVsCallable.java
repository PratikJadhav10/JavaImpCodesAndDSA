package multithreading.executorservice;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.Executors;

public class RunnableVsCallable {
    public static void main(String[] args) throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 3; i++) {
            int id = i;
            pool.submit(() -> System.out.println("Runnable " + id + " on " + Thread.currentThread().getName()));
        }

        List<Future<Integer>> futures = new ArrayList<>();
        int[] nums = {2, 3, 4};
        for (int n : nums) {
            futures.add(pool.submit(() -> n * n));
        }

        for (Future<Integer> f : futures) {
            System.out.println("Callable result: " + f.get());
        }

        pool.shutdown();
    }
}
