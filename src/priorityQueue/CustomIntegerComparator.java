package priorityQueue;

import java.util.PriorityQueue;
import java.util.Comparator;

public class CustomIntegerComparator implements Comparator<Integer>{
    public static void main(String[] args) {
        PriorityQueue<Integer> testIntegersPQ = new PriorityQueue<>(new CustomIntegerComparator());
        testIntegersPQ.add(11);
        testIntegersPQ.add(5);
        testIntegersPQ.add(-1);
        testIntegersPQ.add(12);
        testIntegersPQ.add(6);

        while(!testIntegersPQ.isEmpty()) {
            System.out.println(testIntegersPQ.poll());
        }
    }


    @Override
    public int compare(Integer o1, Integer o2) {
        //return o1 < o2 ? 1 : -1;
        if (o1 < o2) return 1; //Prints result in descending order
        else return -1;
    }
}
