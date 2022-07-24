package arrays;

import java.util.Arrays;

public class DescendingSort {
    private static int [] descendingArray (int[] array) {
        Arrays.sort(array);
        int[] descArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            descArray[i] = array[(array.length - 1) - i];
        }
        return descArray;
    }



    public static void main(String[] args) {
        System.out.println((Arrays.toString(descendingArray(new int[]{1, 2, 3, 4, 5, 6}))));
    }
}
