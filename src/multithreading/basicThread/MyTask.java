package multithreading.basicThread;

class ThreadRun implements Runnable  {
    @Override
    public void run() {
        System.out.println(
                "Thread name: " + Thread.currentThread().getName()
        );
    }
}
public class MyTask {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadRun());
        Thread t2 = new Thread(new ThreadRun());

        t1.start();
        t2.start();
    }
}