package arrays;

import java.util.ArrayList;
import java.util.List;

public class SplitNumInParts {
    public static List<Integer> splitInteger(int num, int parts) {
        ArrayList<Integer> array = new ArrayList<>();

        int value = 0;
        while (parts > 0) {
            value = num / parts;
            num = num - value;
            parts--;
            array.add(value);
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(splitInteger(10, 5));
        System.out.println(splitInteger(10, 2));
        System.out.println(splitInteger(11, 3));
        System.out.println(splitInteger(20, 6));
    }
}
