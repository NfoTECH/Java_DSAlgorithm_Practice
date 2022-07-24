package Threading;

import java.util.ArrayList;
import java.util.List;

public final class IntPrinter {
    public static void main(String[] args) throws Exception{
        if (args.length != 1) {
            System.out.println("Usage: Main <number of threads>");
            return;
        }
        int n = Integer.parseInt(args[0]);
        List <Thread> threads = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            threads.add(new Thread(new IntRunner(i)));
        }
        for (Thread thread : threads) thread.start();
        for (Thread thread : threads) thread.join();
    }

    public static final class IntRunner implements Runnable {
        private final int value;
        IntRunner(int value) {
            this.value = value;
        }

        @Override
        public void run() {
            System.out.println("Thread #" + Thread.currentThread().getId() + " printed " + value);
        }
    }
}
