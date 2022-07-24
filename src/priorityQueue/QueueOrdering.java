package priorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueOrdering {
    public static void main(String[] args) {
        PriorityQueue<String> testStringsPQ = new PriorityQueue<>();
        testStringsPQ.add("fortune");
        testStringsPQ.add("dozie");
        testStringsPQ.add("precious");
        testStringsPQ.add("benneth");
        testStringsPQ.add("imeh");

        System.out.println("Strings Stored in Natural Ordering in a Priority Queue\n");

        System.out.println("Using Iterator");
        Iterator itr = testStringsPQ.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("\nUsing for loop");
        for (String i : testStringsPQ)
            System.out.println(i);
        System.out.println("peek " +testStringsPQ.peek()); //sees the first member of the queue

        System.out.println("\nUsing poll to empty the queue");
        //Poll with while loop eventually removes all members of queue
        while (!testStringsPQ.isEmpty()) {
            System.out.println(testStringsPQ.poll());
        }
        System.out.println("peek " +testStringsPQ.peek()); //peek here returns null as queue is empty after poll
    }
}
