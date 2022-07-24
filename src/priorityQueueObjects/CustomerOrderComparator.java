package priorityQueueObjects;

import java.util.Comparator;

public class CustomerOrderComparator implements Comparator<CustomerOrder> {
    @Override
    public int compare(CustomerOrder o1, CustomerOrder o2) {
        if (o1.getOrderAmount() < o2.getOrderAmount()) return 1;
        else return -1;
    }
}
