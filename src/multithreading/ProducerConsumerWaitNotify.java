package multithreading;

public class ProducerConsumerWaitNotify {

    // ===== Shared Resource =====
    static class SharedResource {
        private int data;
        private boolean hasData = false;

        synchronized void produce(int value) throws InterruptedException {
            while (hasData) {
                wait(); // wait until consumer consumes
            }
            data = value;
            hasData = true;
            System.out.println("Produced: " + value);
            notify(); // notify consumer
        }

        synchronized int consume() throws InterruptedException {
            while (!hasData) {
                wait(); // wait until producer produces
            }
            hasData = false;
            System.out.println("Consumed: " + data);
            notify(); // notify producer
            return data;
        }
    }

    // ===== Producer Thread =====
    static class Producer implements Runnable {
        private final SharedResource resource;

        Producer(SharedResource resource) {
            this.resource = resource;
        }

        @Override
        public void run() {
            try {
                for (int i = 1; i <= 5; i++) {
                    resource.produce(i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    // ===== Consumer Thread =====
    static class Consumer implements Runnable {
        private final SharedResource resource;

        Consumer(SharedResource resource) {
            this.resource = resource;
        }

        @Override
        public void run() {
            try {
                for (int i = 1; i <= 5; i++) {
                    resource.consume();
                    Thread.sleep(800);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    // ===== Main Method =====
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producer = new Thread(new Producer(resource), "Producer-Thread");
        Thread consumer = new Thread(new Consumer(resource), "Consumer-Thread");

        producer.start();
        consumer.start();
    }
}