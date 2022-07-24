package arrays;

import java.util.Arrays;


public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {2, 4, 1, 2, 1, 2, 4, 5};
        int [] distinct = Arrays.stream(array).distinct().toArray();
        System.out.println(Arrays.toString(distinct));


    }
}
