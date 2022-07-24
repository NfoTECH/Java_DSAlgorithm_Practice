package priorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class MyPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();

        queue.add("nfotech");
        queue.add("Benneth");
        queue.add("dozie");
        queue.add("imeh");
        queue.add("precious");

        System.out.println("head: " + queue.element()); //Prints the first prioritized element
        System.out.println("head:" + queue.peek()); //Prints the first prioritized element

        System.out.println("\nUsing Iterator to print members");
        Iterator itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next()); //Prints members of the queue
        }
        System.out.println("\nUsing enhanced for loop");
        for (String i : queue)
            System.out.println(i); //Prints members of the queue

        queue.remove(); //Removes the first element
        System.out.println("\nFirst poll()");
        for (String i : queue)
            System.out.println(i); //Prints members of the queue

        queue.poll(); //Also removes the first element
        System.out.println("\nSecond poll()");
        for (String i : queue)
            System.out.println(i); //Prints members of the queue
    }
}
