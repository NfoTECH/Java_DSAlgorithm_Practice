package arrays;

import java.util.ArrayList;

public class HorizontalBar {
    public static String graphs (ArrayList<Integer> nums) {
        String str = "*";
        String result = "";
        for (int num : nums) {
            result = result + str.repeat(num) + "\n";
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        System.out.println(graphs(arr));
    }
}
