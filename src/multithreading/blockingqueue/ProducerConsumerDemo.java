package multithreading.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerDemo {

    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        /*Thread producer = new Thread(new Producer(queue));
        Thread consumer = new Thread(new Consumer(queue));

        consumer.start();
        producer.start();

         */
        for (int i = 1; i <= 2; i++) {
            new Thread(new Producer(queue), "Producer-" + i).start();
        }

        for (int i = 1; i <= 2; i++) {
            new Thread(new Consumer(queue), "Consumer-" + i).start();
        }


    }
}
