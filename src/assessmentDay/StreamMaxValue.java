package assessmentDay;

import java.util.*;

// FIND THE MAXIMUM VALUE FROM A LIST OF INTEGERS USING STREAM API

public class StreamMaxValue {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(111, 2, 3, 4, 5, 6, 7, 8, 9, 15);

        int max = list.stream().mapToInt(i -> i).max().getAsInt();
        System.out.println(max);

        //OR

        OptionalInt max2 = list.stream().mapToInt(Integer::intValue).max();
        System.out.println(max2.getAsInt());

        //OR

        Optional<Integer> max3 = list.stream().max(Comparator.naturalOrder());
        System.out.println(max3.get());
    }
}
