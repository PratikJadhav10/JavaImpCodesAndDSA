package multithreading;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {
    public static void main(String[] args) throws Exception {
        CompletableFuture<Integer> future =
                CompletableFuture.supplyAsync(() -> {
                    System.out.println("Running in: " + Thread.currentThread().getName());
                    return 50;
                });

        CompletableFuture<Integer> finalResult =
                future.thenApply(result -> result * 2);

        System.out.println("Main thread free");
        System.out.println("Result = " + finalResult.get());
    }
}
