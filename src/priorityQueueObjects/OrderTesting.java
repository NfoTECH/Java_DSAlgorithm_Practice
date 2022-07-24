package priorityQueueObjects;

import java.util.PriorityQueue;

public class OrderTesting {
    public static void main(String[] args) {
        CustomerOrder nfotech = new CustomerOrder(1, 100.0, "NfoTECH");
        CustomerOrder george = new CustomerOrder(3, 50.0, "George");
        CustomerOrder benneth = new CustomerOrder(2, 300.0, "Benneth");

        //PriorityQueue<CustomerOrder> customerOrders = new PriorityQueue<>(); //Prioritize based on order id
        PriorityQueue<CustomerOrder> customerOrders = new PriorityQueue<>(new CustomerOrderComparator()); //Prioritize based on order amount

        customerOrders.add(nfotech);
        customerOrders.add(george);
        customerOrders.add(benneth);

        while (!customerOrders.isEmpty()) {
            System.out.println(customerOrders.poll());
        }
    }
}
