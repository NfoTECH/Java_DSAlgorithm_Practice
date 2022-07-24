package Threading;

public class HelloWorldThread {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> System.out.print("world!"));
        System.out.print("Hello, ");
        thread.start();
        thread.join();
    }
}
