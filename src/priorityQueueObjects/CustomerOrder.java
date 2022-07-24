package priorityQueueObjects;

public class CustomerOrder implements Comparable<CustomerOrder> {
    private int orderId;
    private double orderAmount;
    private String customerName;

    public CustomerOrder(int orderId, double orderAmount, String customerName) {
        this.orderId = orderId;
        this.orderAmount = orderAmount;
        this.customerName = customerName;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    //Sorting based on descending order of the orderId
    @Override
    public int compareTo(CustomerOrder o) {
        if (o.orderId > this.orderId) return 1;
        else return -1;
    }

    @Override
    public String toString() {
        return "OrderId: " + this.orderId + ", OrderAmount: " + this.orderAmount + ", CustomerName: " + customerName;
    }
}
